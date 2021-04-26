package com.company;
 import java.util.Scanner;

/*Write and design a program as per the given instructions:

1) Create a class ‘Cards’ and define suitable class variables for it.
2) Create a class ‘ClassicGame’ and define suitable class variables for it.
3) The function of the class ‘ClassicGame’ name game will take two cards as input and compare them.
4) First, compare the values on the cards; the player having higher number on the card will win the game.
   For example, the card having the number 2 will lose to the card having the number 3.
5) If the numbers on the cards are the same, compare the suits of the two cards.
   The suits in order of priority are: Spades > Diamond > Hearts > Clubs
7) Increase the point of the winner card by 1 and print the scores. */

public class CardsGame {
    public static void main(String[] args) {
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
    }
}
class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    int getSuitPriority(String suitString) {
       // Spades > Diamond > Hearts > Clubs
        int suitPriority = 0;
        if(suitString == "spades") { suitPriority =4;}
        else  if(suitString == "diamonds") { suitPriority =3;}
        else if(suitString == "hearts") { suitPriority =2;}
        else if(suitString == "clubs") { suitPriority =1;}

        return suitPriority;
    }
}

class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {

        if(c1.value > c2.value) {points1++;}
        else if (c2.value>c1.value){points2++;}
        else {
            if (c1.getSuitPriority(c1.suit) > c2.getSuitPriority(c2.suit))
            {
                points1++;
            }
            else
            {
                points2++;
            }
        }

        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
        return;
    }

}
