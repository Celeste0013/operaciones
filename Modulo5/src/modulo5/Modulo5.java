
package modulo5;

/**
 *
 * @author Estrella
 */
public class Modulo5 {

    
    public static void main(String[] args) {
       //Circulo
        Circulo c1= new Circulo();
        c1.setDibujo("Circulo");
        c1.setcolor("Amarillo");
        c1.setperimetro(25.5);
        
        System.out.println("Dibujo:"+c1.getDibujo()+"\nColor:"+c1.getcolor()+"\nPerimetro:"+c1.getperimetro());
        c1.calcularad();
        
        //Linea
        Linea L1= new Linea();
        L1.setDibujo("Linea");
        L1.setlargo(68.93);
        
        System.out.println("\nDibujo:"+L1.getDibujo()+"\nLargo:"+L1.getlargo());
        
        //Triangulo
        Triangulo T1= new Triangulo();
        T1.setDibujo("Triangulo equilatero");
        T1.setcolor("Verde");
        T1.setAngulo(60);
        
        System.out.println("\nDibujo:"+T1.getDibujo()+"\nColor:"+T1.getcolor()+"\nAngulo:"+T1.getAngulo());
        T1.calcularea();
        
        //Cuadrado
        Cuadrado C1= new Cuadrado();
        C1.setDibujo("Cuadrado");
        C1.setcolor("Azul");
        C1.setLado(20);
         
        System.out.println("\nDibujo:"+C1.getDibujo()+"\nColor:"+C1.getcolor()+"\nMedida de sus lados:"+C1.getLado());
        C1.Calccuadrado();
       
    
    }
    
}
