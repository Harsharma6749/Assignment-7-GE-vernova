import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) {

        String[] suit = {"clubs","diamonds","hearts","spades"};
        String[] rank = {"2","3","4","5","6","7","8","9","10","jack","queen","king","ace"};

        String[] deck = new String[52];
        int k = 0;

        for (String s : suit) {
            for (String r : rank) {
                deck[k++] = r + " of " + s;
            }
        }

        Random r = new Random();
        for (int i = 0; i < deck.length; i++) {
            int j = r.nextInt(deck.length);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        String[][] players = new String[4][9];
        k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                players[i][j] = deck[k++];
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("player " + (i+1));
            for (int j = 0; j < 9; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}
