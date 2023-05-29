package br.ufrn.imd.modelo;

public class Girafa extends Animal {
	private double tamanhoLingua;
	
	@Override
	public void comer()
	{
		System.out.println("Animal sendo alimentado...");
		setAlimentado(true);
		System.out.println("Nome do animal: " + getNome());
		System.out.println("Peso do animal: " + getPeso());
		setQuantidadeAlimento(getPeso() * 0.10);
		System.out.println("A quantidade de alimento é " + getQuantidadeAlimento());
		System.out.println("-------------------------------------------------------");
	}
	
	public void print()
	{
		System.out.println("----------------------------------------------------");
		super.print();
		System.out.println("Tamanho da lingua: " + getTamanhoLingua() + "m");
	}

	public double getTamanhoLingua() 
	{
		return tamanhoLingua;
	}

	public void setTamanhoLingua(double tamanhoLingua) 
	{
		this.tamanhoLingua = tamanhoLingua;
	}
	
}
