package CardGames;
import java.util.Random;
import java.util.Scanner;


public class Deck {
    private Card[] storage;
    private int top;

    public Deck()
    {
        char[] suits = {'H', 'D','S', 'C'};
        char[] ranks = {'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
        storage = new Card[52];
        top = 0;

        int count = 0;
        Card C1;
        for (int s = 0; s < suits.length; s++)
            for (int r=0; r<ranks.length; r++)
            {
                C1 = new Card(ranks[r], suits[s]);
                storage[count++] = C1;
            }
    }
    public void display()
    {
        for(int i=0;i<52;i++){

            if(i % 13 == 0){
                System.out.println();
            }
            storage[i].display();
            System.out.print(", ");
        }

    }
    public void shuffle()
    {
        Random rand = new Random();
        for(int i=0;i<52;i++){
            Card ogCard = storage[i];
            int newDeck = rand.nextInt(52);
            storage[i] = storage[newDeck];
            storage[newDeck]=ogCard;
    }
    }
    public Card deal() {
        Card t = storage[top];
        top++;
        return t;
    }
    public int cardsLeft()
    {
        return 52-top;
    }
    /*
    Requests
    1) Complete display, shuffle, deal, and cardsleft
    2) Correct formatting and make a method to run 1000 games with no display functions other than score
    Formatting
    Welcome to Solitaire Prime!
    1) New Deck
    2) Display Deck
    3) Shuffle Deck
    4) Play Solitaire Prime
    5) Exit
     */
}
