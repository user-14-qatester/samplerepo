package inheritance;

public class HierarchialChild2 extends HierarchialParent
{
	public void print()
	{
	System.out.println("Hierarchial Child 2");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialChild2 obj1=new HierarchialChild2();
		obj1.display();
		obj1.print();
	}

}
