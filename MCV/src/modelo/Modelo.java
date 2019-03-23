
package modelo;

public class Modelo {
    private int numerouno;
    private int numerodos;
    private int resultado;

    public int getNumerouno() {
        return numerouno;
    }

    public void setNumerouno(int numerouno) {
        this.numerouno = numerouno;
    }

    public int getNumerodos() {
        return numerodos;
    }

    public void setNumerodos(int numerodos) {
        this.numerodos = numerodos;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int Multiplicar()
    {
        this.resultado = this.numerouno * this.numerodos;
        return this.resultado;
    }
}
