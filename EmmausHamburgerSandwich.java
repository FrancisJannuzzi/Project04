package Project04;


public class EmmausHamburgerSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public EmmausHamburgerSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
  		wheatwrap = ingredientFactory.createWheatWrap();
      lettuce = ingredientFactory.createLettuce();
      mustard = ingredientFactory.createMustard();
      onion = ingredientFactory.createOnion();
      hamburger = ingredientFactory.createHamburger();
  	}
}
