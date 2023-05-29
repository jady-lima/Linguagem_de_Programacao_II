package br.ufrn.imd.modelo;

public class Elefante extends Animal {
	private double tamanhoTromba;
	
	@Override
	public void comer()
	{
		System.out.println("Animal sendo alimentado...");
		setAlimentado(true);
		System.out.println("Nome do animal: " + getNome());
		System.out.println("Peso do animal: " + getPeso());
		setQuantidadeAlimento(getPeso() * 0.15);
		System.out.println("A quantidade de alimento é " + getQuantidadeAlimento());
		System.out.println("-------------------------------------------------------");
	}
	
	public void print()
	{
		System.out.println("----------------------------------------------------");
		super.print();
		System.out.println("Tamanho da Tromba: " + getTamanhoTromba() + "m");
	}

	public double getTamanhoTromba() 
	{
		return tamanhoTromba;
	}

	public void setTamanhoTromba(double tamanhoTromba) 
	{
		this.tamanhoTromba = tamanhoTromba;
	}
	
	
}
