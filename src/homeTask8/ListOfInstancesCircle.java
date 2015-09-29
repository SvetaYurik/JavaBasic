package homeTask8;

import homeTask5.CircleFigure;
import homeTask5.RectangleFigure;
import homeTask5.TriangleFigure;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class ListOfInstancesCircle{

    public static void main (String [] args ) {
        CircleFigure circle = new CircleFigure();
        double circleArea = circle.getPI() * circle.getR() * circle.getR();
        TriangleFigure triangle = new TriangleFigure();
        double triangleArea = 0.5 * triangle.getH() * triangle.getA();
        RectangleFigure rectangle = new RectangleFigure();
        double rectangleArea = rectangle.getA() * rectangle.getB();

        IdentityHashMap ihm = new IdentityHashMap();
        ihm.put("circle    ", new Double (circleArea));
        ihm.put("triangle  ", new Double(triangleArea));
        ihm.put("rectangle ", new Double(rectangleArea));
        Set set = ihm.entrySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            Map.Entry table = (Map.Entry)i.next();
            System.out.println("|" + table.getKey() + "|" + table.getValue() + " |");

        }
    }
}