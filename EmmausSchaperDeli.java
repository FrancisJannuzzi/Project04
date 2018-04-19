package Project04;

public class EmmausSchaperDeli extends SchaperDeli {

  protected Sandwich createSandwich(String item) {
    Sandwich sandwich = null;
    SandwichFactory ingredientFactory = new EmmausSandwichFactory();

  if (item.equals("hamburger")) {

			sandwich = new HamburgerSandwich(ingredientFactory);
			sandwich.setName("Emmaus Hamburger");

		} else if (item.equals("ham")) {

			sandwich = new HamSandwich(ingredientFactory);
			sandwich.setName("Emmaus Ham Sandwich");

		} else if (item.equals("chicken")) {

			sandwich = new ChickenSandwich(ingredientFactory);
			sandwich.setName("Emmaus Chicken Sandwich");

		}
    else {
      sandwich = new SpecialSandwich(ingredientFactory);
      sandwich.setName("Francis Sandwich");
    }
    sandwich.prepare();
    return sandwich;
  }
}
