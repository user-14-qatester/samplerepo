package inheritance;

public class HierarchialChild1 extends HierarchialParent
{
public void print()
{
System.out.println("Hierarchial Child 1");	
}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		HierarchialChild1 obj1=new HierarchialChild1();
		obj1.display();
		obj1.print();
	}

}
