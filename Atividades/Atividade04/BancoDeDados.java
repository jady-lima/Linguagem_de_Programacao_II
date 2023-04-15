import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class BancoDeDados 
{
    //Data atual
    private Calendar calendar;

    //Array de funcionarios
    private ArrayList<Funcionarios> funcionarios;
    private ArrayList<Alunos> alunos;

    //Construtor
    public BancoDeDados()
    {
        funcionarios = new ArrayList<Funcionarios>();
        alunos = new ArrayList<Alunos>();
        calendar = Calendar.getInstance();
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
        System.out.println("############################# FUNCIONARIOS ##############################");
        for (Funcionarios funcionario : funcionarios) 
        {
            System.out.println("| Matricula: " + funcionario.getMatricula() + " | Nome: " + funcionario.getNome() + " | Tipo: " + funcionario.getClass() + "\t|");
        }
        System.out.println("#########################################################################\n");
    }

    //Função que retorna o relatório de professores
    public void listaProfessores()
    {
        System.out.println("############################## PROFESSORES ##############################");
        for (Funcionarios funcionario : funcionarios) 
        {
            if (funcionario instanceof Professores)
            {
                System.out.println("| PROFESSOR: " + ((Professores)funcionario).getNome() + "\t\t\t\t\t|");
                ((Professores)funcionario).listaAlunos();
            } 
        }
        System.out.println("#########################################################################\n");
    }

    //Função que retorna o relatório de professores
    public void listaRecepcionistas()
    {
        System.out.println("########################### RECEPCIONISTAS ##############################");
        for (Funcionarios funcionario : funcionarios) 
        {
            if (funcionario instanceof Recepcionistas)
            {
                System.out.println("| RECEPCIONISTA: " + ((Recepcionistas)funcionario).getNome() + "\t\t\t\t\t|");
                ((Recepcionistas)funcionario).listaHorarios();
            } 
        }
        System.out.println("#########################################################################\n");
    }

    //Função que adiciona um aluno ao vetor de alunos
    public void addAluno(Alunos a)
    {
        alunos.add(a);
    }

    //Função que remove um aluno do vetor pelo indice
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

    //Função que retorna a quantidade de alunos
    public int quantidadeAlunos()
    {
        return alunos.size();
    }

    //Função que retorna o relatótio de alunos
    public void listaAlunos()
    {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        int idade = calendar.get(Calendar.YEAR);
        
        System.out.println("################################ ALUNOS #################################");
        for (Alunos aluno : alunos) 
        {
            System.out.println("| Nome do aluno >>> " + aluno.getNome() + " | Idade: " + (idade - Integer.parseInt(formato.format(aluno.getNascimento()))) + " | CPF: " + aluno.getCPF() + "\t|");
        }
        System.out.println("#########################################################################\n");
    }
}
