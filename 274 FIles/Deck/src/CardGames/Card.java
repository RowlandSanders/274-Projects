package CardGames;

public class Card {
    private char suit;
    private char rank;

    public Card(char r, char s)
    {
        suit = s;
        rank = r;

    }

    public void display()
    {
    if(rank=='T'){
        System.out.printf("10%s ",suit);

    }else{
        System.out.printf("%s%s ",rank,suit);
    }
    }
    public int getValue()
    {
    if(rank=='A') {
        return 1;
    }
    else if( (rank == 'J') || (rank == 'Q') || (rank == 'K')|| (rank == 'T')){
        return 10;
    }
    else{
        return Integer.parseInt(String.valueOf(rank));
    }
    }
}
//    public char getRank();
//    {
//
//    }
//
//    public char getSuit();
//    {
//
//    }
//}
