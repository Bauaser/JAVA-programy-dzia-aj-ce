import java.math.RoundingMode;
import java.util.*;


public class TripPlaner {
    public static void main (String[] args){
        Scanner lang= new Scanner(System.in);
            System.out.println("English/Polski");
        String la = lang.nextLine();
        if (la.startsWith("e")||la.startsWith("E")) {
            System.out.println("Velcome to vacation Planner.");
            IntroE();
            System.out.println("*****************\n");
            TimeE();
            System.out.println("*****************\n");
            TimezoneE();
            System.out.println("\n*****************\n");
            AreaE();
        } else if (la.startsWith("p")||la.startsWith("P")){
            System.out.println("Witaj w planerze wakacji.");
            IntroP();
            System.out.println("*****************\n");
            TimeP();
            System.out.println("*****************\n");
            TimezoneP();
            System.out.println("\n*****************\n");
            AreaP();
        } else{System.out.print("Wrong language relauch program/nieprawidłowy język, ponownie uruchom program");}
    }
    public static void IntroE () {
        Scanner Intro =new Scanner(System.in);
        System.out.print("Whats your name? ");
        String name = Intro.nextLine();
        System.out.print("Nice to meet you, " + name +"! Where are you going to spend yor vacation? ");
        String where = Intro.nextLine();
        System.out.println("Great! " + where + " That sounds like a plan!");
    }
    public static void TimeE () {
Scanner Time =new Scanner(System.in);
System.out.print("How many days aree you going to spend there? ");
int days= Time.nextInt();
System.out.print("Do you have enough money on you? what is Your budget in USD ");
int budget = Time.nextInt();
System.out.print("What is the currency on your destination place? Write a symbol please. ");
String currency = Time.next();
System.out.print("How many " + currency +" are there in 1 USD? ");
double money = Time.nextDouble();
System.out.println("");
System.out.println("If you are traveling for " + days + " days, it is the same as " + (days * 24) + "hours, " + days*24*60 + " minutes or " + days*24*60*60 + " seconds");
System.out.println("Your total budget is " + budget + " USD which means daily you may spend up to " + (budget/days) + " USD");
System.out.println("In " + currency + " it equasls " + budget*money + " " +currency +" in total. Or " +((budget*money)/days) + " " + currency + " to spend each day.");
    }
    public static void TimezoneE() {
        Scanner TZ =new Scanner(System.in);
        System.out.print("What is the time difference (in hours) between your home and destination? ");
        String dif = TZ.nextLine();
        System.out.print(dif +" hours? That means, that if it is midnight at home it will be " +24%24 + dif +" there! And at noon (at home) it will be " +12%24 +dif + " there!");
    }
    public static void AreaE () {
        Scanner Area = new Scanner(System.in);
        System.out.print("Last question. What is the Area of your destination in square kilometeres?");
        double ar = Area.nextDouble();
        int are = (int)(ar * 0.3861);
        System.out.print("Oh! That makes... " + are + " square miles.");
        System.out.println("That was the last of me. Have a safe trip!");
    }
    public static void IntroP () {
        Scanner Intro =new Scanner(System.in);
        System.out.print("Jak się nazywasz? ");
        String name = Intro.nextLine();
        System.out.print(name +" Witaj seredcznie! Gdzie się wybierasz na wakacje? ");
        String where = Intro.nextLine();
        System.out.println("O! " + where + " Na moje to całkiem niezły pomysł");
    }
    public static void TimeP () {
        Scanner Time =new Scanner(System.in);
        System.out.print("Ile czasu tam zostaniesz? ");
        int days= Time.nextInt();
        System.out.print("Masz dość pieniędzy? Jaki masz budżet w złotówkach? ");
        int budget = Time.nextInt();
        System.out.print("A jakiej tam używają waluty? (wpisz skrót np. złotówka=PLN). ");
        String currency = Time.next();
        System.out.print("Ile " + currency +" to jeden PLN? ");
        double money = Time.nextDouble();
        System.out.println("");
        System.out.println("Skoro jedziesz na " + days + " dni, to znaczy " + (days * 24) + "godzin, " + days*24*60 + " minut, czyli " + days*24*60*60 + " sekund");
        System.out.println("Twój ogólny budżet to " + budget + " PLN. Czyli dziennie masz na wydanie " + (budget/days) + " PLN");
        System.out.println("W " + currency + " będzie to w sumie " + budget*money + " " +currency +". albo " +((budget*money)/days) + " " + currency + " do wydania dziennie.");
    }
    public static void TimezoneP() {
        Scanner TZ =new Scanner(System.in);
        System.out.print("Jaka jest różnica czasu mięzy twoim domem a miejscem w którym spędzisz wakacje? ");
        String dif = TZ.nextLine();
        System.out.print(dif +" godzin? Czyli, kiedy w domu wybija północ (00:00) to tam będzie godzina" +24%24 + dif +"! A o dwunastej (w domu) tam będzie godzina " +12%24 +dif + "!");
    }
    public static void AreaP () {
        Scanner Area = new Scanner(System.in);
        System.out.print("Ostatnie pytanie: Jaka jest powierzchnia (w kilometrach kwadratowych) miejsca do którego jedziesz?");
        double ar = Area.nextDouble();
        int are = (int)(ar * 0.3861);
        System.out.print("Aha! To będzie... " + are + " mil kwadratowych.");
        System.out.println("To już wszystko z mojej strony. Przyjemnej podróży!");
    }
}
