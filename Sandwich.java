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
  double cost() {
    cost = 0;
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
      result.append("\n");
    }
    if(wheatwrap != null){
      result.append(wheatwrap);
      result.append("\n");
    }
    if(onion != null) {
      result.append(onion);
      result.append("\n");
    }
    if(lettuce != null){
      result.append(lettuce);
      result.append("\n");
    }
    if(cheese != null) {
      result.append(cheese);
      result.append("\n");
    }
    if(tomato != null) {
      result.append(tomato);
      result.append("\n");
    }
    if(hamburger != null){
      result.append(hamburger);
      result.append("\n");
    }
    if(ham != null){
      result.append(ham);
      result.append("\n");
    }
    if(chicken != null){
      result.append(chicken);
      result.append("\n");
    }
    if(mayonnaise != null){
      result.append(mayonnaise);
      result.append("\n");
    }
    if(mustard != null){
      result.append(mustard);
      result.append("\n");
    }
    if(ketchup != null){
      result.append(ketchup);
      result.append("\n");
    }
    cost = this.cost();
    return result.toString() + " $" + cost;
  }

}
