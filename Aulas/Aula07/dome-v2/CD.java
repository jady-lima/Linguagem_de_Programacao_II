
public class CD extends Item {
   
    private String artist;
    private int numberOfTracks;

    public CD(){
        // método construtor vazio
    }

    public String getArtist(){
        return artist;
    }

    public int getNumberOfTracks(){
        return numberOfTracks;
    }
	
	public void setArtist(String art){
		this.artist = art;
	}
	
	public void setNumberOfTracks(int nt){
		this.numberOfTracks = nt;
	}
	
	@Override
	public void print() {
		//System.out.print("Title: " + getTitle() + " (" + getPlayingTime() + " mins) ");
		super.print();
		System.out.print("Artist: " + getArtist() + " - Number of Tracks: " + getNumberOfTracks() );
        if(super.getOwn()) {
            System.out.println(" *** ");
        } else {
            System.out.println();
        }
        System.out.println("Comment: " + getComment());
	}

}
