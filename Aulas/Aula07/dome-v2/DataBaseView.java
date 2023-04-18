
public class DataBaseView {

	public static void main(String[] args) {
		
		// Objeto Database
		Database db = new Database();
		
		// Objeto DVD
		DVD dvd = new DVD();
		
		// Objeto CD
		CD cd = new CD();
		
		// Objeto DVD
		dvd.setTitle("Pink Floyd");
		dvd.setPlayingTime(125);
		dvd.setDirector("Roger Waters");
		dvd.setComment("Very good");
		dvd.setOwn(true);
		db.addItem(dvd);
		
		// Objeto CD
		cd.setTitle("Esse cara sou Eu");
		cd.setPlayingTime(100);
		cd.setNumberOfTracks(8);
		cd.setArtist("Roberto Carlos");
		cd.setComment("Muito bom");
		cd.setOwn(true);
		db.addItem(cd);
		
		db.list();

	}

}
