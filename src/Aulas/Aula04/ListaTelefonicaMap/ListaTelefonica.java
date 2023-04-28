package Aulas.Aula04.ListaTelefonicaMap;

import java.util.HashMap;

public class ListaTelefonica {
    private HashMap<String, Pessoa> lista;

    //Construtor da classe
    public ListaTelefonica()
    {
        lista = new HashMap<String, Pessoa>();
    }

    //Método que insere um novo contato
    public void inserirContato(String numero, Pessoa pessoa)
    {
        lista.put(numero, pessoa);
        System.out.println("Pessoa inserida na lista!");
    }

    //Método que busca uma pessoa na lista telefonica
    public void buscarContato(String numero)
    {
        Pessoa pessoa = lista.get(numero);
        if(pessoa != null)
        {
            System.out.println("Nome: " + pessoa.getNome() + " - email: " + pessoa.getEmail());
        }
        else
        {
            System.out.println("Número não encontrado!");
        }
    }
}
