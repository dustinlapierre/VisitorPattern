//Copyright Dustin Lapierre 11/08/2017
public class Main 
{

	public static void main(String[] args)
	{
		TaxVisitor tax = new TaxVisitor();
		LoyaltyProgramVisitor vip = new LoyaltyProgramVisitor();
		
		FoodProduct bread = new FoodProduct(3.49, "Wonder Bread");
		AlcoholProduct beer = new AlcoholProduct(9.99, "Blue Moon 6'er");
		ElectronicProduct laptop = new ElectronicProduct(599.99, "Dell Inspiron 2100");
		
		//Customer with no loyalty
		System.out.println("Prices with tax");
		
		System.out.printf("%s%.2f%n", bread.getName() + ": ", bread.accept(tax));
		System.out.printf("%s%.2f%n", beer.getName() + ": ", beer.accept(tax));
		System.out.printf("%s%.2f%n", laptop.getName() + ": ", laptop.accept(tax));
		System.out.println();
		
		//Loyal customer
		System.out.println("Prices with tax and loyalty discount");
		
		System.out.printf("%s%.2f%n", bread.getName() + ": ", bread.accept(vip));
		System.out.printf("%s%.2f%n", beer.getName() + ": ", beer.accept(vip));
		System.out.printf("%s%.2f%n", laptop.getName() + ": ", laptop.accept(vip));
	}

}
