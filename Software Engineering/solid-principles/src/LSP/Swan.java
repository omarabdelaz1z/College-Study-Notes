package LSP;


// Swan is a type of bird that can eat and fly. Hence, it has to extend the Bird class.
public class Swan extends Bird{
    @Override
    public void eat() {
        System.out.println("OMG! I can eat pizza!");
    }

    @Override
    public void fly() {
        System.out.println("I believe I can fly!");
    }
}
