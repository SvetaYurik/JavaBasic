package homeTask5;

/**
 * Created by Света on 09.09.2015.
 */
public class Main{

    public static void main (String[] args) {

        RectangleFigure rectangle = new RectangleFigure();

            rectangle.setA(12.0);
            rectangle.setB(2.0);
            double area = rectangle.getA() * rectangle.getB();
        System.out.println("Area = " + area);

    }
}
