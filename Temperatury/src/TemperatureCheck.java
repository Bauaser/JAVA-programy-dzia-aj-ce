import java.util.*;

public class TemperatureCheck {
    public static void main (String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Podaj temperaturę. Dopuszczam miejsca dziesiętne");
        double T1 = temp.nextDouble();
                if (T1>=0.0) {
                    System.out.println(T1 + " jest temperaturą dodatnią");
                } else {
            System.out.println(T1 + "jest temperaturą ujemną");
        }
    }
}
