package Atividades.Atividade05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Professor 
{
	protected String nome;
	protected String matricula;
	protected Date dataNascimento;
	protected int idade;
	protected String nivelEscolaridade;
	protected String disciplina;
	protected double salario;
	
	//Construtor da classe
	public Professor(String nome, String matricula, String dataNascimento, String nivelEscolaridade, String disciplina, double salario) 
	{
		this.nome = nome;
		this.matricula = matricula;
		setDataNascimento(dataNascimento);
		this.nivelEscolaridade = nivelEscolaridade;
		this.disciplina = disciplina;
		this.salario = salario;
	}
	
	public void lecionar()
	{
		System.out.println("Nome: " + getNome() + "; \t" + "Matricula: " + getMatricula());
		System.out.println("Data de Nascimento: " + getDataNascimento() + "; \t" + "Nivel de escolaridade: " + getNivelEscolaridade());
		System.out.println("Disciplina: " + getDisciplina());
		System.out.println("Idade: " + getIdade());
	}

	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getMatricula() 
	{
		return matricula;
	}

	public void setMatricula(String matricula) 
	{
		this.matricula = matricula;
	}

	public Date getDataNascimento() 
	{
		return dataNascimento;
	}

	public void setDataNascimento(String data) 
	{
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.dataNascimento = null;
        try 
        {
        	this.dataNascimento = formato.parse(data);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
	}

	public String getNivelEscolaridade() 
	{
		return nivelEscolaridade;
	}

	public void setNivelEscolaridade(String nivelEscolaridade) 
	{
		this.nivelEscolaridade = nivelEscolaridade;
	}

	public String getDisciplina() 
	{
		return disciplina;
	}

	public void setDisciplina(String disciplina) 
	{
		this.disciplina = disciplina;
	}

	public double getSalario() 
	{
		return salario;
	}

	public void setSalario(double salario) 
	{
		this.salario = salario;
	}

	public int getIdade() 
	{
		return idade;
	}

	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
		
}
