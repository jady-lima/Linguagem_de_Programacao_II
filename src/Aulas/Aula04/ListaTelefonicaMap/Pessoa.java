package Aulas.Aula04.ListaTelefonicaMap;

public class Pessoa {
    //Atributos de pessoa
    private String nome;
    private String email;

    //Construtor da classe
    public Pessoa()
    {
        //Construtor vazio/Sem parametros
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

    //Método de acesso do email
    public String getEmail()
    {
        return email;
    }

    //Método de edição do email
    public void setEmail(String e)
    {
        email = e;
    }
}
