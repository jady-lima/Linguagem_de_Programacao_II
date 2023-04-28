package Aulas.Aula07.Dome_versao1;

public class Item 
{
	protected String titulo;
	protected int duracao;
	protected boolean alugado = false;
	protected String comentario;
	
	//Construtor da classe
	public Item(String titulo, int duracao, boolean alugado, String comentario) 
	{
		this.titulo = titulo;
		this.duracao = duracao;
		this.alugado = alugado;
		this.comentario = comentario;
	}
	
	//Método que imprime as informações
	public void print()
	{
		System.out.println("Titulo: " + getTitulo() + " Duracao: " + getDuracao());
	}
	
	//Método de acesso ao titulo do item
 	public String getTitulo() 
	{
		return titulo;
	}

	//Método de edição do titulo do item
	public void setTitulo(String titulo) 
	{
		this.titulo = titulo;
	}

	//Método de acesso do tempo de duração do item
	public int getDuracao() 
	{
		return duracao;
	}

	//Método de edição da duração do item
	public void setDuracao(int duracao) 
	{
		this.duracao = duracao;
	}

	//Método que acessa o estado do item
	public boolean isAlugado() 
	{
		return alugado;
	}

	//Método que edita o estado do item
	public void setAlugado(boolean alugado) 
	{
		this.alugado = alugado;
	}

	//Método que acessa os comentarios sobre um item
	public String getComentario() 
	{
		return comentario;
	}

	//Método que edita os comentatios de um item
	public void setComentario(String comentario) 
	{
		this.comentario = comentario;
	}
}
