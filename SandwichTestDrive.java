package Project04;

public class SandwichTestDrive {

	public static void main(String[] args) {
		SchaperDeli EmmausSchaperDeli = new EmmauseSchaperDeli();
    SchaperDeli BethlehemSchaperDeli = new BethlehemSchaperDeli();

    Sandwich sandwich = EmmausSchaperDeli.orderSandwich("hamburger");
    System.out.println("Richard ordered " + sandwich + "\n");
  }
}
