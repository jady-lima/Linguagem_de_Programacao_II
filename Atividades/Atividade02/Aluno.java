//DESCRIÇÃO
//Calcula a média do aluno
//A média é calculada utilizando a nota total das duas provas realizadas por ele

public class Aluno {
    //OBJETOS DO TIPO PROVA
    Prova prova1;
    Prova prova2;

    //CONSTRUTOR
    public Aluno(double nota1Parte1, double nota1Parte2, double nota2Parte1, double nota2Parte)
    {
        prova1 = new Prova(nota1Parte1, nota1Parte2);
        prova2 = new Prova(nota2Parte1, nota2Parte);
    }

    //MÉTODO QUE CALCULA A MÉDIA DO ALUNO
    public double calcularMedia()
    {
        double mediaAluno;
        mediaAluno = (prova1.calcularNotaTotal() + prova2.calcularNotaTotal()) / 2;
        return mediaAluno;
    }
}
