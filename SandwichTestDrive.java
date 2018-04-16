package Project04;

public class SandwichTestDrive {

	public static void main(String[] args) {
		SchaperDeli EmmausSchaperDeli = new EmmausSchaperDeli();
    SchaperDeli BethlehemSchaperDeli = new BethlehemSchaperDeli();
		SchaperDeli AllentownSchaperDeli = new AllentownSchaperDeli();

    Sandwich sandwich = EmmausSchaperDeli.orderSandwich("hamburger");
    System.out.println("Richard ordered " + sandwich + "\n");


  }
}
