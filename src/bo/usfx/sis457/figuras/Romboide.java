/*
* Archivo que contiene la Clase Rectangulo 
 */
package bo.usfx.sis457.figuras;

/**
 * Clase Romboide que calcula el área y perímetro
 * @author Daniela Gonzales
 */
public class Romboide {
    private double BaseR;
    private double AlturaR;
    
    /**
     * Método constructor, crea el Rectangulo con las propiedades Base y Altura
     * @param baser Valor tipo double
     * @param alturar Valor tipo double
     */
    public Romboide(double baser, double alturar) {
        this.BaseR = baser;
        this.AlturaR = alturar; 
    }
    /**
     * Método constructor, crea el Romboide con valores por defecto
     */
    public Romboide() {
        // Llama al método constructor anterior
        this(0, 0);
    }
    /**
     * Método que retorna el valor de la Base 
     * @return Retorna el valor de la Base en tipo double
     */
    public double getBaseR() {
        return BaseR;
    }
    /**
     * Método que modifica el valor de la Base
     * @param baser Valor de tipo double
     */
    public void setBaseR(double baser) {
        this.BaseR = baser;
    }
    /**
     * Método que retorna el valor de la Altura 
     * @return Retorna el valor de la Altura en tipo double
     */
    public double getAlturaR() {
        return AlturaR;
    }
    /**
     * Método que modifica el valor de la Altura
     * @param alturar Valor de tipo double
     */
    public void setAlturaR(double alturar) {
        this.AlturaR = alturar;
    }
    /**
     * Método que retorna el area del Romboide
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return this.BaseR * this.AlturaR;
    }
    /**
     * Método que retorna el perimetro del Romboide
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (2 * (this.BaseR + this.AlturaR));
    }
}
    
