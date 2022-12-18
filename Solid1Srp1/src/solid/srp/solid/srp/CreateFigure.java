package solid.srp;

public class CreateFigure {
    int change;

    public CreateFigure(int change) {
        this.change = change;
    }

    public void draw(solid.srp.Square square) {
        Integer side = square.getSide() * change;
        for (int i = 0; i < side; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < side; i++) {
            System.out.print("*");
            for (int j = 1; j < side - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < side; i++) {
            System.out.print("*");
        }
    }



}
