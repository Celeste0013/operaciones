
package modulo5;

/**
 *
 * @author Estrella
 */
public class Circulo extends Formas {
    double perimetro;
    public void setperimetro(double peri){
        perimetro=peri;
    }
    public double getperimetro(){
        return perimetro;
        
    }
    
    
    public void calcularad(){
    perimetro=25.5;
    double dospi=6.28;
    double radio= perimetro/dospi;
    System.out.println("Radio="+radio);
  }
       
}
