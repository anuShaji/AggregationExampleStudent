package abstractionExample;

public class ImplementationAbstract extends AbstractClassExample{

	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Example Abstraction");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ImplementationAbstract impl=new ImplementationAbstract();
impl.display();

AbstractClassExample.send();
//ImplementationAbstract ca=new AbstractClassExample();
AbstractClassExample ob=new ImplementationAbstract();
ob.hello();

	}

}
