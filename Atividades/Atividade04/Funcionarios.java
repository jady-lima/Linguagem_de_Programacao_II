public class Funcionarios 
{
    //Atributos
    protected int matricula;
    protected String nome;
    
    //Construtor
    public Funcionarios()
    {

    }

    //Método de acesso da matricula
    public int getMatricula()
    {
        return matricula;
    }

    //Método de edição da matricula
    public void setMatricula(int m)
    {
        matricula = m;
    }

    //Método de acesso do Nome
    public String getNome()
    {
        return nome;
    }

    //Método de edição do nome 
    public void setNome(String n)
    {
        nome = n;
    }
}