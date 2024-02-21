package source;
import java.util.*;


public class Clock {

    
    public Clock() {
    }

    private int hr;
    private int min;
    private int sec;
    private String ampm;

    public Clock(int hr, int min, int sec, String ampm) {
        setHr(hr);
        setMin(min);
        setSec(sec);
        setAmPm(ampm);
    }

    
    public int getHr() {
        // TODO implement here
        return this.hr;
    }

    
    public int getMin() {
        // TODO implement here
        return this.min;
    }

   
    public int getSec() {
        // TODO implement here
        return this.sec;
    }

    
    public String getAmPm() {
        // TODO implement here
        return this.ampm;
    }

   
    public void setHr(int hr) {
        // TODO implement here
    	this.hr=hr;
        
    }

   
    public void setMin(int min) {
        // TODO implement here
    	this.min=min;
       
    }

    
    public void setSec(int sec) {
        // TODO implement here
    	this.sec=sec;
       
    }

    
    public void setAmPm(String ampm) {
        // TODO implement here
    	this.ampm=ampm;
        
    }

    
    public static boolean isValid(Clock c1) {
        if(c1.getHr()<=12 && c1.getMin()<=59 && c1.getSec()<=59)
        {
        	if(c1.getAmPm().equals("AM") || c1.getAmPm().equals("PM"))
        		return true;
        }
        return false;
    }

}