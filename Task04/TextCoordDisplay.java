package Task04;

public class TextCoordDisplay implements CoordDisplay {
  public void display(Coord coord) {
      System.out.println("x: " + coord.getX());
      System.out.println("y: " + coord.getY());
  }
  public void displayTable(Coord coord, String[] columnNames) {
    System.out.println("<table>");
    System.out.println("<tr>");
    for (String columnName : columnNames) {
    System.out.println("<th>" + columnName + "</th>");
    }
    System.out.println("</tr>");
    System.out.println("<tr>");
    System.out.println("<td>" + coord.getX() + "</td>");
    System.out.println("<td>" + coord.getY() + "</td>");
    System.out.println("</tr>");
    System.out.println("</table>");
  }
}
