package Project04;

public class HamSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public HamSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
      if(ingredientFactory instanceof EmmausSandwichFactory) {
    		bun = ingredientFactory.createBun();
        cheese = ingredientFactory.createCheese();
        mustard = ingredientFactory.createMustard();
        ham = ingredientFactory.createHam();
  	  }
      else if (ingredientFactory instanceof AllentownSandwichFactory) {
        bun = ingredientFactory.createBun();
        cheese = ingredientFactory.createCheese();
        tomato = ingredientFactory.createTomato();
        onion = ingredientFactory.createOnion();
        ham = ingredientFactory.createHam();
      }else {
        bun = ingredientFactory.createBun();
        lettuce = ingredientFactory.createLettuce();
        tomato = ingredientFactory.createTomato();
        mayonnaise = ingredientFactory.createMayonnaise();
        ham = ingredientFactory.createHam();
      }
    }
}
