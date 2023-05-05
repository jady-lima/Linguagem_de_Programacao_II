package br.ufrn.imd.modelo;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Animal {
	protected String nome;
	protected Date dataNascimento;
	protected int peso;
	protected boolean alimentado = false;
	protected String alimentacao;
	
	public Animal(String nome, String dataNascimento, int peso, boolean alimentado, String alimentacao) 
	{
		this.nome = nome;
		setDataNascimento(dataNascimento);
		this.peso = peso;
		this.alimentado = alimentado;
		this.alimentacao = alimentacao;
	}

	public void comer(){
		System.out.println("Animal se alimentando!");
		System.out.println("O peso do animal é: " + getPeso());
		System.out.println("Sua alimentação é de: " + (getPeso() * 0.05));
		setAlimentado(true);
	}
	
	public int calcularIdade(Animal animal)
	{
		int idade = 0;
		return idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
		this.dataNascimento = null;
        try 
        {
        	this.dataNascimento = formato.parse(dataNascimento);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public boolean isAlimentado() {
		return alimentado;
	}

	public void setAlimentado(boolean alimentado) {
		this.alimentado = alimentado;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	
	
	
}
