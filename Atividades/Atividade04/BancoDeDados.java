import java.util.ArrayList;

public class BancoDeDados 
{
    //Array de funcionarios
    private ArrayList<Funcionarios> funcionarios;
    private ArrayList<Alunos> alunos;

    //Construtor
    public BancoDeDados()
    {
        funcionarios = new ArrayList<Funcionarios>();
    }

    //Função que adiciona um funcionário ao array
    public void addFuncionario(Funcionarios f)
    {
        funcionarios.add(f);
    }

    //Função que remove o funcionário do array
    public void removeFuncionario(int i)
    {
        if (i < 0)
        {
            System.out.println("Numero invalido");
        }
        else if (i < quantidadeFuncionarios())
        {
            funcionarios.remove(i);
        }
        else
        {
            System.out.println("Numero invalido");
        }
    }

    //Função que conta a quantidade de funcionários no array
    public int quantidadeFuncionarios()
    {
        return funcionarios.size();
    }

    //Função que retorna o relatótio de funcionarios
    public void listaFuncionarios()
    {
        System.out.println("#################### FUNCIONARIOS ####################");
        for (Funcionarios funcionario : funcionarios) 
        {
            System.out.println("Matricula: " + funcionario.getMatricula() + " Nome: " + funcionario.getNome() + " Tipo: " + funcionario.getClass());
        }
        System.out.println("######################################################");
    }

    //Função que retorna o relatório de professores
    public void listaProfessores()
    {
        System.out.println("#################### PROFESSORES #####################");
        for (Funcionarios funcionario : funcionarios) 
        {
            if (funcionario instanceof Professores)
            {
                System.out.println("Professor: " + ((Professores)funcionario).getNome());
                ((Professores)funcionario).listaAlunos();
            } 
        }
        System.out.println("######################################################");
    }

    //Função que retorna o relatório de recepcionistas
    public void listaRecepcionistas()
    {
        System.out.println("################### RECEPCIONISTAS ###################");
        for (Funcionarios funcionario : funcionarios) 
        {
            if (funcionario instanceof Recepcionistas) 
            {
                System.out.println("Nome: " + ((Recepcionistas)funcionario).getNome());
                ((Recepcionistas)funcionario).listaHorarios();   
            }
        }
        System.out.println("######################################################");

    }

    //Função que cria um array de alunos
    public void addAluno(Alunos a)
    {
        alunos.add(a);
    }

    //Função que remove um aluno
    public void removeAluno(int i)
    {
        if (i < 0)
        {
            System.out.println("Numero invalido");
        }
        else if (i < quantidadeAlunos())
        {
            alunos.remove(i);
        }
        else
        {
            System.out.println("Numero invalido");
        }
    }

    //Função que retorna a quantidade de alunos total no vetor
    public int quantidadeAlunos()
    {
        return alunos.size();
    }

    //Função que retorna o relatótio de alunos
    public void listaAlunos()
    {
        System.out.println("####################### ALUNOS #######################");
        for (Alunos aluno : alunos) 
        {
            System.out.println("Nome: " + aluno.getNome() + " Nascimento: " + aluno.getNascimento());    
        }
    }
}
