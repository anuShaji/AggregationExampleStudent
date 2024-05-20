package multilevelnheritanceInteface;

public class Class1MultilevelInterface implements Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class1MultilevelInterface ci=new Class1MultilevelInterface();
ci.add();
ci.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Mutlilevel Inheritance using Interface");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=10,b=20;
		int sum=a+b;
		System.out.println("Sum is "+sum);
	}

}
