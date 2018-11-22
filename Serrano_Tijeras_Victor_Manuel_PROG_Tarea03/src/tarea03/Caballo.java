/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

import java.util.Objects;
import javax.naming.OperationNotSupportedException;

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
    
    public Caballo(Color color, Posicion columna) {
        
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
    
    /**
    * Método que modifica la propiedad posicion en funcion de la dirección 
    * hacia la que se va a mover el rey.
    * @param direccion en la que se va a mover el rey, según la dirección 
    * en la que se mueva, se modifica la fila o columna o ambas de la posición actual.
    */
    public void mover (Direccion direccion) throws OperationNotSupportedException {
        int filaActual = posicion.getFila();
        char columnaActual = posicion.getColumna();
        switch (direccion) {
            case ARRIBA_IZQUIERDA: 
                if (filaActual == 8)
                    throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
                else 
                    posicion.setFila(filaActual+2);
                    posicion.setColumna((char) (columnaActual-1));
                break;
            case ARRIBA_DERECHA:
                if (filaActual == 8 || columnaActual == 'h')
                    throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
                else {
                    posicion.setFila(filaActual+2);
                    posicion.setColumna((char) (columnaActual+1));
                }
                break;
            case DERECHA_ARRIBA:
                if (columnaActual == 'h')
                    throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
                else {
                    posicion.setFila(filaActual+1);
                    posicion.setColumna((char) (columnaActual+2));
                }
                break;
            case DERECHA_ABAJO:
                if (filaActual == 1 || columnaActual == 'h')
                    throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
                else {
                    posicion.setFila(filaActual-1);
                    posicion.setColumna((char) (columnaActual+2));
                }
                break;
            case ABAJO_DERECHA:
                if (filaActual == 1)
                    throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
                else {
                    posicion.setFila((char) (filaActual-2));
                    posicion.setColumna((char) (columnaActual+1));
                }
                break;
            case ABAJO_IZQUIERDA:
                if (filaActual == 1 || columnaActual == 'a')
                    throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
                else {
                    posicion.setFila(filaActual-2);
                    posicion.setColumna((char) (columnaActual-1));
                }
                break;
            case IZQUIERDA_ARRIBA:
                if (columnaActual == 'a')
                    throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
                else {
                    posicion.setFila(filaActual+1);
                    posicion.setColumna((char) (columnaActual-2));
                }
                break;
            case IZQUIERDA_ABAJO:
                if (filaActual == 8 || columnaActual == 'a')
                    throw new OperationNotSupportedException("ERROR: Movimiento no válido.");
                else {
                    posicion.setFila(filaActual-1);
                    posicion.setColumna((char) (columnaActual-2));
                }
            break;
        }
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caballo other = (Caballo) obj;
        if (this.color != other.color) {
            return false;
        }
        if (!Objects.equals(this.posicion, other.posicion)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Caballo{" + "color=" + color + ", posicion=" + posicion + '}';
    }
}
