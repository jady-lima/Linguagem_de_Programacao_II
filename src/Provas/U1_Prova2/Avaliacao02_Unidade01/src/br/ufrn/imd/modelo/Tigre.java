package br.ufrn.imd.modelo;

import java.util.Date;

public class Tigre extends Animal 
{
	private String tipoTigre;

	public Tigre(String nome, String dataNascimento, int peso, boolean alimentado, String alimentacao, String tipoTigre) 
	{
		super(nome, dataNascimento, peso, alimentado, alimentacao);
		this.tipoTigre = tipoTigre;
	}

	public String getTipoTigre() {
		return tipoTigre;
	}

	public void setTipoTigre(String tipoTigre) {
		this.tipoTigre = tipoTigre;
	}
	
	@Override
	public void comer(){
		System.out.println("Tigre se alimentando!");
		System.out.println("O peso do Tigre é: " + getPeso());
		System.out.println("Sua alimentação é de: " + (getPeso() * 0.04));
		setAlimentado(true);
	}
	
}
