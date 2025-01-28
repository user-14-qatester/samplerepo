package aggregation;

public class Address
{
	String address;
	Student ref;
	
	public void getAddress(String address,Student ref)
	{
		this.address=address;
		this.ref=ref;
	}
	
	public void display()
	{
		System.out.println("Student Name: "+ref.name);
		System.out.println("Roll No: "+ref.rollNo);
		System.out.println("Address: "+address);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     Student s=new Student();
     Address a=new Address();
     s.get("Nia", 37);
     a.getAddress("Flat 3G,Skyline Apartments,TVM", s);
     a.display();
     
	}

}
