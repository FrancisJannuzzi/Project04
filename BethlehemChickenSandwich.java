package Project04;

public class BethlehemChickenSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public BethlehemChickenSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
      wheatwrap = ingredientFactory.createWheatWrap();
      lettuce = ingredientFactory.createLettuce();
      cheese = ingredientFactory.createCheese();
      tomato = ingredientFactory.createTomato();
      mustard = ingredientFactory.createMustard();
      chicken = ingredientFactory.createChicken();
  	}
}
