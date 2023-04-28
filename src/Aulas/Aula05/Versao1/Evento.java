package Aulas.Aula05.Versao1;

public class Evento
{   
	// atributos
    private String descricao;
    private int dia, mes, ano;
    
	//Método que agenda um evento
    public void agendar(String descricao, int dia, int mes, int ano) 
	{
        setDescricao(descricao);;
        setDia(dia);;
		setMes(mes);;
		setAno(ano);;
    }  
        
    //Função de acesso a descrição do evento
	public String getDescricao()
	{
        return descricao;
    }  
	
	//Funçãp que edita a descrição do evento
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}
	
	//Função de acesso ao dia
	public int getDia()
	{
		return dia;
	}

	//Função que edita o dia do evento
	public void setDia(int dia)
	{
		this.dia = dia;
	}
	
	//Função de acesso ao mês
	public int getMes()
	{
		return mes;
	}

	//Função que edita o mês do evento
	public void setMes(int mes)
	{
		this.mes = mes;
	}
	
	//Função de acesso ao ano
	public int getAno(){
		return ano;
	}

	//Função de edição do ano do evento
	public void setAno(int ano)
	{
		this.ano = ano;
	}
}
