
/**
 * Simple Deck class for Lab 09 from BCIT by Gary Tong;
 * 
 * @author Krzysztof Szczurowski
 * @version 1.1
 * @since 2016/11/25
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2125908/View
 */
public class Deck
{
    public static final String[] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
    public static final String[] DESCRIPTIONS = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack","Queen", "King"};
   
    /**
     * Public method to print out a deck of card in combination;<br>
     * Does not take any parameter and does not return any value;<br>
     * Prints out a deck of card;
     */
    public void printDeck()
    {
        System.out.println("Let's print a deck of cards: ");
        System.out.println();
        for(int i = 0; i<DESCRIPTIONS.length; i++)
        {
            for(int j = 0; j < SUITS.length; j++)
            {
                System.out.println(DESCRIPTIONS[i] + " of " + SUITS[j]);
            }
            System.out.println();
        }
    }
}
