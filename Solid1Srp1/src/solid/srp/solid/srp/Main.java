package solid.srp;

import solid.srp.CreateFigure;
import solid.srp.Point;
import solid.srp.Square;


public class Main {
    public static void main(String[] args) {
        CreateFigure figure =new CreateFigure(1);
        Square square=new Square(new Point(1,1),5);
        figure.draw(square);
        System.out.printf("\nПлощадь фигуры: %d \n", square.getArea());
    }
}
