package Atividades.Atividade04;

public class NatalFitness 
{
    public static void main(String[] args) 
    {
        //Objeto Banco de dados
        BancoDeDados bd = new BancoDeDados();

        //Funcionarios do tipo professor
        Funcionarios professor1 = new Professores();
        professor1.setMatricula(001);
        professor1.setNome("Severus Snape\t");
        ((Professores)professor1).setNatacao(true);
        ((Professores)professor1).setMusculacao(false);

        Funcionarios professor2 = new Professores();
        professor2.setMatricula(002);
        professor2.setNome("Albus Dumbledore\t");
        ((Professores)professor2).setNatacao(false);
        ((Professores)professor2).setMusculacao(true);


        //Funcionarios do tipo Recepcionista
        Funcionarios recepcionista1 = new Recepcionistas();
        recepcionista1.setMatricula(003);
        recepcionista1.setNome("Rubeo Hagrid\t");
        Horarios h1 = new Horarios();
        h1.setDia("Terca");
        h1.setHora("10:00");
        ((Recepcionistas)recepcionista1).addHorario(h1);
        Horarios h2 = new Horarios();
        h2.setDia("Segunda");
        h2.setHora("07:00");
        ((Recepcionistas)recepcionista1).addHorario(h2);

        Funcionarios recepcionista2 = new Recepcionistas();
        recepcionista2.setMatricula(004);
        recepcionista2.setNome("Chapeu Seletor\t");
        Horarios h3 = new Horarios();
        h3.setDia("Sexta");
        h3.setHora("12:00");
        ((Recepcionistas)recepcionista2).addHorario(h3);
        Horarios h4 = new Horarios();
        h4.setDia("Quarta");
        h4.setHora("12:00");
        ((Recepcionistas)recepcionista2).addHorario(h4);

        //Objetos do tipo Aluno
        Alunos aluno1 = new Alunos();
        aluno1.setCPF("111.111.111-11");
        aluno1.setNascimento("25/09/2000");
        aluno1.setNome("Harry Potter");
        bd.addAluno(aluno1);
        ((Professores)professor1).addAluno(aluno1);

        Alunos aluno2 = new Alunos();
        aluno2.setCPF("999.999.999-99");
        aluno2.setNascimento("12/02/2000");
        aluno2.setNome("Draco Malfoy");
        bd.addAluno(aluno2);
        ((Professores)professor2).addAluno(aluno2);

        //Adiciona ao banco de dados
        bd.addFuncionario(professor1);
        bd.addFuncionario(professor2);
        bd.addFuncionario(recepcionista1);
        bd.addFuncionario(recepcionista2);

        bd.listaFuncionarios();
        bd.listaProfessores();
        bd.listaRecepcionistas();
        bd.listaAlunos();
    }
}
