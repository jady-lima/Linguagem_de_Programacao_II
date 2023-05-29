package br.ufrn.imd.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.ufrn.imd.modelo.Girafa;

public class GirafaDAO {
	private ArrayList<Girafa> girafas;
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	Date dt = new Date();
	
	private static GirafaDAO gDao;
	
	public GirafaDAO()
	{
		girafas = new ArrayList<Girafa>();
	}
	
	//Singleton
	public static GirafaDAO getInstance()
	{
		if(gDao == null)
		{
			gDao = new GirafaDAO();
		}
		return gDao;
	}
	
	//Adicionar um novo girafas
	public void addGirafa(Girafa g)
	{
		girafas.add(g);
	}
	
	//Imprime os girafas do array
	public void imprimeGirafas()
	{
		for (Girafa girafa : girafas) {
			((Girafa)girafa).print();
			consultaGirafas(girafa);
		}
	}
	
	//Imprime as consultas dos girafas
	public void consultaGirafas(Girafa g)
	{
		if(g.calcularIdade() > 7)
		{
			System.out.println("Elefante consultado");
		}
		else
		{
			System.out.println("Elefante ainda não consultada");
		}
	}
	
	//Calcula a quantidade de alimento para os elefantes
	public double alimentoGirafas()
	{
		double alimentoGirafas = 0;
		for (Girafa girafa : girafas) {
			alimentoGirafas += girafa.getQuantidadeAlimento();
		}
		return alimentoGirafas;
	}
	
	//Retorna a quantidade de animais
	public int sizeGirafas()
	{
		return girafas.size();
	}
	
	//Retorna a Girafa mais velha
	public void maisVelhoGirafas() throws ParseException
	{
		Girafa g = new Girafa();
		dt = formato.parse("01-01-5000");
		g.setDataNascimento(dt);
		
		for (Girafa girafa : girafas) {
			if(g.calcularIdade() <= girafa.calcularIdade())
			{
				g.setNome(girafa.getNome());
				g.setAlimentado(girafa.isAlimentado());
				g.setDataNascimento(girafa.getDataNascimento());
				g.setPeso(girafa.getPeso());
				g.setQuantidadeAlimento(girafa.getQuantidadeAlimento());
				g.setTipoAlimentacao(girafa.getTipoAlimentacao());
				g.setTamanhoLingua(((Girafa)girafa).getTamanhoLingua());
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Girafa mais velha: ");
		g.print();
	}
	
	//Retorna a girafa mais nova
	public void maisNovoGirafas() throws ParseException
	{
		Girafa g = new Girafa();
		dt = formato.parse("00-00-0000");
		g.setDataNascimento(dt);
		
		for (Girafa girafa : girafas) {
			if(g.calcularIdade() > girafa.calcularIdade())
			{
				g.setNome(girafa.getNome());
				g.setAlimentado(girafa.isAlimentado());
				g.setDataNascimento(girafa.getDataNascimento());
				g.setPeso(girafa.getPeso());
				g.setQuantidadeAlimento(girafa.getQuantidadeAlimento());
				g.setTipoAlimentacao(girafa.getTipoAlimentacao());
				g.setTamanhoLingua(((Girafa)girafa).getTamanhoLingua());
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Girafa mais nova: ");
		g.print();
	}

}
