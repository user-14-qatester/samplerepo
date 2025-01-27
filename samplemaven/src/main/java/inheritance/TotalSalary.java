package inheritance;

import java.util.Scanner;

public class TotalSalary extends CalculateHraPf
{
double total;
public void calculateTotalSalary()
{
	total=basicPay+hra+pf+deduction+bonus;	
}
public void displaySalarySlip()
{
	System.out.println("Basic Pay : "+basicPay);
	System.out.println("Deduction : "+deduction);
	System.out.println("HRA : "+hra);
	System.out.println("Provident Fund : "+pf);
	System.out.println("Bonus : "+bonus);
	System.out.println("Total Salary : "+total);
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TotalSalary obj=new TotalSalary();
		obj.getDetails();
		obj.calculate();
		obj.calculateTotalSalary();
		obj.displaySalarySlip();
		
	}

}
