package Project04;

public class EmmausChickenSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public EmmausChickenSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
      wheatwrap = ingredientFactory.createWheatWrap();
      lettuce = ingredientFactory.createLettuce();
      mayonnaise = ingredientFactory.createMayonnaise();
      onion = ingredientFactory.createOnion();
      tomato = ingredientFactory.createTomato();
      chicken = ingredientFactory.createChicken();
  	}
}
