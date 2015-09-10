package homeTask5;

/**
 * Created by Света on 09.09.2015.
 */
public class Main{

    public static void main (String[] args) {

        RectangleFigure rectangle = new RectangleFigure();
        rectangle.setA(12.0);
        rectangle.setB(2.0);
        double rectangleArea = rectangle.getA() * rectangle.getB();
        System.out.println("Rectangle area = " + rectangleArea);

        TriangleFigure triandle = new TriangleFigure();
        triandle.setA(34.0);
        triandle.setH(3.0);
        double triandleArea = 0.5 * triandle.getA() * triandle.getH();
        System.out.println("Triandle area = " + triandleArea);

        CircleFigure circle = new CircleFigure();
        circle.setR(5.0);
        double circleArea = Math.PI * 2 * circle.getR() * circle.getR();
        System.out.println("Circle area = " + circleArea);
    }
}
