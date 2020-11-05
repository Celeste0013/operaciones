
package pkg1profesion;


public class Astronauta {
     //ATRIBUTOS
    String Empresa;
    int Tiempo;
    int Caminata;
    
    //METODOS
    public Astronauta(String Empresa, int Tiempo, int Caminata){
        this.Empresa= Empresa;
        this.Tiempo= Tiempo;
        this.Caminata=Caminata;
        
    
    }
    
    public void imprimir(){
        
        System.out.println("Trabaja en:"+Empresa);
        System.out.println("Cantidad de aÃ±os laborales:"+Tiempo);
        System.out.println("Cantidad de caminatas espaciales:"+Caminata);
        
    }
}
