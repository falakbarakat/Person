package se.lexicon.person;

public class Person {
	private int countId=4465;
    private final int id=0;
	private String firstName;
	private String lastName;
	private int age;
 
	public Person(int id,String firstName,String lastName,int age) {
		 id=countId++;
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.age=age;
		
	}

	public int getCountId() {
		return countId;
	}

	public void setCountId(int countId) {
		this.countId = countId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age>0) {
		this.age = age;
		}
		else {
			System.out.println("not valid");
		}
	}
@Override
	public String toString() {
		return id+""+firstName+""+lastName+""+age;
	}

	public void information() {
	  System.out.println("---Person#"+id+"---\n"+
	                    "firstName:"+firstName+"\n"+
	                    "lastName:"+lastName+"\n"+
	  	                    "age:"+age+"\n");

	}
}

