import java.util.*;
//Program ma losować liczbę w zakresie 0 do 1000
//Gracz ma na celu zgadnąć wylosowaną liczbę
public class ZgadnijLiczbe {
    public static void main(String[] args) {
        Intro();
        Gra();
            }
    //Krótkie powitanie z pozaniem imienia gracza.
    public static void Intro() {
        System.out.println("Witaj w moim pierwszym całkowicie samodzielnym projekcie. " +
                "\n Powiedz proszę jak się nazywasz.");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println(name + " Dziękuję. Wiem że ten projekt powalać nie będzie," +
                "\n ale i tak pomoże mi sprawdzić, " +
                "\nczy cokolwiek zostało w tym moim zakutym łbie XD");
        System.out.println("Wylosuję teraz liczbę od 0 do 1000, " +
                "\n a ty spróbuj odgadnąć o jaką liczbę chodzi");
    }
    // Właściwa gra
    public static void Gra() {
        int c = 1;
        Scanner gra = new Scanner(System.in);
        Random y = new Random();
        int x = y.nextInt(1001); // Tutaj komputer losuje liczbę
        int z = gra.nextInt();
            while (z != x ) // ten kod każe ci wpisywać do skutku
                 {
                if (z < x) {
                   c++;
                    System.out.println("Wylosowana liczba jest większa. " +
                            "\nSpróbuj jeszcze raz");
                    z = gra.nextInt();
                } else {
                    c++;
                    System.out.println("Wylosowana liczba jest mniejsza. " +
                            "\nSpróbuj jeszcze raz");
                    z = gra.nextInt();
                }
            }
        System.out.println("Brawo! udało ci się odgadnąć za " +c + " podejściem"); // ten teks wyświetli dopiero jak zgadniesz
    }
}


