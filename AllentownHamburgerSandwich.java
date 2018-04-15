package Project04;

public class AllentownHamburgerSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public AllentownHamburgerSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
  		bun = ingredientFactory.createBun();
      lettuce = ingredientFactory.createLettuce();
      mayonnaise = ingredientFactory.createMayonnaise();
      tomato = ingredientFactory.createTomato();
      cheese = ingredientFactory.createCheese();
      hamburger = ingredientFactory.createHamburger();
  	}
}
