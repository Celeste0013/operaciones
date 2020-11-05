
package modulo4;

import PAISES.Congo;
import PAISES.Egipto;
import PAISES.Pakistan;

/**
 *
 * @author Estrella
 */
public class Modulo4 {

    
    public static void main(String[] args) {
        //PARTE1
        Ciudadano Ciudad= new Ciudadano();
        
        Ciudad.setEdad(18);
        System.out.println("Edad del ciudadano:"+Ciudad.getEdad());
        
        Ciudad.setNombre("Celeste");
        System.out.println("Nombre:"+Ciudad.getNombre());
        
        Ciudad.setExperiencia(1);
        System.out.println("AÃ±os de experiencia:"+Ciudad.getExperiencia());
        
        //PARTE2
        Congo repCon= new Congo();
        Egipto egip= new Egipto();
        Pakistan paki= new Pakistan();
        
         System.out.println("Pais:"+repCon.getpais());
         System.out.println("Presidente:"+repCon.getpresidente());
         
         System.out.println("Pais:"+egip.getpais());
         System.out.println("Presidente:"+egip.getpresidente());
         
         System.out.println("Pais:"+paki.getpais());
         System.out.println("Presidente:"+paki.getpresidente());
        
    }
    
}
