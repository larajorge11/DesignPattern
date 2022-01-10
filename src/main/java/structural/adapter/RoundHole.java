package structural.adapter;

public class RoundHole {

  private Double radius;

  public RoundHole(Double radius) {
    this.radius = radius;
  }

  public Double getRadius() {
    return radius;
  }

  public boolean fits(ITarget peg) {
    return this.getRadius() >= peg.getRadius();
  }
}
