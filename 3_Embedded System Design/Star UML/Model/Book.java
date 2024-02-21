package source;
import java.util.*;

public class Book extends InventoryItem {

	  private String Author;
	  int data=50;
    public Book() {
    }
    
    public Book(int price)
    {
    	super(price);
    	//this.Author=Author;
    	
    }
    public void setAuthor(String Author) {
    	
    	
    }
    public int getPrice() {
        
        return data;
    }

}