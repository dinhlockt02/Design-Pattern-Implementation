public class AwesomeInc extends Observable {
  private Float prevPrice = 1.0f;
  private Float price = 1.0f;

  public void changePrice(Float price) {
    this.prevPrice = this.price;
    this.price = price;
    notifyObservers();
  }

  public Float getPrevPrice() {
    return prevPrice;
  }

  public Float getPrice() {
    return price;
  }
}
