import java.util.ArrayList;

public class Aluno {
    //Objetos do tipo Prova
    private Prova prova1;
    private Prova prova2;

    //Array de Provas
    private ArrayList<Prova> provas;

    //Construtor da classe
    public Aluno(double nota1Parte1, double nota1Parte2, double nota2Parte1, double nota2Parte)
    {
        provas = new ArrayList<Prova>();

        //Cria as provas com os parametros enviados
        prova1 = new Prova(nota1Parte1, nota1Parte2);
        prova2 = new Prova(nota2Parte1, nota2Parte);

        //Adiciona as provas ao Array
        novaProva(prova1);
        novaProva(prova2);
    }

    //Método que mostra o resumo das provas
    public void mostraAluno()
    {
        System.out.println("# Parte 1 da nota 1: " + provas.get(0).getNotaParte1() + " #");
        System.out.println("# Parte 2 da nota 1: " + provas.get(0).getNotaParte2() + " #");
        System.out.println("# ---------------------- #");
        System.out.println("# Media da prova 1: " + provas.get(0).calcularNotaTotal() + "  #");
        System.out.println("# ---------------------- #");
        System.out.println("# Parte 1 da nota 2: " + provas.get(1).getNotaParte1() + " #");
        System.out.println("# Parte 2 da nota 2: " + provas.get(1).getNotaParte2() + " #");
        System.out.println("# ---------------------- #");
        System.out.println("# Media da prova 2: " + provas.get(1).calcularNotaTotal() + "  #");
        System.out.println("# ---------------------- #");
    }

    //Método que adiciona uma nova prova ao Array de provas
    public void novaProva(Prova prova)
    {
        provas.add(prova);
    }

    //Método com a quantidade de provas
    public int numeroProvas()
    {
        return provas.size();
    }

    //Método que calcula a média do aluno
    public double calcularMedia()
    {
        double mediaAluno = 0;
        for (int i = 0; i < numeroProvas(); i++)
        {
            mediaAluno += provas.get(i).calcularNotaTotal();
        }
        mediaAluno = mediaAluno / numeroProvas();
        return mediaAluno;
    }

    //Método de acesso a prova1
    public Prova getProva1()
    {
        return prova1;
    }

    //Método de edição a prova1
    public void setProva1(Prova prova)
    {
        prova1 = prova;
    }

    //Método de acesso a prova2
    public Prova getProva2()
    {
        return prova2;
    }

    //Método de edição a prova2
    public void setProva2(Prova prova)
    {
        prova2 = prova;
    }
}
