package Project04;

public class AllentownSchaperDeli extends SchaperDeli {

  protected Sandwich createSandwich(String item) {
    Sandwich sandwich = null;
    SandwichFactory ingredientFactory = new AllentownSandwichFactory();

  if (item.equals("hamburger")) {

			sandwich = new HamburgerSandwich(ingredientFactory);
			sandwich.setName("Allentown Hamburger");

		} else if (item.equals("ham")) {

			sandwich = new HamSandwich(ingredientFactory);
			sandwich.setName("Allentown Ham Sandwich");

		} else if (item.equals("chicken")) {

			sandwich = new ChickenSandwich(ingredientFactory);
			sandwich.setName("Allentown Chicken Sandwich");

		}
    else {
      sandwich = new SpecialSandwich(ingredientFactory);
      sandwich.setName("George Sandwich");
    }
    sandwich.prepare();
    return sandwich;
  }
}
