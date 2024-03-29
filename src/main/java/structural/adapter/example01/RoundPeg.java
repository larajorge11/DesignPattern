package structural.adapter.example01;

public class RoundPeg implements ITarget {

  private Double radius;

  public RoundPeg(Double radius) {
    this.radius = radius;
  }

  @Override
  public Double getRadius() {
    return radius;
  }
}
