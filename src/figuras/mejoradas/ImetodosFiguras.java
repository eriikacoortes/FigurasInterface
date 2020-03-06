/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras.mejoradas;

/**
 *
 * @author usuario
 */
public interface ImetodosFiguras {
    /**
     * Metodo para calcular el area de las figuras en clases cuadro y triangulo
     */
     public void calcularArea();
     /**
      *  Metodo para calcular el Cuadrado de las figuras en clases cuadro y triangulo
      */
     public void calcularPerimetro();
     /**
      * valida que los puntos que se ingresen por cordenadas correspondan a cada figura
      * @return 
      */
     public boolean validarPuntos();
    
}
