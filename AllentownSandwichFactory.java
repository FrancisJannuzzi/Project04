package Project04;

public class AllentownSandwichFactory implements SandwichFactory {

  public Bread createBun() {
    return new Bread();
  }

  public Bread createWheatWrap() {
    return new WheatWrap();
  }

  public Hamburger createHamburger() {
    return new Hamburger();
  }
  public Chicken createChicken() {
    return new Chicken();
  }

  public Ham createHam() {
    return new Ham();
  }

  public Cheese createCheese() {
    return new Cheese();
  }

  public Onion createOnion() {
    create new Onion();
  }

  public Lettuce createLettuce() {
    return new Lettuce();
  }

  public Tomato createTomato() {
    return new Tomato();
  }

  public Ketchup createKetchup() {
    return new Ketchup();
  }

  public Mayonnaise createMayonnaise() {
    return new Mayonnaise();
  }

  public Mustard createMustard() {
    return new Mustard();
  }

}
