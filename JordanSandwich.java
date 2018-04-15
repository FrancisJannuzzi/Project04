package Project04;

  public class JordanSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public JordanSandwich(SandwichFactory ingredientFactory) {
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
