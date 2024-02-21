package source;
import java.util.*;

public class DVD extends InventoryItem {

    public DVD(float Price, String Manufacturer) {
    	super(Price);
    	this.Manufacturer=Manufacturer;
    }

    private String Manufacturer;

    public void setManufacturer(String Manufacturer) {
        
    }

}