package br.ufrn.imd.modelo;

import java.util.Calendar;
import java.util.Date;

public class Animal {
	protected String nome;
	protected Date dataNascimento;
	protected double peso;
	protected String tipoAlimentacao;
	protected boolean alimentado;
	protected double quantidadeAlimento;
	protected int codAnimal;
	
	public Animal()
	{
		setAlimentado(false);
		setQuantidadeAlimento(0);
	}
	
	//Função de alimentar o animal
	public void comer()
	{
		System.out.println("Animal sendo alimentado...");
		setAlimentado(true);
		System.out.println("Nome do animal: " + getNome());
		System.out.println("Peso do animal: " + getPeso());
		setQuantidadeAlimento(getPeso() * 0.05);
		System.out.println("A quantidade de alimento é " + getQuantidadeAlimento());
		System.out.println("-------------------------------------------------------");
	}
	
	//Função que realidza o calculo da idade do animal
	public int calcularIdade()
	{
		Calendar anoAtual = Calendar.getInstance();
		int anoHoje = anoAtual.get(Calendar.YEAR);

        Calendar nasc = Calendar.getInstance();
        nasc.setTime(dataNascimento);
        int anoNascimento = nasc.get(Calendar.YEAR);
        
        return (anoHoje - anoNascimento);
	}
	
	//Função que imprime os dados do animal
	public void print()
	{
		System.out.println("Nome do animal: " + getNome());
		System.out.println("Peso do animal: " + getPeso());
		System.out.println("A quantidade de alimento é " + getQuantidadeAlimento());
		System.out.println("Tipo de alimentação: " + getTipoAlimentacao());
		System.out.println("Idade: " + calcularIdade());
		System.out.println("Alimentado: " + isAlimentado());
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public Date getDataNascimento() 
	{
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) 
	{
		this.dataNascimento = dataNascimento;
	}
	
	public double getPeso() 
	{
		return peso;
	}
	
	public void setPeso(double peso) 
	{
		this.peso = peso;
	}
	
	public String getTipoAlimentacao() 
	{
		return tipoAlimentacao;
	}
	
	public void setTipoAlimentacao(String tipoAlimentacao) 
	{
		this.tipoAlimentacao = tipoAlimentacao;
	}
	
	public boolean isAlimentado() 
	{
		return alimentado;
	}
	
	public void setAlimentado(boolean alimentado) 
	{
		this.alimentado = alimentado;
	}

	public double getQuantidadeAlimento() 
	{
		return quantidadeAlimento;
	}

	public void setQuantidadeAlimento(double quantidadeAlimento) 
	{
		this.quantidadeAlimento = quantidadeAlimento;
	}

	public int getCodAnimal() 
	{
		return codAnimal;
	}

	public void setCodAnimal(int codAnimal) 
	{
		this.codAnimal = codAnimal;
	}
	
}
