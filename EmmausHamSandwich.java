package Project04;


public class EmmausHamSandwich extends Sandwich{
  	SandwichFactory ingredientFactory;

  	public EmmausHamSandwich(SandwichFactory ingredientFactory) {
  		this.ingredientFactory = ingredientFactory;
  	}

  	void prepare() {
  		System.out.println("Preparing " + name);
  		bun = ingredientFactory.createBun();
      cheese = ingredientFactory.createCheese();
      mustard = ingredientFactory.createMustard();
      ham = ingredientFactory.createHam();
  	}
}
