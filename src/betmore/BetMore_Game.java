package betmore;

import java.util.Random;
import java.util.Scanner;

public class BetMore_Game {
    private final Player[] players;
    private Shuffle s;
    private int computerResult = 0;
    Scanner scan = new Scanner(System.in);

    public BetMore_Game(Player[] players){
        this.s = new Shuffle();
        this.players = players;
    }

    public int pick_card(){
        int x = s.generateNumber();
        if (s.counter == 0){
            s.counter += 1;
            this.computerResult = x;
            return x;
        }
        while(true){
            x = s.generateNumber();
            System.out.println("Your number is: " + x);
            if (s.counter >= 5){
                break;
            }
            System.out.println("Do you want a new number?\nWrite y for yes and n for no");
            String ans = scan.next();
            if(ans.equals("n")){
                break;
            }
            s.counter += 1;

            }


        return x;
    }

    public Player getWinner(int card){
        if (card >= computerResult){
            return players[1];
        }
        return players[0];
    }




}
