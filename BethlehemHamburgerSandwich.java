package Project04;

public class BethlehemHamburgerSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public BethlehemHamburgerSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
  		bun = ingredientFactory.createBun();
      onion = ingredientFactory.createOnion();
      mustard = ingredientFactory.createMustard();
      ketchup = ingredientFactory.createKetchup();
      hamburger = ingredientFactory.createHamburger();
  	}
}
