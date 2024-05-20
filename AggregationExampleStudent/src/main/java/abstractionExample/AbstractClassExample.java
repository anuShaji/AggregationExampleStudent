package abstractionExample;

public abstract class AbstractClassExample {
	public AbstractClassExample() {
		System.out.println("Hello this is in Abstract class");
	}
public  void hello() {
	System.out.println("Instance method");
}
public static void send() {
	System.out.println("Static method");
}
public abstract void display();//method declaration

}
