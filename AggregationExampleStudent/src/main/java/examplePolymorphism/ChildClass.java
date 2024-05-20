package examplePolymorphism;

public class ChildClass extends ParentClass{
public  void display() {
	super.display();
	System.out.println("Child Polymorphism");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass obj=new ChildClass();
		obj.display();
		
	}

}
