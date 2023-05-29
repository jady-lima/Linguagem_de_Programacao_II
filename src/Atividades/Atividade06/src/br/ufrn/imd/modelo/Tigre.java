package br.ufrn.imd.modelo;

public class Tigre extends Animal {
	private String tipoTigre;
	
	@Override
	public void comer()
	{
		System.out.println("Animal sendo alimentado...");
		setAlimentado(true);
		System.out.println("Nome do animal: " + getNome());
		System.out.println("Peso do animal: " + getPeso());
		setQuantidadeAlimento(getPeso() * 0.04);
		System.out.println("A quantidade de alimento é " + getQuantidadeAlimento());
		System.out.println("-------------------------------------------------------");
	}
	
	public void print()
	{
		System.out.println("----------------------------------------------------");
		super.print();
		System.out.println("Tipo de tigre: " + getTipoTigre());
	}

	public String getTipoTigre() {
		return tipoTigre;
	}

	public void setTipoTigre(String tipoTigre) {
		this.tipoTigre = tipoTigre;
	}
}
