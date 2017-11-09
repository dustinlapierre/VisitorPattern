
public class LoyaltyProgramVisitor implements Visitor
{
	public LoyaltyProgramVisitor(){};

	@Override
	public double visit(AlcoholProduct alcohol) 
	{
		//no loyalty discount on alcohol
		return alcohol.getPrice() * 1.18;
	}

	@Override
	public double visit(ElectronicProduct electronic) 
	{
		//10% savings on electronics
		return (electronic.getPrice() * 0.90) * 1.09;
	}

	@Override
	public double visit(FoodProduct food) 
	{
		//25% savings on food
		return (food.getPrice() * 0.75);
	}

}
