package Project04;

public class ChickenSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public ChickenSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
      if(ingredientFactory instanceof EmmausSandwichFactory) {
        wheatwrap = ingredientFactory.createWheatWrap();
        lettuce = ingredientFactory.createLettuce();
        mayonnaise = ingredientFactory.createMayonnaise();
        onion = ingredientFactory.createOnion();
        tomato = ingredientFactory.createTomato();
        chicken = ingredientFactory.createChicken();
  	  }
      else if (ingredientFactory instanceof AllentownSandwichFactory) {
        bun = ingredientFactory.createBun();
        lettuce = ingredientFactory.createLettuce();
        mayonnaise = ingredientFactory.createMayonnaise();
        chicken = ingredientFactory.createChicken();
      }else {
        wheatwrap = ingredientFactory.createWheatWrap();
        lettuce = ingredientFactory.createLettuce();
        cheese = ingredientFactory.createCheese();
        tomato = ingredientFactory.createTomato();
        mustard = ingredientFactory.createMustard();
        chicken = ingredientFactory.createChicken();
      }
    }
}
