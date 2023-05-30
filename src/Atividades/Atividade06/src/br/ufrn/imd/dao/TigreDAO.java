package br.ufrn.imd.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.ufrn.imd.modelo.Tigre;

public class TigreDAO {
	private ArrayList<Tigre> tigres;
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	Date dt = new Date();
	
	private static TigreDAO tDao;
	
	public TigreDAO()
	{
		tigres = new ArrayList<Tigre>();
	}
	
	//Singleton
	public static TigreDAO getInstance()
	{
		if(tDao == null)
		{
			tDao = new TigreDAO();
		}
		return tDao;
	}
	
	//Adicionar um novo girafas
	public void addTigres(Tigre t)
	{
		tigres.add(t);
	}
	
	//Imprime os girafas do array
	public void imprimeTigres()
	{
		for (Tigre tigre : tigres) {
			((Tigre)tigre).print();
			consultaTigres(tigre);
			System.out.println("cHEGOU NO PRINT");
		}
	}
	
	//Imprime as consultas dos girafas
	public void consultaTigres(Tigre t)
	{
		if(t.calcularIdade() > 7)
		{
			System.out.println("Elefante consultado");
		}
		else
		{
			System.out.println("Elefante ainda não consultada");
		}
	}
	
	//Calcula a quantidade de alimento para os elefantes
	public double alimentoTigres()
	{
		double alimentoTigres = 0;
		for (Tigre tigre : tigres) {
			alimentoTigres += tigre.getQuantidadeAlimento();
		}
		return alimentoTigres;
	}
	
	//Retorna a quantidade de animais
	public int sizeTigres()
	{
		return tigres.size();
	}
	
	//Retorna a Girafa mais velha
	public void maisVelhoTigres() throws ParseException
	{
		Tigre t = new Tigre();
		dt = formato.parse("01-01-5000");
		t.setDataNascimento(dt);
		
		for (Tigre tigre : tigres) {
			if(t.calcularIdade() <= tigre.calcularIdade())
			{
				t.setNome(tigre.getNome());
				t.setAlimentado(tigre.isAlimentado());
				t.setDataNascimento(tigre.getDataNascimento());
				t.setPeso(tigre.getPeso());
				t.setQuantidadeAlimento(tigre.getQuantidadeAlimento());
				t.setTipoAlimentacao(tigre.getTipoAlimentacao());
				t.setTipoTigre(((Tigre)tigre).getTipoTigre());
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Tigre mais velho: ");
		t.print();
	}
	
	//Retorna a girafa mais nova
	public void maisNovoTigre() throws ParseException
	{
		Tigre t = new Tigre();
		dt = formato.parse("00-00-0000");
		t.setDataNascimento(dt);
		
		for (Tigre tigre : tigres) {
			if(t.calcularIdade() > tigre.calcularIdade())
			{
				t.setNome(tigre.getNome());
				t.setAlimentado(tigre.isAlimentado());
				t.setDataNascimento(tigre.getDataNascimento());
				t.setPeso(tigre.getPeso());
				t.setQuantidadeAlimento(tigre.getQuantidadeAlimento());
				t.setTipoAlimentacao(tigre.getTipoAlimentacao());
				t.setTipoTigre(((Tigre)tigre).getTipoTigre());
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Girafa mais nova: ");
		t.print();
	}
}
