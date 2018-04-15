package Project04;

public class AllentownSchaperDeli extends SchaperDeli {

  protected Sandwich createSandwich(String item) {
    Sandwich sandwich = null;
    SandwichFactory ingredientFactory = new AllentownSandwichFactory();

  if (item.equals("hamburger")) {

			sandwich = new AllentownHamburgerSandwich(ingredientFactory);
			sandwich.setName("Allentown Hamburger");

		} else if (item.equals("ham")) {

			sandwich = new AllentownHamSandwich(ingredientFactory);
			sandwich.setName("Allentown Ham Sandwich");

		} else if (item.equals("chicken")) {

			sandwich = new AllentownChickenSandwich(ingredientFactory);
			sandwich.setName("Allentown Chicken Sandwich");

		}
    else {
      sandwich = new GeorgeSandwich(ingredientFactory);
      sandwich.setName("George Sandwich");
    }

    return sandwich;
  }
}
