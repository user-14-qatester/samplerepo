package polymorphism;

public class Offseason extends Onseason
{

	public void discount(double p)
	{
		double discount;
		double newPrice;
		discount=p*15/100;
		newPrice=p-discount;
		System.out.println("Price after applying offseason discount: "+newPrice);
		super.discount(4000);
	}
	
	public static void main(String args[])
	{
		Offseason off=new Offseason();
		off.discount(5000);
	}
}
