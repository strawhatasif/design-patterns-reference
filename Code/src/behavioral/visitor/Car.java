package behavioral.visitor;

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
        carParts.forEach(CarPart::render);
    }

    public void upgrade()
    {
        carParts.forEach(CarPart::upgrade);
    }

    public void print()
    {
        carParts.forEach(CarPart::print);
    }

}
