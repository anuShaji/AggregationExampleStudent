package heirarchicalInheritance;



public class Class1 implements Interface1 {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Class1 Method1");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Class1 Method2");
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Class1 Method3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class1 c1=new Class1();
c1.display();
c1.print();
c1.send();
	}
}
