package Task04;

import java.util.Arrays;

public class TableCoordDisplay implements CoordDisplay {
    private final String tableFormat = "<table><tr>%s</tr><tr>%s</tr></table>";

    public void display(Coord coord) {
        System.out.println("x: " + coord.getX());
        System.out.println("y: " + coord.getY());
    }

    public void displayTable(Coord coord, String[] headers) {
      String[] values = { String.valueOf(coord.getX()), String.valueOf(coord.getY()) };
      String headerRow = Arrays.stream(headers).map(h -> "<th>" + h + "</th>").reduce("", String::concat);
      String valueRow = Arrays.stream(values).map(v -> "<td>" + v + "</td>").reduce("", String::concat);
      System.out.println(String.format(tableFormat, headerRow, valueRow));
    }
}