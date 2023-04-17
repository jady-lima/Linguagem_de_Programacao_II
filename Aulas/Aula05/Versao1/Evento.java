public class Evento
{   
	// atributos
    private String descricao;
    private int dia, mes, ano;
    
	//Método que agenda um evento, ou seja, salva as informações recebidas do cadastro de um novo evento da classe Escola
    public void agendar(String descricao, int dia, int mes, int ano) 
	{
        this.descricao = descricao;
        this.dia = dia;
		this.mes = mes;
		this.ano = ano;
    }  
        
    //Função de acesso a descrição do evento
	public String getDescricao()
	{
        return descricao;
    }       
	
	//Função de acesso ao dia
	public int getDia()
	{
		return dia;
	}
	
	//Função de acesso ao mês
	public int getMes(){
		return mes;
	}
	
	//Função de acesso ao ano
	public int getAno(){
		return ano;
	}
}
