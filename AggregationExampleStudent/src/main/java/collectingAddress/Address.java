package collectingAddress;

public class Address {
String street;
String city;
String state;
Student stu;

public Address(String street,String city,String state,Student stu) {
	this.street=street;
	this.city=city;
	this.state=state;
	this.stu=stu;
}

public void  getAddressDetails() {
	System.out.println("STUDENT DETAILS");
	System.out.println("_______________");
	
	System.out.println("\nName: "+ stu.name + "  Roll number "+  + stu.rno);
	System.out.println("\nStreet " +street);
	System.out.println("\nCity " + city);
	System.out.println("\nState "+state);

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student st=new Student("Anupama", 20);
Address ad=new Address("K2", "k4", "k", st);
ad.getAddressDetails();
	}

}
