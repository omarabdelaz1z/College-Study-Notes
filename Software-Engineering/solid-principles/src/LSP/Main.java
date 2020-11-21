package LSP;

import java.util.ArrayList;

public class Main {
    public static void letBirdsFly(ArrayList <Bird> birds){
        for(Bird bird: birds){
            bird.fly();
        }
    }

    public static void main(String[] args) {
        ArrayList<Bird> birds = new ArrayList<Bird>();

        birds.add(new Swan());
        birds.add(new Penguin());

        try {
            letBirdsFly(birds);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
