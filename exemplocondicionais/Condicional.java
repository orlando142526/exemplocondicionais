
package exemplocondicionais;


public class Condicional {
    private int edade;
    public Condicional (int edade){
        this.edade=edade;
        
    }
    public Condicional(){
        
    }
    public void entrar(int edad){
        if(edad>=18)
            System.out.println("podes entrar");
        else 
            System.out.println("Non podes pasar");
        
    }
    
    
    
}
