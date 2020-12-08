package LSPSolutionOne;

public class FlyingBird extends Bird{
    public void fly() {
        System.out.println("I can fly.");
    }

    public static void main(String[] args) {
        new FlyingBird().eat();
        new FlyingBird().fly();
    }
}
