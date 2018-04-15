package Project04;

public class AllentownSandwichFactory implements SandwichFactory {

  public Bun createBun() {
    return new Bun();
  }

  public Wheatwrap createWheatWrap() {
    return new Wheatwrap();
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
    return new Onion();
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
