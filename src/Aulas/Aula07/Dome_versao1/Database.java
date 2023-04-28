package Aulas.Aula07.Dome_versao1;

import java.util.ArrayList;

public class Database 
{
	private ArrayList<CD> cds;
	private ArrayList<DVD> dvds;
	
	//Construtor da classe
	public Database()
	{
		cds = new ArrayList<CD>();
		dvds = new ArrayList<DVD>();
	}
	
	//Adiciona um novo CD
	public void addCD (CD cd)
	{
		cds.add(cd);
	}
	
	//Adiciona um novo DVD
	public void addDVD (DVD dvd)
	{
		dvds.add(dvd);
	}
	
	//Metodo de listagem dos CDs e DVDs armazenados
	public void list()
	{
		for (CD cd: cds)
		{
			cd.print();
			System.out.println("-------------");
		}
		for (DVD dvd: dvds)
		{
			dvd.print();
			System.out.println("-------------");
		}
	}
}
