package person;

public class Student extends Person{
	
	private int numofcourses=0;
	private String courses[]=new String[20];
	private int grades[]=new int[20];
	int i=0;
	
 public Student(String name,String address)
 {
	 super(name,address);
   }
 public void addcoursegrade(String course,int grade)
 {
	 courses[i]=course;
	 grades[i]=grade;
	 i++;
	 }
 public void printgrades()
 {
	 int k=0;
	 if(k==i)
		 System.out.println("There is nothing to print");
	 
	 else
	 {
		 for(;k<i;k++)
		 {
			 System.out.println("course is "+courses[k]+" and grade is "+grades[k]);
			  }}
 }
 
 public double getaveragegrade()
 {
	 int k=0;
	 int sum=0;
	 if(k==i)
		return 0;
	 else
	 {
		 for(;k<i;k++)
		 {
			 sum+=grades[k];
			  }
		 return (sum/i);
		 }
	 
 }
 
public String toString()
{
    return "the name is "+getname()+" and the address is "+getaddress();
}}
 
