package Aulas.Aula07.Dome_versao1;

public class CD extends Item
{
	private String artista;
	private int numeroDeFaixas;
	
	//Construtor da classe
	public CD(String titulo, int duracao, boolean alugado, String comentario, String artista, int numeroDeFaixas) 
	{
		super(titulo, duracao, alugado, comentario);
		this.artista = artista;
		this.numeroDeFaixas = numeroDeFaixas;
	}
	
	@Override
	public void print()
	{
		super.print();
		System.out.println("Artista: " + getArtista() + " ; " + getNumeroDeFaixas() + " Faixas");
		System.out.println("Comentario: " + getComentario());
	}

	//Método que retorna o artista do cd
	public String getArtista() 
	{
		return artista;
	}

	//Método que edita/recebe o artista do CD
	public void setArtista(String artista) 
	{
		this.artista = artista;
	}

	//Método que retorna o número de faixas do CD
	public int getNumeroDeFaixas() 
	{
		return numeroDeFaixas;
	}

	//Método que edita/recebe o número de faixas do CD
	public void setNumeroDeFaixas(int numeroDeFaixas) 
	{
		this.numeroDeFaixas = numeroDeFaixas;
	}
}
