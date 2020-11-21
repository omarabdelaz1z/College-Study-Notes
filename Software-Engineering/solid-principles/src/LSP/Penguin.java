package LSP;

public class Penguin extends Bird {
    @Override
    public void eat() {
        System.out.println("Can I eat taco?");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Help! I cannot fly!");
    }
}
