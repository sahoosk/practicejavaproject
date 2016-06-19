package pkg004_DecoratorPattern;

public class TomatoSauce extends ToppingDecorator{

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);

		System.out.println("Adding Tomato Sauce");

	}

	public String getDescription() {

		return tempPizza.getDescription() + " " + "tomato sauce";

	}

	public double getCost() {

		return tempPizza.getCost() + 0.25;
	}
	
	
}
