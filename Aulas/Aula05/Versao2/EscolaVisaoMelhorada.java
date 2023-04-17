import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class EscolaVisaoMelhorada
{	
	public static void main(String args []) throws ParseException
	{
		//Objetos do tipo escola e evento
		EscolaMelhorada escola = new EscolaMelhorada();
		EventoMelhorado evento = new EventoMelhorado();
		
		Scanner ler = new Scanner(System.in);
		
		//Cria variaveis com valores padrão
        String descricao = "";
		String data = "00-00-0000";
		
		//Recebe as informações do usuario
		System.out.printf("Informe a descricao do evento:\n");
		descricao = ler.next();
		System.out.printf("Informe a data do evento:\n");
		data = ler.next();
		
		//Cria um objeto do tipo Date e o formata o recebido pelo user
		Date dt = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		dt = formato.parse(data);
		
		//Recebe adidiona as informação ao evento
		evento.setDescricao(descricao);
		evento.setData(dt);
		
		//Adiciona o evento a escola e imprime ele
		escola.setEvento(evento);
		escola.mostrarEvento();
	}
}


