package structural.adapter;

public class SquarePegAdapter implements ITarget {

  private SquarePeg squarePeg;

  public SquarePegAdapter(SquarePeg squarePeg) {
    this.squarePeg = squarePeg;
  }

  @Override
  public Double getRadius() {
    return squarePeg.getWidth() * Math.sqrt(2) / 2;
  }
}
