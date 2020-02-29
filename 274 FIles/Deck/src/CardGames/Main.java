package CardGames;
import java.util.Random;
import java.util.Scanner;

public class Deck {
    private Card[] storage;
    private int top;

    public Deck()
    {
        char[] suits = {'H', 'D','S', 'C'};
        char[] ranks = {'A', '1','2','3','4','5','6','7','8','9','T','J','Q','K'};
        storage = new Card[52];
        top = 0;

        int count = 0;
        Card C1;
        for (int s = 0; s < suits.length; s++)
            for (int r=0; r<ranks.length; r++)
            {
                C1 = new Card(ranks[r], suits[s]);
                Data[count++] = C1;
            }
    }
    public void display()


    {

    }
    public void shuffle()
    {

    }
    public Card deal()
    {

    }
    public int cardsLeft()
    {

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
