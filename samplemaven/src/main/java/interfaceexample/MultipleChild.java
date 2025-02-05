package interfaceexample;

public class MultipleChild implements MultipleA,MultipleB
{

	public void display()
	{
	   System.out.println("Display method of class MultipleChild ");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
   
		MultipleChild obj=new MultipleChild();
		obj.show();
		obj.print();
		obj.display();
	}

	@Override
	public void show()
	{
		// TODO Auto-generated method stub
	System.out.println("Show method of Interface MultipleB");	
	}

	@Override
	public void print() 
	{
		// TODO Auto-generated method stub
		System.out.println("Print method of Interface MultipleA");
	}

}
