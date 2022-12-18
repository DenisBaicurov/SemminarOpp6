package lsp;



public class ViewShape {
    private Rectangle rectangle;

    public ViewShape(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void showArea() {

        if (rectangle.getSideA()==rectangle.getSideB())
        {
            System.out.println("Площадь квадрата равна");
            System.out.println(rectangle.getArea());}
        else
        { System.out.print("Площадь прямоугольника равна:");
        System.out.println(rectangle.getArea());}
    }
}
