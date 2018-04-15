package Project04;

public class AllentownHamSandwich {
  public class AllentownHamSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public AllentownHamSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
  		bun = ingredientFactory.createBun();
      cheese = ingredientFactory.createCheese();
      tomato = ingredientFactory.createTomato();
      onion = ingredientFactory.createOnion();
      ham = ingredientFactory.createHam();
  	}
}
