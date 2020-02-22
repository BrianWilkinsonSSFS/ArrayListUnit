import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOfRectangles {

    public static ArrayList<Rectangle> getRectangles() throws IOException {
        Scanner f = new Scanner(new File("rectangle.txt"));
        ArrayList<Rectangle> rects = new ArrayList<>();

        while (f.hasNext()) {
            double length = f.nextDouble();
            double width = f.nextDouble();
            Rectangle rect = new Rectangle(length, width);
            rects.add(rect);
        }

        return rects;
    }

    public static double findAverage(ArrayList<Rectangle> rectangles) {
        double totalAverage = 0;

        for (Rectangle r: rectangles) {
            totalAverage += r.getArea();
        }

        totalAverage /= rectangles.size();
        totalAverage *= 100;
        totalAverage += 0.5;
        totalAverage /= 100;
        return totalAverage;
    }
}
