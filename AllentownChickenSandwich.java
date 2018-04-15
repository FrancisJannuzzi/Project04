package Project04;

public class AllentownChickenSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public AllentownChickenSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
      bun = ingredientFactory.createBun();
      lettuce = ingredientFactory.createLettuce();
      mayonnaise = ingredientFactory.createMayonnaise();
      chicken = ingredientFactory.createChicken();
  	}
}
