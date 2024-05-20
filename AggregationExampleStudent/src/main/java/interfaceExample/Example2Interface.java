package interfaceExample;

import abstractionExample.Example3Interface;
import abstractionExample.Example4Interface;

public class Example2Interface implements Example1Interface,Example3Interface,Example4Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Example2Interface ex=new Example2Interface();
ex.display();
ex.print();
//Interfacename onjname=new Classname();
Example1Interface ex1=new Example2Interface();//with the help of class we can create interface object
ex1.display();//we can only call the methods of this interface
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		int sum=age+b;
		System.out.println("sum is "+sum);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Second Interface method");
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		
	}

}
