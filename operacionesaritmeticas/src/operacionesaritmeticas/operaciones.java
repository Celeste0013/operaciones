
package operacionesaritmeticas;

/**
 *
 * @author Estrella
 */
public class operaciones {
    int numero1=0, numero2=0, numero3=0, numero4=0, suma=0, resta=0, multi=0, division=0;
            public operaciones (){
                
            }
            public void setSuma(int a, int b, int c, int d){
                numero1=a;
                numero2=b;
                numero3=c;
                numero4=d;
                this.suma=numero1+numero2+numero3+numero4;
            }
            public void setResta(int a, int b, int c, int d){
                numero1=a;
                numero2=b;
                numero3=c;
                numero4=d;
                this.resta=numero1-numero2-numero3-numero4;
            }
            public void setMulti(int a, int b, int c, int d){
                numero1=a;
                numero2=b;
                numero3=c;
                numero4=d;
                 this.multi=numero1*numero2*numero3*numero4;
            }
            public void setDivision(int a, int b, int c, int d){
                numero1=a;
                numero2=b;
                numero3=c;
                numero4=d;
                this.division=numero1/numero2/numero3/numero4;
            }
                    public void suma (){
                    System.out.println("La suma es="+suma);
                
            }
                    public void resta (){
                    System.out.println("La resta es="+resta);
            }
                   public void multi (){
                    System.out.println("La multiplicacion es="+multi);
            }
                   public void division(){
                    System.out.println("La division es="+division);
            }
}
