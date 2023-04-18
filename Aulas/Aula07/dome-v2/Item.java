
public class Item {
	
    protected String title;
    protected int playingTime;
    protected boolean gotIt;
    protected String comment;

    
    public Item() {
        gotIt = false;
        comment = "";
    }
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getTitle(){
		return this.title;
	}
	
	public void setPlayingTime(int playing){
		this.playingTime = playing;
	}
	
	public int getPlayingTime(){
		return this.playingTime;
	}

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }

    public void setOwn(boolean ownIt){
        gotIt = ownIt;
    }

    public boolean getOwn(){
        return gotIt;
    }

    public void print() {
        System.out.print("title: " + title + " (" + playingTime + " mins)");
        if(gotIt) {
            System.out.println("*");
        } else {
            System.out.println();
        }
        System.out.println("    " + comment);
    }
}
