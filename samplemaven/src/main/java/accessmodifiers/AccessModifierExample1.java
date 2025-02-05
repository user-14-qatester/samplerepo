package accessmodifiers;

public class AccessModifierExample1 
{
	
public void display1()
{
	System.out.println("Public Method display1()");
}

private void display2()
{
	System.out.println("Private Method display2()");
}

protected void display3()
{
	System.out.println("Protected Method display3()");
}

void display4()
{
	System.out.println("Default Method display4()");
}

public static void main(String[] args)
{
		// TODO Auto-generated method stub
AccessModifierExample1 obj=new AccessModifierExample1();
obj.display1();
obj.display2();
obj.display3();
obj.display4();

}

}
