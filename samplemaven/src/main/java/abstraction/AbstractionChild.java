package abstraction;

public class AbstractionChild extends AbstractionParent
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AbstractionChild obj1=new AbstractionChild();//object creation
		AbstractionParent obj=new AbstractionChild();//reference creation
		obj.display();
		obj.show();
		obj1.print();

	}

	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Sum: "+c);
	}
	
	public void print()
	{
		System.out.println("Print method of child class");
	}

}
