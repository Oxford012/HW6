package betmore;

public class Game_Chair {
    private Player[] players = new Player[2];
    private BetMore_Game bet;
    private int state = 0;

    public Game_Chair(String name){
        this.bet = new BetMore_Game(this.players);
        this.state = 0;

        this.players[0] = new Player("Computer", this.bet);
        this.players[1] = new Player(name, this.bet);

        int x1 = Start();
        int x2 = Start();

        String winner = findWinner(bet, x2).getName();


        System.out.println("The winner is: "  + winner);
        System.out.println("Computer: " + x1);
        System.out.println(players[1].getName()+": " + x2);
    }


    public int Start(){
        Player x = this.players[state];
        state += 1;
        return x.play();
    }

    public Player findWinner(BetMore_Game bet, int x){
        return bet.getWinner(x);
    }



}
