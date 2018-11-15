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
   public char getcolumna() {
           return columna;
   }

   /**
    * Método que modifica el valor de la propiedad columna.
    * @param columna letra con la columna, si no es correcta lanza la excepción.
    */
   public void setcolumna(char columna) {
           if (columna < 'a' || columna > 'h') {
                   throw new IllegalArgumentException("Columna no valida");
           } else
                   this.columna = columna;
   }
}
