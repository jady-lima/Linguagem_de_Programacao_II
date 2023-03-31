public class SistemaEscolarView {
    public static void main(String[] args) {
        Turma turma = new Turma(4, 2.5, 5, 3, 4.5, 5, 2, 1, 6, 1.5, 6, 3);

        turma.mostraAluno(0);
        turma.mostraAluno(1);
        turma.mostraAluno(2);
        System.out.println("--------------------------");
        System.out.println("| Media da turma: " + turma.calcularMedia() + "   |");
        System.out.println("--------------------------");
    }
}
