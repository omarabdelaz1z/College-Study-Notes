package LSPSolutionOne;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void letBirdsFly(List<FlyingBird> flyingBirds) {
        for(FlyingBird flyingBird: flyingBirds) {
            flyingBird.fly();
        }
    }

    public static void main(String[] args) {
        List<FlyingBird> flyingBirds = new ArrayList<FlyingBird>();
        flyingBirds.add(new Swan());
        letBirdsFly(flyingBirds);
    }
}
