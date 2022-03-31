package constuctor;

public class student {
	String name;
	int age;
	
	student(int age,String name)
	{
		this.age=age;
		this.name=name;
		
	}
	public void didplay() {
		System.out.println("student age: " + this.age);
		System.out.println("student name: " + this.name);
		
	}
	
	
}


