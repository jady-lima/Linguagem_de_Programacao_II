//Importa a Collection
import java.util.ArrayList;

public class Notebook
{
    private ArrayList<String> notes;

    //Construtor da classe
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    //Metodo que armazena um note
    public void storeNote(String note)
    {
        notes.add(note);
    }

    //Metodo que retorna a quantidade de notes no Array
    public int numberOfNotes()
    {
        return notes.size();
    }

    //Método que busca um note pelo indice
    public void showNote(int noteNumber)
    {
        if(noteNumber < 0)
        {
            System.out.println("Não é um número válido.");
        }
        else if(noteNumber < numberOfNotes())
        {
            System.out.println(notes.get(noteNumber));
        }
        else
        {
            System.out.println("Não há um note registrado no número digitado.");
        }
    }

    //Método que remove um note pelo indice
    public void removeNote(int noteNumber)
    {
        if(noteNumber < 0)
        {
            System.out.println("O número não é válido.");
        }
        else if(noteNumber < numberOfNotes())
        {
            notes.remove(noteNumber);
        }
        else
        {
            System.out.println("Não há um note registrado no número digitado.");
        }
    }

    //Método que lista todas as notas registradas no Array
    public void listNotes()
    {
        System.out.println("------------NOTES------------");
        for (String note : notes) 
        {
            System.out.println(note);
        }
        System.out.println("-----------------------------\n");
    }
}
