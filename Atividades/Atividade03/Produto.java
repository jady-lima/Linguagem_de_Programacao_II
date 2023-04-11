public class Produto
{
    //Atributos
    private String nome;
    private double preco;
    private String marca;
    private String descricao;

    //Construtor
    public Produto()
    {

    }

    //Método de acesso do nome
    public String getNome()
    {
        return nome;
    }

    //Método de edição do nome
    public void setNome(String n)
    {
        nome = n;
    }

    //Método de acesso do preco
    public double getPreco()
    {
        return preco;
    }

    //Método de edição do preco
    public void setPreco(double p)
    {
        preco = p;
    }
    
    //Método de acesso da marca
    public String getMarca()
    {
        return marca;
    }

    //Método de edição da marca 
    public void setMarca(String m)
    {
        marca = m;
    }

    //Método de acesso da descricao
    public String getDescricao()
    {
        return descricao;
    }

    //Método de edição da descrição
    public void setDescricao(String d)
    {
        descricao = d;
    }
}