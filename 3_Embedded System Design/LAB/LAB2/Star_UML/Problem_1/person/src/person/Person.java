package person;

public class Person {
	
private String name;
private String address;

public Person(String name,String address)
{
	this.name=name;
	this.address=address;
	}
public String getname()
{
	return name;
}
public String getaddress()
{
	return address;
}
public void setaddress(String address)
{
	this.address=address;
}

public String toString()
{
	return "the name is "+getname()+" and the address is "+getaddress();
}




}
