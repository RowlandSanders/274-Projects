package CardGames;
import java.util.Random;

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
    Public int cardsLeft()
    {

    }
}
