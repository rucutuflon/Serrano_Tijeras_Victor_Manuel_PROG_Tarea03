/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 *
 * @author victor
 */
public class Caballo {
    
    private Color color;
    private Posicion posicion;
    
    /**
    * Constructor por defecto que inicializa el caballo de color Negro en la
    * posición 8b.
    */
    public Caballo() {
        this(Color.NEGRO);
        posicion = new Posicion(8, 'b');
    }
    
    /**
    * Constructor a partir de un color, y según el color, se crea la posición.
    * @param color que quiero que tenga el caballo.
    */
    public Caballo(Color color) {

        this.color = color;
        switch (color) {
        case BLANCO:
            posicion = new Posicion(1, 'b');
            break;
        case NEGRO:
            posicion = new Posicion(8, 'b');
            break;
        }
    }
    
    public Caballo(Color color, Posicion posicion) {
        
        this.color = color;
        
        switch (color) {
        case BLANCO:
            posicion = new Posicion(1, 'b');
            break;
        case NEGRO:
            posicion = new Posicion(8, 'g');
            break;
        }
        throw new IllegalArgumentException ("ERROR: Columna inicial no válida.");
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    
}
