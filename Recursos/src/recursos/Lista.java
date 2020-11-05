
package recursos;

/**
 *
 * @author Estrella
 */
public class Lista {
    int arreglo [];
    int nueva[]={1,2,3,4,5,6,7,8,9,10};
    
    public Lista(){
        arreglo = new int [10];
        
        
        for (int i=0; i<10; i++){
            arreglo [i]= (i+i) *10;
                    
        }
    }
    public void impri(int [] arrimp){
        for (int i=0; i<arrimp.length; i++){
            System.out.println(+arrimp[i]);
        }
        
    }
}
