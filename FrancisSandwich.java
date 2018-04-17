package Project04;

  public class FrancisSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public FrancisSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
  		bun = ingredientFactory.createBun();
      lettuce = ingredientFactory.createLettuce();
      onion = ingredientFactory.createOnion();
      tomato = ingredientFactory.createTomato();
      hamburger = ingredientFactory.createHamburger();
      cheese = ingredientFactory.createCheese();
      mayonnaise = ingredientFactory.createMayonnaise();
      ketchup = ingredientFactory.createKetchup();
  	}
}
