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
      hamburger = ingredientFactory.createHamburger();
      mayonnaise = ingredientFactory.createMayonnaise();
      ketchup = ingredientFactory.createKetchup();
      mustard = ingredientFactory.createMustard();
      tomato = ingredientFactory.createTomato();
      cheese = ingredientFactory.createCheese();
  	}
}
