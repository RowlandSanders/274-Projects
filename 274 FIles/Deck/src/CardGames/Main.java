/*
Rowland Sanders
CECS 274-05
Project 2: Sol Prime
3/3/2020
 */
package CardGames;

import java.util.Scanner;

public class main {
        public static boolean play(Deck d){
            System.out.println("Playing Solitaire Prime!!!");
            int stack = 0;
            for(int i=0; i < 52;i++){
               Card c = d.deal();
                c.display();
                stack += c.getValue();
                if(isPrime(stack)){
                    System.out.println("Prime: " +stack);
                    stack = 0;
                }
            }
            if (d.cardsLeft() == 0 && stack == 0){
                System.out.println("Winner");
                return true;
            }
            else {
                System.out.println("Loser");
                return false;
            }
        }

        public static boolean isPrime(int num){
            if (num == 1){
                return false;
            }
            for(int i= 2; i < num; i++){
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        }

        public static int menu(){
            System.out.println("  ");
            System.out.println("1) New Deck");
            System.out.println("2) Display Deck");
            System.out.println("3) Shuffle Deck");
            System.out.println("4) Play Solitaire Deck");
            System.out.println("5) Exit Deck");
            System.out.println("6) Simulate 1000 game");
            Scanner input = new Scanner(System.in);
            return input.nextInt();
        }
    public static void main(String[] args) {
        int x = menu();
        Deck d = new Deck();
        while(x!=5) {
            if (x == 1) {
                d = new Deck();
                x = menu();
            } else if (x == 2) {
                d.display();
                x = menu();
            } else if (x == 3) {
                d.shuffle();
                x = menu();
            } else if (x == 4) {
                play(d);
                x = menu();

            } else if (x == 6) {
                int win = 0;
                int lose = 0;
                for (int i = 0; i <1000; i++) {
                    d = new Deck();
                    d.shuffle();
                    if (play(d)) {
                        win++;
                    }
                    else
                        lose++;
                    }
                System.out.println("  ");
                System.out.println("In 1000 games, you won: "+ win + " and lost: "+lose);
                break;
                }

            }


            }
        }
