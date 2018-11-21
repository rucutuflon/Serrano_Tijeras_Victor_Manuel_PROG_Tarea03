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
