package person;

public class Teacher extends Person {
	
	private int numofcourses=0;
	private String courses[]=new String[20];
	int i=0;
	
	public Teacher(String name,String address)
	 {
		 super(name,address);
	   }
	 public boolean addcourse(String course)
	 {
		 int k=0;
		 if(k==i)
		 {
		 courses[i]=course;
		 i++;
		 numofcourses++;
		 return true;
		 }
		 else
		 {
			 for(;k<i;k++)
			 {
				 if(courses[k].equals(course))
					 return false;
			 }}
				 
				 courses[i]=course;
				 i++;
				 numofcourses++;
				return true; 
				 }
	 public boolean removecourse(String course)
	 {
		 int k=0;
		 if(k==i)
		 return false;
		 else
		 {
			 for(;k<i;k++)
			 {
				 if(courses[k].equals(course))
				 {
					 for(;k<i;k++)
						 courses[k]=courses[k+1];
						
						 i--;
						 numofcourses--;
						 return true;
						 }
					 
			 }}
				 
				return false; 
				 }
		 public String toString()
		 {
		     return "the name is "+getname()+" and the address is "+getaddress();
		 }
}
