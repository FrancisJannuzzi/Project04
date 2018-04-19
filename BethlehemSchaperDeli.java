package Project04;

public class BethlehemSchaperDeli extends SchaperDeli {

  protected Sandwich createSandwich(String item) {
    Sandwich sandwich = null;
    SandwichFactory ingredientFactory = new BethlehemSandwichFactory();

  if (item.equals("hamburger")) {

			sandwich = new HamburgerSandwich(ingredientFactory);
			sandwich.setName("Bethlehem Hamburger");

		} else if (item.equals("ham")) {

			sandwich = new HamSandwich(ingredientFactory);
			sandwich.setName("Bethlehem Ham Sandwich");

		} else if (item.equals("chicken")) {

			sandwich = new ChickenSandwich(ingredientFactory);
			sandwich.setName("Bethlehem Chicken Sandwich");

		}
    else {
      sandwich = new SpecialSandwich(ingredientFactory);
      sandwich.setName("Jordan Sandwich");
    }
    sandwich.prepare();
    return sandwich;
  }
}
