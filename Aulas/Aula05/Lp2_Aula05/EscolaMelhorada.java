
public class EscolaMelhorada{
    
    private EventoMelhorado evento;
	
	public void setEvento(EventoMelhorado evt){
		this.evento = evt;
	}
	
	public EventoMelhorado getEvento(){
		return evento;
	}   
    
    public void mostrarEvento(){
		System.out.println("\n");
        System.out.println("Evento: " + getEvento().getDescricao());
        System.out.println("Data: " + getEvento().getData());		
    }    
}



