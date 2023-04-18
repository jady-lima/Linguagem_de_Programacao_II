public class Carros extends Veiculos
{
    //Atributos
    private double potenciaMotor;
    private int portas;

    //Construtor
    public Carros()
    {

    }

    //Método de acesso a potencia
    public double getPotenciaMotor()
    {
        return potenciaMotor;
    }

    //Método de edição da potencia do motor
    public void setPotenciaMotor(double p)
    {
        this.potenciaMotor = p;
    }

    //Método de acesso ao numero de portas
    public int getPortas()
    {
        return portas;
    }

    //Método de edição do numero de portas
    public void setPortas(int p)
    {
        this.portas = p;
    }
}