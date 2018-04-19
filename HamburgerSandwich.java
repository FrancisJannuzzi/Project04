package Project04;


public class HamburgerSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public HamburgerSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
      if(ingredientFactory instanceof EmmausSandwichFactory){
    		wheatwrap = ingredientFactory.createWheatWrap();
        lettuce = ingredientFactory.createLettuce();
        mustard = ingredientFactory.createMustard();
        onion = ingredientFactory.createOnion();
        hamburger = ingredientFactory.createHamburger();
      }else if (ingredientFactory instanceof AllentownSandwichFactory){
        bun = ingredientFactory.createBun();
        lettuce = ingredientFactory.createLettuce();
        mayonnaise = ingredientFactory.createMayonnaise();
        tomato = ingredientFactory.createTomato();
        cheese = ingredientFactory.createCheese();
        hamburger = ingredientFactory.createHamburger();
      }else {
        bun = ingredientFactory.createBun();
        onion = ingredientFactory.createOnion();
        mustard = ingredientFactory.createMustard();
        ketchup = ingredientFactory.createKetchup();
        hamburger = ingredientFactory.createHamburger();
      }
  	}
}
