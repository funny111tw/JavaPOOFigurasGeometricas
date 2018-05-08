/*
 * Archivo que contiene la Clase Trapecio 
 */
package bo.usfx.sis457.figuras;

/**
 * Clase Trapecio que calcula el área y perímetro
 * @author Daniela Gonzales
 */
public class Trapecio {
    private double BaseMayor;
    private double BaseMenor;
    private double AlturaT;
    private double lado;
    
    /**
     * Método constructor, crea el Trapecio con las propiedades Base mayor y menor y Altura
     * @param basemayor Valor tipo double
     * @param basemenor Valor tipo double
     * @param alturat Valor tipo double
     * @param lado Valor tipo double
     */
    public Trapecio(double basemayor, double basemenor, double alturat, double lado) {
        this.BaseMayor = basemayor;
        this.BaseMenor = basemenor;
        this.AlturaT = alturat;
        this.lado = lado;
    }
      /**
     * Método constructor, crea el Trapecio con valores por defecto
     */
    public Trapecio() {
        // Llama al método constructor anterior
        this(0, 0, 0, 0);
    }
      /**
     * Método que retorna el valor de la BaseMayor 
     * @return Retorna el valor de la BaseMayor en tipo double
     */

    public double getBaseMayor() {
        return BaseMayor;
    }
       /**
     * Método que retorna el valor de la BaseMenor
     * @return Retorna el valor de la BaseMayor en tipo double
     */
    public double getBaseMenor() {
        return BaseMenor;
    }
       /**
     * Método que modifica el valor de la BaseMayor
     * @param basemayor Valor de tipo double
     */
    public void setBaseMayor(double basemayor) {
        this.BaseMayor = basemayor;
    }
      /**
     * Método que modifica el valor de la BaseMenor
     * @param basemenor Valor de tipo double
     */
    public void setBaseMenor(double basemenor) {
        this.BaseMenor = basemenor;
    }
      /**
     * Método que retorna el valor de la Altura 
     * @return Retorna el valor de la Altura en tipo double
     */
    
    public double getAlturaT() {
        return AlturaT;
    }
      /**
     * Método que modifica el valor de la Altura
     * @param alturat Valor de tipo double
     */
    public void setAlturaT(double alturat) {
        this.AlturaT = alturat;
    }
        /**
     * Método que retorna el valor de la lado 
     * @return Retorna el valor de la Altura en tipo double
     */
    public double getLado() {
        return lado;
    }
        /**
     * Método que modifica el valor de la lado
     * @param lado Valor de tipo double
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
      /**
     * Método que retorna el area del Trapecio
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return ((this.AlturaT * (this.BaseMayor + this.BaseMenor))/2);
    }
     /**
     * Método que retorna el perimetro del Romboide
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return (this.BaseMayor + this.BaseMenor + (2 * this.lado));
    }
}
