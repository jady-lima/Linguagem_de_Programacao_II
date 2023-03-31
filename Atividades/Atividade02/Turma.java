import java.util.ArrayList;

public class Turma {
    //Objetos do tipo aluno
    private Aluno aluno1, aluno2, aluno3;

    //Array de alunos
    private ArrayList<Aluno> alunos;

    //Construtor da classe
    public Turma(double aluno1nota1Parte1, double aluno1nota1Parte2, double aluno1nota2Parte1, double aluno1nota2Parte2,
                double aluno2nota1Parte1, double aluno2nota1Parte2, double aluno2nota2Parte1, double aluno2nota2Parte2,
                double aluno3nota1Parte1, double aluno3nota1Parte2, double aluno3nota2Parte1, double aluno3nota2Parte2)
    {
        alunos = new ArrayList<Aluno>();

        //Cria os objetos do tipo Aluno
        aluno1 = new Aluno(aluno1nota1Parte1, aluno1nota1Parte2, aluno1nota2Parte1, aluno1nota2Parte2);
        aluno2 = new Aluno(aluno2nota1Parte1, aluno2nota1Parte2, aluno2nota2Parte1, aluno2nota2Parte2);
        aluno3 = new Aluno(aluno3nota1Parte1, aluno3nota1Parte2, aluno3nota2Parte1, aluno3nota2Parte2);

        //Adiciona os objetos do tipo aluno ao vetor
        novoAluno(aluno1);
        novoAluno(aluno2);
        novoAluno(aluno3);
    }

    //Método para visualizar o aluno no array
    public void mostraAluno(int indiceAluno)
    {
        if (indiceAluno < 0)
        {
            System.out.println("Entrada inválida");
        }
        else if (indiceAluno < numeroAlunos())
        {
            System.out.println("--------------------------");
            System.out.println("|         ALUNO " + (indiceAluno+1) + "        |");
            System.out.println("##########################");
            alunos.get(indiceAluno).mostraAluno();
            System.out.println("# Media do aluno: " + alunos.get(indiceAluno).calcularMedia() + "   #");
            System.out.println("##########################");
            System.out.println("");
        }
    }

    //Método de adicionar o aluno ao array
    public void novoAluno(Aluno aluno)
    {
        alunos.add(aluno);
    }

    //Método que retorna a quantidade de alunos no array
    public int numeroAlunos()
    {
        return alunos.size();
    }

    //Método que calcula a média da turma
    public double calcularMedia()
    {
        double mediaTurma = 0;
        for (int i = 0; i < numeroAlunos(); i++) {
            mediaTurma += alunos.get(i).calcularMedia();
        }
        mediaTurma = mediaTurma / numeroAlunos();
        return mediaTurma;
    }

    //Método de acesso ao aluno1
    public Aluno getAluno1()
    {
        return aluno1;
    }

    //Método de edição do aluno1
    public void setAluno1(Aluno aluno)
    {
        aluno1 = aluno;
    }

    //Método de acesso ao aluno2
    public Aluno getAluno2()
    {
        return aluno2;
    }

    //Método de edição do aluno2
    public void setAluno2(Aluno aluno)
    {
        aluno2 = aluno;
    }
    
    //Método de acesso ao aluno3
    public Aluno getAluno3()
    {
        return aluno3;
    }

    //Método de edição do aluno3
    public void setAluno3(Aluno aluno)
    {
        aluno3 = aluno;
    }
}
