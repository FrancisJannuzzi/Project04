package Project04;

public class BethlehemHamSandwich {
  public class BethlehemHamSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public BethlehemHamSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
  		bun = ingredientFactory.createBun();
      lettuce = ingredientFactory.createLettuce();
      tomato = ingredientFactory.createTomato();
      mayonnaise = ingredientFactory.createMayonnaise();
      ham = ingredientFactory.createHam();
  	}
}
