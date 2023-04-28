package Atividades.Atividade05;

import java.util.Date;

public class ProfessorIntegral extends Professor 
{
	private Date dataInicio;

	public ProfessorIntegral(String nome, String matricula, Date dataNascimento, String nivelEscolaridade,String disciplina, double salario, Date dataInicio) 
	{
		super(nome, matricula, dataNascimento, nivelEscolaridade, disciplina, salario);
		this.dataInicio = dataInicio;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

}
