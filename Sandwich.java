package Project04;

public abstract class Sandwich {
  String name;
  Bun bun;
  Wheatwrap wheatwrap;
  Onion onion;
  Lettuce lettuce;
  Cheese cheese;
  Tomato tomato;
  Hamburger hamburger;
  Ham ham;
  Chicken chicken;
  Mayonnaise mayonnaise;
  Mustard mustard;
  Ketchup ketchup;
  double cost;

  abstract void prepare();

  void setName(String name) {
    this.name = name;
  }
  public double cost() {
    cost = 0.0;
    if(bun != null)
      cost += bun.cost();
    if(wheatwrap != null)
      cost += wheatwrap.cost();
    if(onion != null)
      cost += onion.cost();
    if(lettuce != null)
      cost += lettuce.cost();
    if(cheese != null)
      cost += cheese.cost();
    if(tomato != null)
      cost += tomato.cost();
    if(hamburger != null)
      cost += hamburger.cost();
    if(ham != null)
      cost += ham.cost();
    if(chicken != null)
      cost += chicken.cost();
    if(mayonnaise != null)
      cost += mayonnaise.cost();
    if(mustard != null)
      cost += mustard.cost();
    if(ketchup != null)
      cost += ketchup.cost();
    return cost;
  }

  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("---- " + name + " ----\n");
    if(bun != null){
      result.append(bun);
      result.append(" ");
    }
    if(wheatwrap != null){
      result.append(wheatwrap);
      result.append(" ");
    }
    if(onion != null) {
      result.append(onion);
      result.append(" ");
    }
    if(lettuce != null){
      result.append(lettuce);
      result.append(" ");
    }
    if(cheese != null) {
      result.append(cheese);
      result.append(" ");
    }
    if(tomato != null) {
      result.append(tomato);
      result.append(" ");
    }
    if(hamburger != null){
      result.append(hamburger);
      result.append(" ");
    }
    if(ham != null){
      result.append(ham);
      result.append(" ");
    }
    if(chicken != null){
      result.append(chicken);
      result.append(" ");
    }
    if(mayonnaise != null){
      result.append(mayonnaise);
      result.append(" ");
    }
    if(mustard != null){
      result.append(mustard);
      result.append(" ");
    }
    if(ketchup != null){
      result.append(ketchup);
      result.append(" ");
    }
    cost = this.cost();
    return result.toString() + " $" + cost + "0";
  }

}
