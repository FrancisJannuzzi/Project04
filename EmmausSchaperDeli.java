package Project04;

public class EmmausSchaperDeli extends SchaperDeli {

  protected class Sandwich createSandwich(Sandwich item) {
    Sandwich sandwich = null;
    SandwichFactory ingredientFactory = new EmmausSandwichFactory();

  if (item.equals("hamburger")) {

			sandwich = new EmmausHamburgerSandwich(ingredientFactory);
			sandwich.setName("Emmaus Hamburger");

		} else if (item.equals("ham")) {

			sandwich = new EmmausHamSandwich(ingredientFactory);
			sandwich.setName("Emmaus Ham Sandwich");

		} else if (item.equals("chicken")) {

			sandwich = new EmmausChickenSandwich(ingredientFactory);
			sandwich.setName("Emmaus Chicken Sandwich");

		}
    else {
      sandwich = new FrancisSandwich(ingredientFactory);
      sandwich.setName("Francis Sandwich");
    }
  }
}
