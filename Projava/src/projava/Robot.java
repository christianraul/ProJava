package projava;

public class Robot {

    public String Nombre;
    public double Altura;
    public double Peso;

    public void Hablar() {
        System.out.println("Mi Nombbre es:" + this.Nombre);

    }
    public  void Hablar(String tuNombre) {
        
        System.out.print("tu Nombe es_"+ tuNombre);
        this.Hablar();
    }
}
