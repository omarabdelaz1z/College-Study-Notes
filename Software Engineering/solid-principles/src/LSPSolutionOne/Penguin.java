package LSPSolutionOne;

public class Penguin extends Bird{
    @Override
    public void eat() {
        System.out.println("Can I eat taco?");
    }

    public static void main(String[] args) {
        new Penguin().eat();
    }
}
