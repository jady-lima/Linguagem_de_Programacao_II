package Aulas.Aula07.Dome_versao1;

public class DVD extends Item
{
	private String diretor;

	//Construtor da classe
	public DVD(String titulo, int duracao, boolean alugado, String comentario, String diretor) 
	{
		super(titulo, duracao, alugado, comentario);
		this.diretor = diretor;
	}

	@Override
	public void print()
	{
		super.print();
		System.out.println("Diretor: " + getDiretor());
		System.out.println("Comentario: " + getComentario());
	}
	
	//Método de acesso ao diretor
	public String getDiretor() 
	{
		return diretor;
	}	

	//Metodo de edição do diretor
	public void setDiretor(String diretor) 
	{
		this.diretor = diretor;
	}
}
