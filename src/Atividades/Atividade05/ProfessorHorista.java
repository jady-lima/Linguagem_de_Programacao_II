package Atividades.Atividade05;

public class ProfessorHorista extends Professor 
{
	public static final double VALORDAHORA = 25;
	
	private int horasTrabalhadas;

	public ProfessorHorista(String nome, String matricula, String dataNascimento, String nivelEscolaridade,String disciplina, double salario, int horasTrabalhadas) 
	{
		super(nome, matricula, dataNascimento, nivelEscolaridade, disciplina, salario);
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public int getHorasTrabalhadas() 
	{
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) 
	{
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	@Override
	public double getSalario()
	{
		super.setSalario(getHorasTrabalhadas() * VALORDAHORA);
		double salarioFinal = super.getSalario();
		return salarioFinal;
	}
}
 