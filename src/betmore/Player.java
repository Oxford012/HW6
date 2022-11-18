package betmore;

public class Player {
    private String name;
    private BetMore_Game bet;
    public Player(String name, BetMore_Game bet){
        this.name = name;
        this.bet = bet;
    }

    public String getName(){
        return this.name;
    }

    public int play(){
        return bet.pick_card();
    }




}
