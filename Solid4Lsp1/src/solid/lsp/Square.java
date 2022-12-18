package lsp;

public class Square extends Rectangle {

    private int sideA;
    private int sideB;
    public Square(int side) {
        super(side, side);
    }



    @Override
    public void setSideA(int sideA) {
       super.setSideA(sideA);
    }

    @Override
    public void setSideB(int sideB) {
       super.setSideB(sideB);
    }

    @Override
    public int getSideA() {
        return super.getSideA();
    }

    @Override
    public int getSideB() {
        return super.getSideB();
    }

    @Override
    public int getArea() {

      if(getSideA()==getSideB())
      { return (int) Math.pow(getSideA(), 2);}

        return getSideA()*getSideB();

    }


}
