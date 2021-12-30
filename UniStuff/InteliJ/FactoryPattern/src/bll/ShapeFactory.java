package bll;

import be.Circle;
import be.Rectangle;
import be.Shape;
import be.Triangel;

public class ShapeFactory {
    public Shape buildShape(String shapeType){
        switch (shapeType){
            case("circle") -> {
                return new Circle();
            }
            case("rectangle") -> {
                return new Rectangle();
            }
            case("triangel") -> {
                return new Triangel();
            }

            default -> {return null;}
        }

    }
}
