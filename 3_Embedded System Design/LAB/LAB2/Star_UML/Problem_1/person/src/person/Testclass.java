package person;

public class Testclass{
	
public static void main(String[] args)
{

	Person p=new Person("punith","bangalore");
	System.out.println(p.toString());
	
	Student s=new Student("punith","bangalore");
	
	//adding course and grades to student
	s.addcoursegrade("java",5);
	s.addcoursegrade("datastructure",5);
	s.addcoursegrade("RTOS",5);
	s.addcoursegrade("MCA",5);
	s.printgrades();
	
	//checking the average grade
	assert(s.getaveragegrade()==5.0);

	 //adding course to teacher
	Teacher t=new Teacher("malli sir","udupi");
	assert(t.addcourse("DBPJ")==true);
	assert(t.addcourse("Embedded system design")==true);
	assert(t.addcourse("datastructure")==true);
	assert(t.addcourse("datastructure")==false);
	//assert(t.addcourse("Embedded system design")==true);
	
	assert(t.removecourse("DBPJ")==true);
	//assert(t.removecourse("aca")==true);
	assert(t.addcourse("DBPJ")==true);
	assert(t.removecourse("DBPJ")==true);
	}

}
