package superkeyword;

public class SuperDivisionResult extends SuperAdditionResult
{

	public void divisibility()
	{
		super.add(21, 23);
		if(sum%10==0)
			System.out.println("The addition result is divisible by 10");
		else
			System.out.println("The addition result is not divisible by 10");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SuperDivisionResult obj=new SuperDivisionResult();
		obj.divisibility();
	}

}
