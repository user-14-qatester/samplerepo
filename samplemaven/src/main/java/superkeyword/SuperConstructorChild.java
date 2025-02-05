package superkeyword;

public class SuperConstructorChild extends SuperConstructor
{
	public SuperConstructorChild()
	{
		super(10,20);
		System.out.println("Child Class");
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		SuperConstructorChild obj=new SuperConstructorChild();
		
	}

}
