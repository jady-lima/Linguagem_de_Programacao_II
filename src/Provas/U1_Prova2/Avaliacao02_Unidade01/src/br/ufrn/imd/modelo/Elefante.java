package br.ufrn.imd.modelo;

import java.util.Date;

public class Elefante extends Animal 
{
	private int tamanhoTromba;

	public Elefante(String nome, String dataNascimento, int peso, boolean alimentado, String alimentacao, int tamanhoTromba) 
	{
		super(nome, dataNascimento, peso, alimentado, alimentacao);
		this.tamanhoTromba = tamanhoTromba;
	}

	public int getTamanhoTromba() {
		return tamanhoTromba;
	}

	public void setTamanhoTromba(int tamanhoTromba) {
		this.tamanhoTromba = tamanhoTromba;
	}
	
	@Override
	public void comer(){
		System.out.println("Elefante se alimentando!");
		System.out.println("O peso do elefante é: " + getPeso());
		System.out.println("Sua alimentação é de: " + (getPeso() * 0.15));
		setAlimentado(true);
	}
	
	
}
