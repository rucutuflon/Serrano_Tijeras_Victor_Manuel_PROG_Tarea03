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
public class Posicion {
    
    private int fila;
    private char columna;
    
    
    /**
    * Método constructor que inicializa las propiedades de la clase.
    * 
    * @param fila, número de fila, si no es correcta lanza la excepción.
    * @param columna, letra de la columna, si no es correcta lanza la excepción.
    */
    public Posicion(int fila, char columna) {
        if (fila < 1 || fila > 8) {
                throw new IllegalArgumentException("Fila no valida");
        } else
                this.fila = fila;

        if (columna < 'a' || columna > 'h') {
                throw new IllegalArgumentException("Columna no valida");
        } else
                this.columna = columna;
    }
    
    /**
     * Método copia del constructor
     * @param posicion, posición a realizar la copia
     */
    public Posicion (Posicion posicion) {
       this.fila = posicion.fila;
       this.columna = posicion.columna;
    }
    
    /**
    * Método que devuelve el valor de la propiedad fila.
    * @return el número de fila.
    */
    public int getFila() {
        return fila;
    }

    /**
     * Método que modifica el valor de propiedad fila.
     * @param fila, número de fila, si no es correcta lanza la excepción.
     */
    public void setFila(int fila) {
        if (fila < 1 || fila > 8) {
                throw new IllegalArgumentException("Fila no valida");
        } else
                this.fila = fila;
    }

   /**
    * Método que devuelve la propiedad columna.
    * @return la letra de la columna.
    */
    public char getColumna() {
        return columna;
    }

   /**
    * Método que modifica el valor de la propiedad columna.
    * @param columna letra con la columna, si no es correcta lanza la excepción.
    */
    public void setColumna(char columna) {
        if (columna < 'a' || columna > 'h') {
                throw new IllegalArgumentException("Columna no valida");
        } else
                this.columna = columna;
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
        final Posicion other = (Posicion) obj;
        if (this.fila != other.fila) {
            return false;
        }
        if (this.columna != other.columna) {
            return false;
        }
        return true;
    }
    
}
