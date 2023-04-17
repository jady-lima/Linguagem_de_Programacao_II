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
	
	//Método de acesso a Data
	public Date getData()
	{
        return data;
    } 
	
	//Funcao de edição da descrição
	public void setDescricao(String str)
	{
		this.descricao = str;
	}
	
	//Método de edição da data
	public void setData(Date data)
	{
		this.data = data;
	}
}




