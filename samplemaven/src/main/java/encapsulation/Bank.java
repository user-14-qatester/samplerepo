package encapsulation;

import java.util.Scanner;

public class Bank 
{
	public int num;
	
	public int setter(int n)
	{
		User user=new User();
		user.set(n);
		num=user.get();
		return num;
		
	}
	
	public void validate(int n)
	{
		
		switch(n)
		{
		case 1001:System.out.println("The pin "+n+" is valid");
		          System.out.println("Enter the amount to withdraw");
		          break;
		case 1234:System.out.println("The pin "+n+" is valid");
		          System.out.println("Enter the amount to withdraw");
                  break;
		case 1212:System.out.println("The pin "+n+" is valid");
		          System.out.println("Enter the amount to withdraw");
                  break;
        default:System.out.println("The pin "+n+" is not valid");
                System.out.println("Enter the correct PIN to withdraw any amount");
                break;
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bank bank=new Bank();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the PIN");
		int pinnumber=obj.nextInt();
		int pn=bank.setter(pinnumber);
		bank.validate(pn);

	}

}
