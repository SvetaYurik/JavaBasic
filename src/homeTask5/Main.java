package homeTask5;

/**
 * Created by Света on 09.09.2015.
 */
public class Main extends RectangleFigure{

    public static void main (String[] args) {

        RectangleFigure rectangle = new RectangleFigure();
        RectangleFigure obj = null;
            obj.setA(12.0);
            obj.setB(2.0);
            obj.getA();
            obj.getB();
        double area = obj.getA() * obj.getB();
        System.out.println("Area = " + area);

    }
}
