import java.util.ArrayList;

public class BancoDeDados {
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
        for (Funcionarios funcionario : funcionarios) {
            System.out.println("Matricula: " + funcionario.getMatricula() + " Nome: " + funcionario.getNome() + " Tipo: " + funcionario.getClass());
        }
        System.out.println("######################################################");
    }

    //Função que retorna o relatório de professores
    public void listaProfessores()
    {
        System.out.println("#################### FUNCIONARIOS ####################");
        for (Funcionarios funcionario : funcionarios) {
            System.out.println("Matricula: " + funcionario.getMatricula() + " Nome: " + funcionario.getNome() + " Tipo: " + funcionario.getClass());
        }
        System.out.println("######################################################");
    }


    //Função que retorna o relatótio de alunos
}
