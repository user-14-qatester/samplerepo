package inheritance;

public class MultilevelChild extends MultilevelParentB
{
public void display2()
{
	System.out.println("Child class");
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        MultilevelChild obj=new MultilevelChild();
        obj.display();
        obj.display1();
        obj.display2();
	}

}
