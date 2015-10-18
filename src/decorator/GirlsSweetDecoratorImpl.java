package decorator;

/**
 * Created by Света on 13.10.2015.
 */
public class GirlsSweetDecoratorImpl extends SweetDecorator {
    public GirlsSweetDecoratorImpl(ISweet innerISweet) {
        super(innerISweet);
    }

    @Override
    public void eat() {
        System.out.println("I'm on diet!");
        System.out.println("");
        getInnerISweet().eat();
    }
}
