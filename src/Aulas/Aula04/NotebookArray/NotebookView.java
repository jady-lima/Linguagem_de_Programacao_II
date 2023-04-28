package Aulas.Aula04.NotebookArray;

import java.util.Scanner;

public class NotebookView {
    public static void main(String args [])
    {
        //Cria um objeto do tipo Notebook
        Notebook notebook = new Notebook();

        //Cria um novo scanner
        Scanner sc = new Scanner(System.in);

        //Recebe a note digitada pelo user e armazena como novas linhas
        String note = sc.nextLine();
        notebook.storeNote(note);
        note = sc.nextLine();
        notebook.storeNote(note);
        note = sc.nextLine();
        notebook.storeNote(note);

        //Apresenta na tela a quantidade de notes
        System.out.println("Número de notas registradas: " + notebook.numberOfNotes());

        //Imprime todas as notes armazenadas
        notebook.listNotes();

        //Remove uma note
        notebook.removeNote(1);

        //Mostra um note pelo indice
        notebook.showNote(0);

        //Lista novamente todas as notes para saber se foi excluido corretamente
        notebook.listNotes();
    }
}
