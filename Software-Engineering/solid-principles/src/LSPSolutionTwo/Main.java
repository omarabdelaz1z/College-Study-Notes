package LSPSolutionTwo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void letBirdsFly(List<Bird> Birds) {
        for(Bird bird: Birds) {
            if(Flyable.class.isAssignableFrom(bird.getClass())){
                ((Flyable) bird).fly();
            }
        }
    }

    public static void main(String[] args) {
        List<Bird> Birds = new ArrayList<Bird>();

        Birds.add(new Swan());
        Birds.add(new Penguin());

        letBirdsFly(Birds);
    }
}
