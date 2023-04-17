public class EscolaMelhorada
{    
	//Atributos
    private EventoMelhorado evento;
	
	//Função de edição de um evento
	public void setEvento(EventoMelhorado evt)
	{
		this.evento = evt;
	}
	
	//Método de acesso ao evento
	public EventoMelhorado getEvento()
	{
		return evento;
	}   
    
	//Método que imprime o evento
    public void mostrarEvento()
	{
		System.out.println("");
        System.out.println("Evento: " + getEvento().getDescricao());
        System.out.println("Data: " + getEvento().getData());		
    }    
}


