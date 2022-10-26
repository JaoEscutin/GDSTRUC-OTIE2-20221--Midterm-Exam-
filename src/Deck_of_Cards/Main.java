package Deck_of_Cards;

public class Main {
    public static void main(String[] args) {
        //Represent Card

        String[] SUIT = {"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
        String[] RANK = {"2","3","4","5","6","7","8","9","10","JACK","QUEEN","KING","ACE"};
        int[] RANK_VALUE = {2,3,4,5,6,7,8,9,10,12,13,14,11};

        int card1SUIT = 2;
        int card1Rank = 10;
        System.out.printf("The card %s of %s has the value of %d.\n", RANK[card1Rank], SUIT[card1SUIT], RANK_VALUE[card1Rank]);

        //Pick Random Crd
        int card2SUIT = (int)(Math.random()*4);
        int card2Rank = (int)(Math.random()*13);
        System.out.printf("A Random card is : %s of %s has the value of %d.\n", RANK[card2Rank], SUIT[card2SUIT], RANK_VALUE[card2Rank]);

        //Represent a deck of Cards
        int[] deckSuit = new int[52];
        int[] deckRank = new int[52];

        //Create a new Deck
        for (int s =0; s<4; s++){
            for(int r = 0; r<13; r++){
                int i=s*13+r;
                deckSuit[i]=s;
                deckRank[i]=r;
            }
        }

        //Shuffle Card
        for(int k = 1; k<=500;k++){
            int i = (int)(Math.random()*52);
            int j = (int)(Math.random()*52);
            int temp = deckSuit[i];
            deckSuit[i] = deckSuit[j];
            deckSuit[j]=temp;
            temp = deckRank[i];
            deckRank[i] = deckRank[j];
            deckRank[j] = temp;
        }
        System.out.println();

        //Print Card

        System.out.println("The Decks are : ");
        for(int  k = 0; k<52; k++ ){
            System.out.printf("%s of %s; ", RANK[deckRank[k]], SUIT[deckSuit[k]]);

        }
        System.out.println();

        //Deal 5 cards to four players
        int currentDeckCard = 0;
        for(int player=1; player<=5; player++){
            System.out.printf("Player %d: ", player);
            for(int card=1; card<=6; card++){
                System.out.printf("%s of %s; ", RANK[deckRank[currentDeckCard]], SUIT[deckSuit[currentDeckCard]]);
                currentDeckCard++;

            }
            System.out.println();


        }





       // System.out.println("Hello world!");


    }
}