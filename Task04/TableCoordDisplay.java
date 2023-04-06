package Task04;

import java.util.ArrayList;
import java.util.List;

public class TableCoordDisplay implements CoordDisplay {
    private int rows;
    private int cols;

    public TableCoordDisplay(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public void display(Coord coord) {
        List<String[]> data = new ArrayList<>();
        data.add(new String[]{"x", "y"});

        double incrementX = coord.getX() / (double)(this.cols - 1);
        double incrementY = coord.getY() / (double)(this.rows - 1);

        double currentX = 0.0;
        double currentY = coord.getY();

        for (int row = 0; row < this.rows; row++) {
            String[] rowData = new String[this.cols];

            for (int col = 0; col < this.cols; col++) {
                if (col == 0) {
                    rowData[col] = String.format("%.2f", currentX);
                } else if (row == this.rows - 1) {
                    rowData[col] = String.format("%.2f", currentY);
                    currentY = 0.0;
                } else {
                    rowData[col] = "";
                }

                currentX += incrementX;
            }

            data.add(rowData);
            currentX = 0.0;
            currentY -= incrementY;
        }

        System.out.println("<table>");

        for (String[] row : data) {
            System.out.println("<tr>");

            for (String col : row) {
                System.out.println("<td>" + col + "</td>");
            }

            System.out.println("</tr>");
        }

        System.out.println("</table>");
    }
}


// import java.util.Arrays;

// public class TableCoordDisplay implements CoordDisplay {
//     private int rows;
//     private int cols;
//     private String[] headers;

//     public TableCoordDisplay(int rows, int cols, String[] headers) {
//         this.rows = rows;
//         this.cols = cols;
//         this.headers = headers;
//     }

//     public void display(Coord coord) {
//         // Create the table header row
//         StringBuilder headerRow = new StringBuilder("<tr>");
//         for (String header : headers) {
//             headerRow.append("<th>").append(header).append("</th>");
//         }
//         headerRow.append("</tr>");

//         // Create the table data rows
//         StringBuilder dataRows = new StringBuilder();
//         double timeStep = coord.getT() / (rows - 1);
//         for (int i = 0; i < rows; i++) {
//             double time = i * timeStep;
//             Coord rowCoord = new Coord(coord.getV0(), coord.getAlpha(), time);
//             dataRows.append("<tr>");
//             dataRows.append("<td>").append(String.format("%.2f", time)).append("</td>");
//             dataRows.append("<td>").append(String.format("%.2f", rowCoord.getX())).append("</td>");
//             dataRows.append("<td>").append(String.format("%.2f", rowCoord.getY())).append("</td>");
//             dataRows.append("</tr>");
//         }

//         // Print the table
//         String table = String.format("<table>%s%s</table>", headerRow, dataRows);
//         System.out.println(table);
//     }
// }

// import java.util.ArrayList;
// import java.util.List;

// public class TableCoordDisplay implements CoordDisplay {

// private List<String> headers;

// private List<List<String>> data;

// public TableCoordDisplay(List<String> headers, List<List<String>> data) {
//     this.headers = headers;
//     this.data = data;
// }

// @Override
// public void display(Coord coord) {
//     List<String> row = new ArrayList<>();
//     row.add(String.valueOf(coord.getX()));
//     row.add(String.valueOf(coord.getY()));
//     data.add(row);

//     StringBuilder sb = new StringBuilder();

//     sb.append("<table>");

//     sb.append("<thead>");
//     sb.append("<tr>");
//     for (String header : headers) {
//         sb.append("<th>").append(header).append("</th>");
//     }
//     sb.append("</tr>");
//     sb.append("</thead>");

//     sb.append("<tbody>");
//     for (List<String> rowData : data) {
//         sb.append("<tr>");
//         for (String value : rowData) {
//             sb.append("<td>").append(value).append("</td>");
//         }
//         sb.append("</tr>");
//     }
//     sb.append("</tbody>");

//     sb.append("</table>");

//     System.out.println(sb.toString());
// }
// }

