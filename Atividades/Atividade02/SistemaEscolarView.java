public class SistemaEscolarView {
    public static void main(String[] args) {
        Turma turma = new Turma(4, 2.5, 5, 3);

        turma.mostraAluno(0);
        System.out.println("Media da turma: " + turma.calcularMedia());
    }
}
