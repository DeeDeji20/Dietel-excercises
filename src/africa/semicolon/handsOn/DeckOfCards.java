package africa.semicolon.handsOn;

public class DeckOfCards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        //initialize the cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        //shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            int temp = deck[i];
            int index = (int)(Math.random() * deck.length);
            deck[i] = deck[index];
            deck[index] = temp;
        }

        //display first four cards
        for (int i = 0; i < 4; i++) {

        }
        
    }
}
