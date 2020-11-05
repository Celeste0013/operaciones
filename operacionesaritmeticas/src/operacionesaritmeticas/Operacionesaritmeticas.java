
package operacionesaritmeticas;

/**
 *
 * @author Estrella
 */
public class Operacionesaritmeticas {

    
    public static void main(String[] args) {
       operaciones ope=new operaciones();
        ope.setSuma(30, 15, 5, 10);
        ope.suma();
        ope.setResta(100, 15, 5, 20);
        ope.resta();
        ope.setMulti(2, 2, 5, 3);
        ope.multi();
        ope.setDivision(1000, 2, 2, 5);
        ope.division();
    }
    
}
