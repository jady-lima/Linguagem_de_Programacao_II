package Aulas.Aula07.Dome_versao1;

public class Locadora 
{
	public static void main(String[] args) 
	{
		CD cd1 = new CD("Fearless", 54, false, "Bom", "Taylor Swift", 15);
		CD cd2 = new CD("Back from the Edge", 48, true, "Bom", "James Arthur", 13);
		DVD dvd1 = new DVD("A Bela e a Fera", 140, true, "Otimo", null);
		
		Database db = new Database();
		
		db.addCD(cd1);
		db.addCD(cd2);
		db.addDVD(dvd1);
		
		db.list();
	}
}
