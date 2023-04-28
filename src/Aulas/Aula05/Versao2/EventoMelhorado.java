package Aulas.Aula05.Versao2;

import java.util.Date;

public class EventoMelhorado
{    
	// atributos
    private String descricao;
    private Date data;  
        
    //Função de acesso a descrição
	public String getDescricao()
	{
        return descricao;
    }       
	
	//Funcao de edição da descrição
	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	//Método de acesso a Data
	public Date getData()
	{
        return data;
    } 
	
	//Método de edição da data
	public void setData(Date data)
	{
		this.data = data;
	}
}
