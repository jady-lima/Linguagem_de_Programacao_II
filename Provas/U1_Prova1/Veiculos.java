public class Veiculos 
{
    //Atributos
    protected String marca;
    protected String placa;
    protected double quilometragem;
    protected double valorAluguel;
    protected boolean alugado = false;

    //Construtor
    public Veiculos()
    {

    }

    ////Método de acesso a marca
    public String getMarca()
    {
        return marca;
    }

    //Método de edição da marca
    public void setMarca(String m)
    {
        this.marca = m;
    }
    
    ////Método de acesso a potencia
    public String getPlaca()
    {
        return placa;
    }

    //Método de edição da potencia do motor
    public void setPlaca(String p)
    {
        this.placa = p;
    }

    //Método de acesso a quilometragem
    public double getQuilometragem()
    {
        return quilometragem;
    }

    //Método de edição da quilometragem
    public void setQuilometragem(double q)
    {
        this.quilometragem = q;
    }

    //Método de acesso do aluguel
    public double getValorAluguel()
    {
        return valorAluguel;
    }

    //Método de edição do aluguel
    public void setValorAluguel(double v) 
    {
        this.valorAluguel = v;
    }

    public boolean getAlugado()
    {
        return alugado;
    }

    public void setAlugado()
    {
        this.alugado = true;
    }
}
