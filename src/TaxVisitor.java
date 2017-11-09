
public class TaxVisitor implements Visitor
{
	public TaxVisitor(){};

	@Override
	public double visit(AlcoholProduct alcohol) 
	{
		return alcohol.getPrice() * 1.18;
	}

	@Override
	public double visit(ElectronicProduct electronic) 
	{
		return electronic.getPrice() * 1.09;
	}

	@Override
	public double visit(FoodProduct food) 
	{
		return food.getPrice();
	}
	
}
