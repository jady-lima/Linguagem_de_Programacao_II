package Atividades.Atividade05;

public class EscolaView {

	public static void main(String[] args) 
	{
		// Objetos Professores horistas
		Professor horista1 = new ProfessorHorista("Horista1", "000001", "12/03/1987", "doutorado", "Portugues", 0, 45);
		Professor horista2 = new ProfessorHorista("Horista2", "000002", "20/05/1977", "mestrado", "Portugues", 0, 30);
		Professor horista3 = new ProfessorHorista("Horista3", "000003", "12/10/1979", "doutorado", "Matematica", 0, 48);
		Professor horista4 = new ProfessorHorista("Horista4", "000004", "12/08/1974", "doutorado", "Fisica", 0, 45);
		
		//Objetos dos professores integrais
		Professor integral1 = new ProfessorIntegral("Integral1", "000001", "12/06/2010", "doutorado", "Portugues", 3500, "18/03/2000");
		Professor integral2 = new ProfessorIntegral("Integral2", "000002", "10/01/2009" , "doutorado", "Matematica", 3800, "27/03/1986");
		Professor integral3 = new ProfessorIntegral("Integral3", "000003", "12/12/2015", "mestrado", "Fisica", 2800, "25/11/1973");
		Professor integral4 = new ProfessorIntegral("Integral4", "000004", "21/05/2010", "doutorado", "Biologia", 3500, "05/03/1998");
		
		//Objeto professorDao
		ProfessorDAO professores = new ProfessorDAO();
		
		//Adiciona os professores a escola/lista de professores
		professores.addProfessor(horista1);
		professores.addProfessor(horista2);
		professores.addProfessor(horista3);
		professores.addProfessor(horista4);
		professores.addProfessor(integral1);
		professores.addProfessor(integral2);
		professores.addProfessor(integral3);
		professores.addProfessor(integral4);
		
		//Lista os professores
		professores.listaProfessores();
		
		//Retorna quantidade de professores armazenados
		professores.quantProfessores();
		
		//Remove um professor pelo indice
		professores.removeProfessor(3);
		
		//Retorna a quantidade de professores no armazenadas
		professores.quantProfessores();
		
		//Imprime os professores que ainda se encontram armazenados
		professores.listaProfessores();
		
	}

}