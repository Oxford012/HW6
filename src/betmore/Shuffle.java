package betmore;

import java.util.Random;

public class Shuffle {
    private Random r = new Random();
    public int counter = 0;
    public int generateNumber(){
        return r.nextInt(100) + 1;
    }

}
