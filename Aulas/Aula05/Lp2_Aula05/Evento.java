
public class Evento{
    
	// atributos
    private String descricao;
    private int dia, mes, ano;
    
    public void agendar(String descricao, int dia, int mes, int ano) {
        this.descricao = descricao;
        this.dia = dia;
		this.mes = mes;
		this.ano = ano;
    }  
        
    public String getDescricao(){
        return descricao;
    }       
	
	public int getDia(){
		return dia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public int getAno(){
		return ano;
	}
}




