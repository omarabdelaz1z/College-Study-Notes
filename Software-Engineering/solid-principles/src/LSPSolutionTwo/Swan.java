package LSPSolutionTwo;

public class Swan extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Swan can Fly.");
    }

    public static void main(String[] args) {
        new Swan().eat();
        new Swan().fly();
    }
}
