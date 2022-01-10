package structural.adapter;

public class Client {

  public static void main(String[] args) {
    RoundPeg roundPeg = new RoundPeg(10.0);
    RoundPeg roundPegNoFit = new RoundPeg(20.0);
    RoundHole roundHole = new RoundHole(15.0);

    System.out.println("RoundPeg fit: " + roundHole.fits(roundPeg));
    System.out.println("RoundPeg No fit: " + roundHole.fits(roundPegNoFit));

    SquarePeg squarePeg = new SquarePeg(10.0);
    // roundHole.fits(squarePeg); Incompatible class
    SquarePeg small_square_peg = new SquarePeg(5.0);
    SquarePeg large_square_peg = new SquarePeg(30.0);

    SquarePegAdapter smallSquarePegAdapter =  new SquarePegAdapter(small_square_peg);
    SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(large_square_peg);

    System.out.println("SquarePeg fit: " + roundHole.fits(smallSquarePegAdapter));
    System.out.println("SquarePeg No fit: " + roundHole.fits(largeSquarePegAdapter));
  }
}
