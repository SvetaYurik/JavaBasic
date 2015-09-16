package homeTask5;

/**
 * Created by Света on 10.09.2015.
 */
public class SquareFigure extends AreaShapes {
    protected double a;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double squareArea() {
        double s = a * a;
        return s;


    }
}