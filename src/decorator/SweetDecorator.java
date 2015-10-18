package decorator;

/**
 * Created by Света on 13.10.2015.
 */
public abstract class SweetDecorator implements ISweet {


    public ISweet getInnerISweet() {
        return innerISweet;
    }

    private ISweet innerISweet;

    public SweetDecorator(ISweet innerISweet) {
        this.innerISweet = innerISweet;
    }

    public abstract void eat();
}
