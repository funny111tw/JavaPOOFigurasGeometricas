/*
 * Archivo que contiene la Clase Triangulo 
 */
package bo.usfx.sis457.figuras;

/**
 * Clase Triangulo que calcula el área y perímetro
 * @author Daniela Gonzales
 */
public class Triangulo {
    private double BaseT;
    private double AlturaTR;
    private double Lado1;
/**
     * Método constructor, crea el Triangulo con las propiedades Base y Altura
     * @param baset Valor tipo double
     * @param alturatr Valor tipo double
     */
    public Triangulo(double baset, double alturatr) {
        this.BaseT = baset;
        this.AlturaTR = alturatr;
        
    }
 /**
     * Método constructor, crea el Triangulo con valores por defecto
     */
    public Triangulo() {
        // Llama al método constructor anterior
        this(0, 0);
    }
    /**
     * Método que retorna el valor de la Base 
     * @return Retorna el valor de la Base en tipo double
     */
    public double getBaseT() {
        return BaseT;
    }
    /**
     * Método que modifica el valor de la Base
     * @param baset Valor de tipo double
     */
    public void setBaseT(double baset) {
        this.BaseT = baset;
    }
    /**
     * Método que retorna el valor de la Altura 
     * @return Retorna el valor de la Altura en tipo double
     */
    
    public double getAlturaTR() {
        return AlturaTR;
    }
    /**
     * Método que modifica el valor de la Altura
     * @param alturatr Valor de tipo double
     */
    public void setAlturaTR(double alturatr) {
        this.AlturaTR = alturatr;
    }
    /**
     * Método que retorna el area del Triangulo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return ((this.BaseT * this.AlturaTR)/2);
    }
    /**
     * Método que retorna el perimetro del Triangulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (2*this.Lado1 + this.BaseT);
    }


    
}
