package Project04;

public abstract class SchaperDeli {

  protected abstract Sandwich createSandwich(String item);

	public Sandwich orderSandwich(String type) {
    Sandwich sandwich = new Sandwich(type);
    return sandwich;
  }
}
