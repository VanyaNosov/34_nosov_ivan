package Task05;

public class ProjectileResultFabricator implements ResultFabricator {
  private Coord coord;

  public ProjectileResultFabricator(Coord coord) {
      this.coord = coord;
  }

  @Override
  public void display() {
    System.out.println("Projectile Motion Results:");
    System.out.println("Initial velocity: " + coord.getV0());
    System.out.println("Launch angle: " + coord.getAlpha());
    System.out.println("Time of flight: " + coord.getT());
    System.out.println("Final position: (" + coord.getX() + ", " + coord.getY() + ")");
  }
}
