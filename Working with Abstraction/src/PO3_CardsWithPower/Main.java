package PO3_CardsWithPower;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String rank = scanner.nextLine ();
        String suite = scanner.nextLine ();

        Card card = new Card (Rank.valueOf (rank),Suit.valueOf (suite));
        System.out.println (card);
    }
}
