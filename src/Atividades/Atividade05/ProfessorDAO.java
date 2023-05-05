package Atividades.Atividade05;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class ProfessorDAO 
{
	private ArrayList<Professor> professores;
	private Calendar calendar;

	//Construtor da classe
	public ProfessorDAO() 
	{
		professores = new ArrayList<Professor>();
		calendar = Calendar.getInstance();
	}
	
	//Adiciona um novo professor a escola
	public void addProfessor(Professor p)
	{
		professores.add(p);
	}
	
	//remove um professor pelo indice
	public void removeProfessor(int indice)
	{
		if (indice < 0)
		{
			System.out.println("Professor não encontrado");
		} 
		else if (indice < quantProfessores()) 
		{
			professores.remove(indice);
		}
		else
		{
			System.out.println("Professor não encontrado");
		}
	}
	
	//metodo que retorna a quantidade de professores na escola
	public int quantProfessores()
	{
		return professores.size();
	}

	//Lista os carros cadastrados
    public void listaProfessores()
    {
        System.out.println("--------- Professores Cadastrados ---------");
        for (Professor professor: professores)
        {
        	System.out.println();
            professor.lecionar();
            System.out.println();
        }
        System.out.println("Professor com maior salario: " + professores.get(maiorSalario()).getNome());
        System.out.println("Professor mais jovem: " + professores.get(professorMaisJovem()).getNome());
        System.out.println("O salario total pago pela escola e: " + totalSalarios());
    }
    
    //Retorna o professor com o maior salario
    public int maiorSalario()
    {
        //variaveis auxiliares
        int indice = 0;
        Professor professorAuxiliar = new Professor("", "", "00/00/0000", "", "", 0);

        for (int i = 0; i<quantProfessores(); i++)
        {
            if(professores.get(i).getSalario() > professorAuxiliar.getSalario())
            {
            	professorAuxiliar.setNome(professores.get(i).getNome());
            	professorAuxiliar.setMatricula(professores.get(i).getMatricula());
            	professorAuxiliar.setDisciplina(professores.get(i).getDisciplina());
				professorAuxiliar.setNivelEscolaridade(professores.get(i).getNivelEscolaridade());
            	professorAuxiliar.setSalario(professores.get(i).getSalario());
                indice = i;
            }
        }
        return indice;
    }
    
    //Retorna o professor mais jovem
	public int professorMaisJovem()
	{
		//variaveis auxiliares
        int indice = 0;
        Professor professorAuxiliar = new Professor("", "", "00/00/0000", "", "", 0);

        for (int i = 0; i<quantProfessores(); i++)
        {
            if(professores.get(i).getIdade() < professorAuxiliar.getIdade())
            {
            	professorAuxiliar.setNome(professores.get(i).getNome());
            	professorAuxiliar.setMatricula(professores.get(i).getMatricula());
            	professorAuxiliar.setDisciplina(professores.get(i).getDisciplina());
				professorAuxiliar.setNivelEscolaridade(professores.get(i).getNivelEscolaridade());
            	professorAuxiliar.setSalario(professores.get(i).getSalario());
            	professorAuxiliar.setIdade(professores.get(i).getIdade());
                indice = i;
            }
        }
        return indice;
	}
	
	//Calcula idade
	public void calculaIdade()
	{
		SimpleDateFormat formato = new SimpleDateFormat("yyyy");
		for(Professor professor: professores)
		{
			professor.setIdade(calendar.get(Calendar.YEAR) - Integer.parseInt(formato.format(professor.dataNascimento)));
			System.out.println("Idade: " + professor.getIdade());
		}
	}

    //Retorna o total de salarios
    public double totalSalarios()
    {
    	double salarioTotal = 0;
    	for(Professor professor: professores)
    	{
    		salarioTotal += professor.getSalario();
    	}
    	return salarioTotal;
    }
}
