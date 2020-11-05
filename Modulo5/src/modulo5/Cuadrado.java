
package modulo5;

/**
 *
 * @author Estrella
 */
public class Cuadrado extends Formas {
      private int Lado;
    
    public void setLado(int medida){
        Lado=medida;
    }
    public int getLado(){
        return Lado;
    }
    public void Calccuadrado(){
        Lado= 20;
        int area=Lado*Lado;
        System.out.println("Area="+area);
        
        
    } 
}
