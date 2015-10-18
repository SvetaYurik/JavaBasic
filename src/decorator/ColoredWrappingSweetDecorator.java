package decorator;

/**
 * Created by Света on 13.10.2015.
 */
public class ColoredWrappingSweetDecorator extends SweetDecorator {
    public ColoredWrappingSweetDecorator(ISweet innerISweet) {

        super(innerISweet);
    }

    @Override
    public void eat() {
        System.out.println("Ouch!!! Are you sure you want to eat all that polymer stuff!!!");
        this.getInnerISweet().eat();

    }
}
