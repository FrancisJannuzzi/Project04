package Project04;

  public class GeorgeSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public GeorgeSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
  		wheatwrap = ingredientFactory.createWheatWrap();
      lettuce = ingredientFactory.createLettuce();
      onion = ingredientFactory.createOnion();
      chicken = ingredientFactory.createChicken();
      mayonnaise = ingredientFactory.createMayonnaise();
      ketchup = ingredientFactory.createKetchup();
  	}
}
