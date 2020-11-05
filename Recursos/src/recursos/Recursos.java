
package recursos;

/**
 *
 * @author Estrella
 */
public class Recursos {

    
    public static void main(String[] args) {
        Mensaje msj= new Mensaje();
        
        msj.Imprimir();
        
        Edad estudiante= new Edad();
        
        estudiante.Edad();
        
       Multiplicacion mul= new Multiplicacion();
       int multiplicar= mul.multiplicacion(20, 20);
        
      mul.resultado(multiplicar);
      
      
      
      Lista arr= new Lista();
      arr.impri(arr.arreglo);
      arr.impri(arr.nueva);
    }
    
}
