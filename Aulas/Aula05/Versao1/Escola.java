import java.util.Scanner;

public class Escola
{    
	//Cria um objeto do tipo evento
    Evento e = new Evento();
    
	//Método que cadastra um evento
    public void cadastrarEvento()
	{
		Scanner ler = new Scanner(System.in);
				
        String descricao = "";
		int dia, mes, ano;
		
		System.out.printf("Informe a descricao do evento:\n");
		descricao = ler.next();
		
		System.out.printf("Informe o dia do evento:\n");
		dia = ler.nextInt();
		
		System.out.printf("Informe o mes do evento:\n");
		mes = ler.nextInt();
		
		System.out.printf("Informe o ano do evento:\n");
		ano = ler.nextInt();
                      
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



