import java.util.ArrayList;

public class Recepcionistas extends Funcionarios
{
    //Lista de horarios
    private ArrayList<Horarios> horarios;

    //Construtor
    public Recepcionistas()
    {
        horarios = new ArrayList<Horarios>();
    }

    //Método de adição de um novo horario
    public void addHorario(Horarios horario)
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

    //Função que lista os horarios do recepcionista
    public void listaHorarios()
    {
        for (Horarios horario : horarios) {
            System.out.println("| > Dia: " + horario.getDia() + " Hora: " + horario.getHora() + "\t\t\t\t\t\t|");
        }
    }  
}
