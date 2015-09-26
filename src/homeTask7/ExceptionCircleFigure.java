package homeTask7;

import homeTask5.CircleFigure;
import javafx.scene.shape.Circle;
public class ExceptionCircleFigure {
    public static void main(String[] args) {
        CircleFigure circle = new CircleFigure();
        double result = 0;
        try {
            result = getCircleArea(5, circle.getPI());
            System.out.println("circle area = " + result);
        } catch (NullPointerException e) {
            System.out.println("Null r, please enter new number");
        } catch (InvalidCharacterException e ){
            System.out.println("Enter new number");
        }

    }
    public static double getCircleArea(double r, double PI) throws InvalidCharacterException{
        if (r == 0) throw new NullPointerException("value of 'r' is null; r = " + r);
        if (r < 0) throw new InvalidCharacterException("value or 'r' is negative: r = " + r);
        return PI * r * r;
    }
}

