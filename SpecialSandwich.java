package Project04;

  public class SpecialSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public SpecialSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
      if(this.ingredientFactory instanceof EmmausSandwichFactory){
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
      else if (this.ingredientFactory instanceof AllentownSandwichFactory){
        bun = ingredientFactory.createBun();
        lettuce = ingredientFactory.createLettuce();
        onion = ingredientFactory.createOnion();
        tomato = ingredientFactory.createTomato();
        hamburger = ingredientFactory.createHamburger();
        cheese = ingredientFactory.createCheese();
        mayonnaise = ingredientFactory.createMayonnaise();
        ketchup = ingredientFactory.createKetchup();
      }
      else {
        wheatwrap = ingredientFactory.createWheatWrap();
        lettuce = ingredientFactory.createLettuce();
        onion = ingredientFactory.createOnion();
        chicken = ingredientFactory.createChicken();
        mayonnaise = ingredientFactory.createMayonnaise();
        ketchup = ingredientFactory.createKetchup();
      }
  	}
}
