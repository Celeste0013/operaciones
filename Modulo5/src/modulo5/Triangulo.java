
package modulo5;

/**
 *
 * @author Estrella
 */

public class Triangulo extends Formas {
    private int Angulo;

   public void setAngulo(int Ang){
       Angulo=Ang;
   }
   public int getAngulo(){
       return Angulo;
   }
        
   public void calcularea(){
       
        double raiz= Math.sqrt(3);
        int denominador=4;
        int angulo=60;
        
        double primeraparte=raiz/denominador;
        int segundaparte=angulo*angulo;
        double resultado=primeraparte*segundaparte;
        
        System.out.println("Area="+resultado);
          
       
   }     
    
    
}
