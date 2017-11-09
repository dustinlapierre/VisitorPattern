
public class ElectronicProduct implements Visitable
{
	private double price;
	private String name;
	
	ElectronicProduct(double price, String name)
	{
		this.price = price;
		this.name = name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getName()
	{
		return name;
	}

	@Override
	public double accept(Visitor visitor) 
	{
		return visitor.visit(this);
	}
}
