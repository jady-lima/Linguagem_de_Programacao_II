package Atividades.Atividade05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProfessorIntegral extends Professor 
{
	private Date dataInicio;

	public ProfessorIntegral(String nome, String matricula, String dataNascimento, String nivelEscolaridade,String disciplina, double salario, String dataInicio) 
	{
		super(nome, matricula, dataNascimento, nivelEscolaridade, disciplina, salario);
		setDataInicio(dataInicio);
	}

	public Date getDataInicio() 
	{
		return dataInicio;
	}

	public void setDataInicio(String data) 
	{
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        this.dataInicio = null;
        try 
        {
        	this.dataNascimento = formato.parse(data);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
	}

}
