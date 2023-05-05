package br.ufrn.imd.modelo;

import java.util.Date;

public class Girafa extends Animal 
{
	private int tamanhoLingua;

	public Girafa(String nome, String dataNascimento, int peso, boolean alimentado, String alimentacao, int tamanhoLingua) 
	{
		super(nome, dataNascimento, peso, alimentado, alimentacao);
		this.tamanhoLingua = tamanhoLingua;
	}

	public int getTamanhoLingua() {
		return tamanhoLingua;
	}

	public void setTamanhoLingua(int tamanhoLingua) {
		this.tamanhoLingua = tamanhoLingua;
	}
	
	@Override
	public void comer(){
		System.out.println("Girafa se alimentando!");
		System.out.println("O peso da Girafa é: " + getPeso());
		System.out.println("Sua alimentação é de: " + (getPeso() * 0.10));
		setAlimentado(true);
	}
	
	
}
