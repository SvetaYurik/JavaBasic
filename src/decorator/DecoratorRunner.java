package decorator;

/**
 * Created by Света on 13.10.2015.
 */
public class DecoratorRunner {
    public static void main(String[] args){

        ISweet someSweet = new ColoredWrappingSweetDecorator(new GirlsSweetDecoratorImpl(new Sweet()));


        someSweet.eat();

    }
}
