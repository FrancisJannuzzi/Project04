package Project04;

public class BethlehemSchaperDeli extends SchaperDeli {

  protected Sandwich createSandwich(String item) {
    Sandwich sandwich = null;
    SandwichFactory ingredientFactory = new BethlehemSandwichFactory();

  if (item.equals("hamburger")) {

			sandwich = new BethlehemHamburgerSandwich(ingredientFactory);
			sandwich.setName("Bethlehem Hamburger");

		} else if (item.equals("ham")) {

			sandwich = new BethlehemHamSandwich(ingredientFactory);
			sandwich.setName("Bethlehem Ham Sandwich");

		} else if (item.equals("chicken")) {

			sandwich = new BethlehemChickenSandwich(ingredientFactory);
			sandwich.setName("Bethlehem Chicken Sandwich");

		}
    else {
      sandwich = new JordanSandwich(ingredientFactory);
      sandwich.setName("Jordan Sandwich");
    }

    return sandwich;
  }
}
