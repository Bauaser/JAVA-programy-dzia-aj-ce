import java.util.*;
public class OEgame {
    public static void main(String[] args) {
        Scanner OE = new Scanner(System.in);
        System.out.println("Thou who came to challenge me to a duel " +
                "\n of odds and even, state your name");
        String name = OE.nextLine();
        System.out.println("Brave " + name + " Choose your side" +
                "\n will you bet (O)dd?" +
                "\n Or will you Bet (E)ven?");
        String bet = OE.nextLine();
        if (bet.equalsIgnoreCase("o")) {
            System.out.println("So your choice is Odd the brave " + name + "." +
                    "\n Then I shall become Even");
        } else {
            System.out.println("So your choice is Even the brave " + name + "." +
                    "\n Then I shall become Odd");
        }
        System.out.println("");
        System.out.println(name + " now is time to prove Yourself. " +
                "\nWrite a number of fingers you want to show me." +
                "\nAnything between 0 and 5 will suffice.");
        int fingers = OE.nextInt();
        System.out.println("");
        System.out.println("-----------------------");
        System.out.println("Let the game begin!");
        Random r = new Random();
        int GodFingers = r.nextInt(6);
        System.out.println("You have chosen " + fingers + " fingers. " +
                "\n And I have chosen " + GodFingers + " fingers.");
        System.out.println("-----------------------");
        int total = fingers + GodFingers;
        System.out.println("That makes " + total + " fingers.");
        int result = total%2;
        if (result == 0 && bet.equalsIgnoreCase("o")) {
            System.out.println(result +" is EVEN! Fool! You though, you can beat me?");
        } else  if(result == 1 && bet.equalsIgnoreCase("o")) {
            System.out.println(result +"... " + result+ " is ODD. IMPOSSIBLE!" +
                    "\n How could one of your kind got better of me!?");
        } else  if(result == 0 && bet.equalsIgnoreCase("e")) {
            System.out.println(result +"... " + result+ " is EVEN. IMPOSSIBLE!" +
                    "\n How could one of your kind got better of me!?");
        } else  if(result == 1 && bet.equalsIgnoreCase("e")) {
            System.out.println(result +" is ODD! Fool! You though, you can beat me?");
        }
        System.out.println("-----------------------");
    }
        }