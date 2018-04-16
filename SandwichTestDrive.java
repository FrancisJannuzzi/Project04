package Project04;

public class SandwichTestDrive {

	public static void main(String[] args) {
		SchaperDeli EmmausSchaperDeli = new EmmausSchaperDeli();
    SchaperDeli BethlehemSchaperDeli = new BethlehemSchaperDeli();
		SchaperDeli AllentownSchaperDeli = new AllentownSchaperDeli();

		//Emmaus Sandwiches
    Sandwich sandwich = EmmausSchaperDeli.orderSandwich("hamburger");
    System.out.println("Richard ordered " + sandwich + "\n");
		Sandwich sandwich1 = EmmausSchaperDeli.orderSandwich("ham");
    System.out.println("Richard ordered " + sandwich1 + "\n");
		Sandwich sandwich2 = EmmausSchaperDeli.orderSandwich("chicken");
		System.out.println("Richard ordered " + sandwich2 + "\n");

		//Allentown Sandwiches
		Sandwich sandwich3 = AllentownSchaperDeli.orderSandwich("hamburger");
    System.out.println("Richard ordered " + sandwich3 + "\n");
		Sandwich sandwich4 = AllentownSchaperDeli.orderSandwich("ham");
    System.out.println("Richard ordered " + sandwich4 + "\n");
		Sandwich sandwich5 = AllentownSchaperDeli.orderSandwich("chicken");
    System.out.println("Richard ordered " + sandwich5 + "\n");

		//Bethlehem Sandwiches
		Sandwich sandwich6 = BethlehemSchaperDeli.orderSandwich("hamburger");
    System.out.println("Richard ordered " + sandwich6 + "\n");
		Sandwich sandwich7 = BethlehemSchaperDeli.orderSandwich("ham");
    System.out.println("Richard ordered " + sandwich7 + "\n");
		Sandwich sandwich8 = BethlehemSchaperDeli.orderSandwich("chicken");
    System.out.println("Richard ordered " + sandwich8 + "\n");
		
		//Special Sandwiches
		Sandwich sandwich9 = AllentownSchaperDeli.orderSandwich("Francis");
    System.out.println("Richard ordered " + sandwich9 + "\n");
		Sandwich sandwich10 = AllentownSchaperDeli.orderSandwich("George");
    System.out.println("Richard ordered " + sandwich10 + "\n");
		Sandwich sandwich11 = AllentownSchaperDeli.orderSandwich("Jordan");
    System.out.println("Richard ordered " + sandwich11 + "\n");
  }
}
