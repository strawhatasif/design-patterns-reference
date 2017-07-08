package structural.composite.improved;


import java.util.ArrayList;
import java.util.List;

public class GraphicItemGroup implements Graphic {

    private List<Graphic> graphics = new ArrayList<Graphic>();

    @Override
    public void draw()
    {
        graphics.forEach(graphic -> draw());

    }

    public List<Graphic> getGraphics()
    {
        return graphics;
    }
}
