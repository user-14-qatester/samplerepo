package superkeyword;

public class SuperMethodChild extends SuperMethod
{
	public void display()
	{
		
		System.out.println("Child Class");
		super.display();
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SuperMethodChild obj=new SuperMethodChild();
		obj.display();

	}

}
