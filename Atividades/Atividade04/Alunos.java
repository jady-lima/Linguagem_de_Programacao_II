import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alunos {
    //Atiibutos
    private String nome;
    private String cpf;
    private Date nascimento;

    //Array de lista de treinos
    private ArrayList<Horarios> horarios;
    private ArrayList<String> atividades;

    //Construtor
    public Alunos()
    {
        horarios = new ArrayList<Horarios>();
        atividades = new ArrayList<String>();
    }

    //Método de edição da data de nascimento
    public void setNascimento(String d)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        nascimento = null;
        try 
        {
            nascimento = formato.parse(d);
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    //Método de acesso da validade
    public Date getNascimento()
    {
        return nascimento;
    }

    //Método de inserção de um novo horario
    public void addHorario(Horarios h)
    {
        horarios.add(h);
    }

    //Método de remoção de um horario pelo indice
    public void removeHorario(int i)
    {
        if (i < 0)
        {
            System.out.println("Numero invalido");
        }
        else if (i < quantidadeHorarios())
        {
            horarios.remove(i);
        }
        else
        {
            System.out.println("Numero invalido");
        }
    }

    //Método de contagem de horarios
    public int quantidadeHorarios()
    {
        return horarios.size();
    }

    //Método de inserção de um nova Atividade
    public void addAtividades(String a)
    {
        atividades.add(a);
    }

    //Método de remoção de um horario pelo indice
    public void removeAtividades(int i)
    {
        if (i < 0)
        {
            System.out.println("Numero invalido");
        }
        else if (i < quantidadeAtividades())
        {
            atividades.remove(i);
        }
        else
        {
            System.out.println("Numero invalido");
        }
    }

    //Método de contagem de horarios
    public int quantidadeAtividades()
    {
        return atividades.size();
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

    //Método de acesso do cpf
    public String getCPF()
    {
        return cpf;
    }

    //Método de edição do cpf
    public void setCPF(String c)
    {
        cpf = c;
    }
}
