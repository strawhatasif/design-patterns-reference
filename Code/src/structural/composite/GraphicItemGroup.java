package structural.composite;


import java.util.ArrayList;
import java.util.List;

public class GraphicItemGroup {

    private List<Line> lines = new ArrayList<>();

    private List<Rectangle> rectangles = new ArrayList<>();

    public List<Line> getLines()
    {
        return lines;
    }

    public List<Rectangle> getRectangles()
    {
        return rectangles;
    }

    public void draw()
    {
        lines.forEach(line -> draw());
        rectangles.forEach(rectangle -> draw());
    }
}
