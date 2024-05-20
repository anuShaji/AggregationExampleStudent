package finalKeyword;

public class ExampleFinal {
final int a=20;//final variables should be initialized
public final void display() {
	System.out.println("Example of final method");
}
//public ExampleFinal() {
//	a=20;//final variables can be changed using constructor
//
//}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ExampleFinal ex=new ExampleFinal();

System.out.println("value of final variable is "+ex.a);
ex.display();
	}

}
