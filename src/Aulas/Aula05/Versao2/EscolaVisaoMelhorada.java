package Aulas.Aula05.Versao2;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class EscolaVisaoMelhorada
{	
	public static void main(String args []) throws ParseException
	{
		//Objetos
		EscolaMelhorada escola = new EscolaMelhorada();
		EventoMelhorado evento = new EventoMelhorado();
		
		Scanner sc = new Scanner(System.in);
		
		//Cria variaveis com valores padrão
        String descricao = "";
		String data = "00-00-0000";
		
		//Recebe os dados do usuario
		System.out.printf("Informe a descricao do evento:\n");
		descricao = sc.next();
		System.out.printf("Informe a data do evento:\n");
		data = sc.next();
		
		//Cria um objeto do tipo Date e o formata o recebido pelo user
		Date dt = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		dt = formato.parse(data);
		
		//Adiciona as infomações do evento
		evento.setDescricao(descricao);
		evento.setData(dt);
		
		//Adiciona o evento a escola
		escola.setEvento(evento);

		//Chama a função que imprime o evento
		escola.mostrarEvento();
	}
}
