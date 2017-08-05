package behavioral.visitor.improved;

import java.util.ArrayList;
import java.util.List;

public class Car {

    List<CarPart> carParts = new ArrayList<>();

    public List<CarPart> getCarParts()
    {
        return carParts;
    }

    public void setCarParts(List<CarPart> carParts)
    {
        this.carParts = carParts;
    }

    public void render()
    {
        RenderCarPartVisitor renderer = new RenderCarPartVisitor();

        carParts.forEach(carPart -> carPart.acceptCarPartVisitor(renderer));
    }

    public void print()
    {
        PrintCarPartVisitor visitor = new PrintCarPartVisitor();
        carParts.forEach(carPart -> carPart.acceptCarPartVisitor(visitor));
    }

    public void upgrade()
    {
        UpgradeCarPartVisitor visitor = new UpgradeCarPartVisitor();
        carParts.forEach(carPart -> carPart.acceptCarPartVisitor(visitor));
    }

}
