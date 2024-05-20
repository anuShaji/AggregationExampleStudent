package heirarchicalInheritance;

import interfaceExample.Example1Interface;
import interfaceExample.Example2Interface;

public class Class2 implements Interface1{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Class2 Method1");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Class2 Method2");
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		System.out.println("Class2 Method3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Class2 c2=new Class2();
c2.display();
c2.print();
c2.send();
	}
}
