package br.ufrn.imd.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.ufrn.imd.modelo.Elefante;

public class ElefanteDAO {
	private ArrayList<Elefante> elefantes;
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	Date dt = new Date();
	public Elefante e = new Elefante();
	
	private static ElefanteDAO eDao;
	
	public ElefanteDAO()
	{
		elefantes = new ArrayList<Elefante>();
	}
	
	//Singleton
	public static ElefanteDAO getInstance()
	{
		if(eDao == null)
		{
			eDao = new ElefanteDAO();
		}
		return eDao;
	}
	
	//Adicionar um novo elefante
	public void addElefante(Elefante e)
	{
		elefantes.add(e);
	}
	
	//Imprime os elefantes do array
	public void imprimeElefantes()
	{
		for (Elefante elefante : elefantes) {
			((Elefante)elefante).print();
			consultaElefantes(elefante);
		}
	}
	
	//Imprime as consultas dos elefantes
	public void consultaElefantes(Elefante e)
	{
		if(e.calcularIdade() > 7)
		{
			System.out.println("Elefante consultado");
		}
		else
		{
			System.out.println("Elefante ainda não consultada");
		}
	}
	
	//Calcula a quantidade de alimento para os elefantes
	public double alimentoElefantes()
	{
		double alimentoElefantes = 0;
		for (Elefante elefante : elefantes) {
			alimentoElefantes += elefante.getQuantidadeAlimento();
		}
		return alimentoElefantes;
	}
	
	//Retorna a quantidade de animais
	public int sizeElefantes()
	{
		return elefantes.size();
	}
	
	//Retorna o elefante mais velho
	public void maisVelhoElefante() throws ParseException
	{
		Elefante e = new Elefante();
		dt = formato.parse("01-01-5000");
		e.setDataNascimento(dt);
		
		for (Elefante elefante : elefantes) {
			if(e.calcularIdade() <= elefante.calcularIdade())
			{
				e.setNome(elefante.getNome());
				e.setAlimentado(elefante.isAlimentado());
				e.setDataNascimento(elefante.getDataNascimento());
				e.setPeso(elefante.getPeso());
				e.setQuantidadeAlimento(elefante.getQuantidadeAlimento());
				e.setTipoAlimentacao(elefante.getTipoAlimentacao());
				e.setTamanhoTromba(((Elefante)elefante).getTamanhoTromba());
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Elefante mais velho: ");
		e.print();
	}
	
	//Retorna o elefante mais novo
	public void maisNovoElefante() throws ParseException
	{
		Elefante e = new Elefante();
		dt = formato.parse("00-00-0000");
		e.setDataNascimento(dt);
		
		for (Elefante elefante : elefantes) {
			if(e.calcularIdade() > elefante.calcularIdade())
			{
				e.setNome(elefante.getNome());
				e.setAlimentado(elefante.isAlimentado());
				e.setDataNascimento(elefante.getDataNascimento());
				e.setPeso(elefante.getPeso());
				e.setQuantidadeAlimento(elefante.getQuantidadeAlimento());
				e.setTipoAlimentacao(elefante.getTipoAlimentacao());
				e.setTamanhoTromba(((Elefante)elefante).getTamanhoTromba());
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Elefante mais novo: ");
		e.print();
	}
}
