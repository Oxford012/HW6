package betmore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Please enter your name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        Game_Chair chair = new Game_Chair(name);


    }





}
