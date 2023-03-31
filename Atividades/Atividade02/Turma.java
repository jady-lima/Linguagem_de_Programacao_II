package Atividades.Atividade02;

import java.util.ArrayList;

public class Turma {
    //OBJETOS DO TIPO ALUNO
    Aluno aluno1;
    Aluno aluno2;
    Aluno aluno3;

    //ARRAY DE ALUNOS
    private ArrayList<Aluno> alunos;

    //CONSTRUTOR DA CLASSE
    public Turma(double nota1Parte1, double nota1Parte2, double nota2Parte1, double nota2Parte2)
    {
        alunos = new ArrayList<Aluno>();
        aluno1 = new Aluno(nota1Parte1, nota1Parte2, nota2Parte1, nota2Parte2);
        aluno2 = new Aluno(nota1Parte1, nota1Parte2, nota2Parte1, nota2Parte2);
        aluno3 = new Aluno(nota1Parte1, nota1Parte2, nota2Parte1, nota2Parte2);
        novoAluno(aluno1);
        novoAluno(aluno2);
        novoAluno(aluno3);
    }

    //MÉTODO PARA VISUALIZAR O ALUNO NO ARRAY
    public void mostraAluno(int indiceAluno)
    {
        if (indiceAluno < 0)
        {
            System.out.println("Entrada inválida");
        }
        else if (indiceAluno < numeroAlunos())
        {
            System.out.println("Parte 1 da nota 1: " + alunos.get(indiceAluno).prova1.getNotaParte1());
            System.out.println("Parte 2 da nota 1: " + alunos.get(indiceAluno).prova1.getNotaParte2());
            System.out.println("Parte 1 da nota 2: " + alunos.get(indiceAluno).prova2.getNotaParte1());
            System.out.println("Parte 2 da nota 2: " + alunos.get(indiceAluno).prova2.getNotaParte2());
            System.out.println("Media da prova: " + alunos.get(indiceAluno).calcularMedia());
            System.out.println("Media do aluno: " + alunos.get(indiceAluno).calcularMedia());
        }
    }

    //MÉTODO DE ADICIONAR O ALUNO AO ARRAY
    public void novoAluno(Aluno aluno)
    {
        alunos.add(aluno);
    }

    //RETORNA A QUANTIDADE DE ALUNOS
    public int numeroAlunos()
    {
        return alunos.size();
    }

    //MÉTODO QUE CALCULA A MÉDIA DA TURMA
    public double calcularMedia()
    {
        double mediaTurma;
        mediaTurma = (alunos.get(0).calcularMedia() + alunos.get(1).calcularMedia() + alunos.get(2).calcularMedia()) / numeroAlunos();
        return mediaTurma;
    }

    //METODO DE ACESSO DO ALUNO1
    public Aluno getAluno1()
    {
        return aluno1;
    }

    //MÉTODO DE EDIÇÃO DO ALUNO1
    public void setAluno1(Aluno a1)
    {
        aluno1 = a1;
    }

    //METODO DE ACESSO DO ALUNO2
    public Aluno getAluno2()
    {
        return aluno2;
    }

    //MÉTODO DE EDIÇÃO DO ALUNO2
    public void setAluno2(Aluno a2)
    {
        aluno2 = a2;
    }

    //METODO DE ACESSO DO ALUNO3
    public Aluno getAluno3()
    {
        return aluno3;
    }

    //MÉTODO DE EDIÇÃO DO ALUNO3
    public void setAluno(Aluno a3)
    {
        aluno1 = a3;
    }
}
