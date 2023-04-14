import java.util.ArrayList;

public class Professores extends Funcionarios
{
    //Atributos
    private boolean natacao = false;
    private boolean musculacao = false;

    //Array de alunos
    private ArrayList<Alunos> alunos;

    //Construtor da classe
    public Professores()
    {
        alunos = new ArrayList<Alunos>();
    }

    //Método que adiciona um novo aluno
    public void addAluno(Alunos a)
    {
        alunos.add(a);
    }

    //Método que remove um aluno por indice
    public void removeAluno(int i)
    {
        if (i <  0)
        {
            System.out.println("Numero invalido.");
        }
        else if (i < quantidadeAlunos())
        {
            alunos.remove(i);
        }
        else
        {
            System.out.println("Numero invalido.");
        }
    }

    //Método que retorna a quantidade de alunos do professor
    public int quantidadeAlunos()
    {
        return alunos.size();
    }

    //Método que lista os alunos 
    public void listaAlunos()
    {
        for (Alunos aluno : alunos) 
        {
            System.out.println("Aluno >>> " + aluno.getNome());
            aluno.listaAtividadePorHorarios();
        }
    }

    //Método de retorno da natação
    public boolean getNatacao()
    {
        return natacao;
    }

    //Método de edição da natação
    public void setNatacao(boolean n)
    {
        natacao = n;
    }

    //Método de acesso de musculação
    public boolean getMusculacao()
    {
        return musculacao;
    }

    //Método de edição de musculação
    public void setMusculacao(boolean m)
    {
        musculacao = m;
    }
}
