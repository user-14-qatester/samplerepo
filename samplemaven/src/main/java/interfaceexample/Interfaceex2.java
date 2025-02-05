package interfaceexample;

public class Interfaceex2 implements Interfaceex1
{

	public void show()
	{
		System.out.println("Show method of the class");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Interfaceex2 obj=new Interfaceex2();//object creation
		Interfaceex1 ref=new Interfaceex2();//reference creation
		obj.show();
		ref.display();
	}

	@Override
	public void display() 
	{
		// TODO Auto-generated method stub
		System.out.println("Display method of the interface");
		
	}

}
