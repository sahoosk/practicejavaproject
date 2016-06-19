package pkg004_DecoratorPattern;

public class PlainPizza implements Pizza {

	@Override
	public String getDescription() {
		
		return "Thin Dough";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 4.0;
	}

}
