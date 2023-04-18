import java.util.ArrayList;

public class Database {
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database(){
        items = new ArrayList<Item>();
    }

    public void addItem(Item theItem){
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored items to the
     * text terminal.
     */
    public void list(){
        for(Item item : items) {
            item.print();
            System.out.println();   // empty line between items
        }
    }
}
