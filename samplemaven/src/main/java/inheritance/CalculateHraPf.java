package inheritance;

public class CalculateHraPf extends GetSalaryDetails
{
	double hra,pf;
public void calculate()
{
	hra=basicPay*5/100;
	pf=basicPay*20/100;
}
}
