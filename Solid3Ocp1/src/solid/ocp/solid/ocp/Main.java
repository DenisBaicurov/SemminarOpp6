package solid.ocp;

import solid.ocp.RightTriangle;
import solid.ocp.Shape;
import solid.ocp.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(3, 4));
        shapes.add(new Square(5));
        shapes.add(new Circle(10));
        double sumArea = 0;
        for (Shape shape : shapes) {
            sumArea+= shape.GetArea();
        }

        System.out.printf("Сумма площадей фигур равна %f \n", sumArea);
    }
}
