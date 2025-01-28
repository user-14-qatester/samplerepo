package polymorphism;

public class Onseason 
{
    
	public void discount(double p)
	{
		double discount;
		double newPrice;
		discount=p*40/100;
		newPrice=p-discount;
		System.out.println("Price after applying onseason discount: "+newPrice);
	}
}
