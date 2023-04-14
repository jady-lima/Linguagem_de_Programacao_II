import java.util.ArrayList;

public class Recepcionistas extends Funcionarios{
    //Lista de horarios
    private ArrayList<String> horarios;

    //Construtor
    public Recepcionistas()
    {
        horarios = new ArrayList<String>();
    }

    //Método de adição de um novo horario
    public void addHorario(String horario)
    {
        horarios.add(horario);
    }

    //Método de remoção de um horário pelo indice
    public void removeHorario(int i)
    {
        if (i < 0)
        {
            System.out.println("Numero invalido");
        }
        else if (i < quantidadeHorarios())
        {
            horarios.remove(i);
        }
        else
        {
            System.out.println("Numero invalido");
        }
    }

    //Método que retorna a quantidade de horarios por funcionario
    public int quantidadeHorarios()
    {
        return horarios.size();
    }
}
