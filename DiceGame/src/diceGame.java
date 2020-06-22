import java.util.*;

public class diceGame {
    public static void main(String[] args) {
        Scanner lang = new Scanner(System.in);
        System.out.println("English/Polski");
        String la = lang.nextLine();
        if (la.startsWith("e") || la.startsWith("E")) {
            gameE();
        } else if (la.startsWith("p") || la.startsWith("P")) {
            gameP();
        } else {
            System.out.print("Wrong language relauch program/nieprawidłowy język, ponownie uruchom program");
        }
    }

    public static int throwDices() {
        Random r = new Random();
        int dice1 = 1;
        int dice2 = 1;
        int sum = 0;
        dice1 = r.nextInt(6) + 1;
        dice2 = r.nextInt(6) + 1;
        sum = dice1 + dice2;
        return sum;
    }

    public static void gameE() {
        Scanner decide = new Scanner(System.in);
        System.out.print("Lets play a game of dice. y/n ");
        String decision = decide.next();
        do {
            System.out.println("I will throw first... and keep my score a secret.");
            int score1 = throwDices();
            System.out.println("Done. Now its your turn.");
            int score2 = throwDices();
            System.out.println("the sum on your two dices is " + score2);
            System.out.print("do you wish to re-roll? y/n ");
            decision = decide.next();
                if (decision.startsWith("y") || decision.startsWith("Y")) {
                    score2 = throwDices();
                    System.out.println("the new sum on your two dices is " + score2);
                } else {
                    score2 = score2;
                }
            System.out.println("Your score is " + score2 + " My score is " + score1);
            if (score1 > score2) {
                System.out.println("Luck was on my side");
            } else {
                System.out.println("luck was on your side");
            }

            System.out.println("start over? y/n ");
            decision = decide.next();
        } while (decision.startsWith("y") || decision.startsWith("Y"));
    }

    public static void gameP() {
        Scanner decide = new Scanner(System.in);
        System.out.print("Zagrajmy w kości t/n ");
        String decision = decide.next();
        do {
            System.out.println("Najpierw ja rzucam... i póki co nie zdradzę ci wyniku.");
            int score1 = throwDices();
            System.out.println("Już. Teraz twoja kolej.");
            int score2 = throwDices();
            System.out.println("Suma na twoich dwóch kościach wynosi " + score2);
            System.out.print("Chcesz przerzucić? t/n ");
            decision = decide.next();
            if (decision.startsWith("t") || decision.startsWith("T")) {
                    score2 = throwDices();
                    System.out.println("Nowa suma na twoich dwóch kościach wynosi " + score2);
                } else {
                    score2 = score2;
                }
            System.out.println("Twój wynik to " + score2 + " mój wynik " + score1);
            if (score1 > score2) {
                System.out.println("Szczęscie mi sprzyjało.");
            } else {
                System.out.println("Szczęście sprzyjało tobie.");
            }

            System.out.println("gramy jeszcze raz? t/n ");
            decision = decide.next();
        } while (decision.startsWith("t") || decision.startsWith("T"));
    }
}