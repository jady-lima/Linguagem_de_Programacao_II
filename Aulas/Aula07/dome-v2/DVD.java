
public class DVD extends Item {
    
	private String director;

    public DVD(){
        // método construtor vazio
    }

    public String getDirector(){
        return director;
    }
	
	public void setDirector(String diretor){
		this.director = diretor;
	}
	
	@Override
	public void print() {
		//System.out.print("Title: " + getTitle() + " (" + getPlayingTime() + " mins) ");
		super.print();
		System.out.print("Director: " + getDirector());
        if(super.getOwn()) {
            System.out.println(" *** ");
        } else {
            System.out.println();
        }
        System.out.println("Comment: " + getComment());
	}	
}
