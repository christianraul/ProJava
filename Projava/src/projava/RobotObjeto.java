
package projava;

public class RobotObjeto {
    
    public static void main (String[] args){
        Robot objeto1=new Robot();
        objeto1.Nombre= "Arturo";
        objeto1.Altura=100f;
        objeto1.Peso=10f;
        objeto1.Hablar();
        
        
        Robot objeto2=new Robot();
        objeto2.Altura=105f;
        objeto2.Peso=10f; 
        objeto2.Nombre= "Arturo";
        objeto2.Hablar(" JOSE PERALTA TORRES");
    }
}
