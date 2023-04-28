package Aulas.Aula05.Versao1;

import java.util.Scanner;

public class Escola
{    
	//Cria um objeto do tipo evento
    Evento e = new Evento();
    
	//Método que cadastra um evento
    public void cadastrarEvento()
	{
		Scanner sc = new Scanner(System.in);
				
        String descricao = "";
		int dia, mes, ano;
		
		System.out.printf("Descricao do evento:\n");
		descricao = sc.next();
		
		System.out.printf("Dia do evento:\n");
		dia = sc.nextInt();
		
		System.out.printf("Mes do evento:\n");
		mes = sc.nextInt();
		
		System.out.printf("Ano do evento:\n");
		ano = sc.nextInt();
                      
        e.agendar(descricao, dia, mes, ano);   
    }    
    
	//Função que mostra o evento cadastrado
    public void mostrarEvento()
	{
		System.out.println(" ");
        System.out.println("Evento: " + e.getDescricao());
        System.out.println("Data: " + e.getDia() + "/" + e.getMes() + "/" + e.getAno());
    }    
}



