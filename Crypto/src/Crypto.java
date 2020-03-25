import java.util.Scanner;

public class Crypto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please give me the text");
        String text = input.nextLine();
        System.out.println("Please give me the shift number");
        int shift = input.nextInt();
        System.out.println("Please give me the group size");
        int group = input.nextInt();
        String enString = encrypString(text, shift, group);
        System.out.println(enString);
    }
    public static String normalizationText(String text1) {
        String norText = text1.replaceAll("[^a-zA-Z]+","").toUpperCase();
        return norText;
    }

    public static String obify(String text) {
        String netext = "";

        for (int i = 0; i< text.length(); i ++) {
            char ch = text.charAt(i);
            if (ch == 'A' || ch == 'E' ||ch == 'I'||ch == 'O'||ch == 'U'||ch == 'Y') {
                netext = netext + "OB";
                netext = netext + text.charAt(i);

            }else {
                netext = netext + text.charAt(i);
            }
        }
        return netext;

    }

    public static String shiftAlphabet(int shift) {
        int start = 0;
        if (shift < 0) {
            start = (int) 'Z' + shift + 1;
        } else {
            start = 'A' + shift;
        }
        String result = "";
        char currChar = (char) start;
        for(; currChar <= 'Z'; ++currChar) {
            result = result + currChar;
        }
        if(result.length() < 26) {
            for(currChar = 'A'; result.length() < 26; ++currChar) {
                result = result + currChar;
            }
        }
        return result;
    }
    public static String ceasarify(String text, String shiftAlp) {
        String standardAlp = "";
        for (char i = 'A'; i <= 'Z'; i ++) {
            standardAlp = standardAlp + i;

        }
        String newS = "";
        for (int i = 0; i < text.length(); i ++) {
            char ch = text.charAt(i);
            int location = standardAlp.indexOf(ch);
            char chAfterceasarify = shiftAlp.charAt(location);
            newS = newS + chAfterceasarify;

        }
        return newS;

    }
    public static String groupify(String text, int num) {
        String newText = "";
        int group = text.length() / num;
        int i = 0;
        while (i < group ) {
            int loca = num * i;
            for ( int j = 0; j < num; j++) {
                newText = newText + text.charAt(loca+j);
            }
            newText = newText + " ";
            i += 1;
        }
        int re = text.length() % num;
        newText = newText + text.substring(text.length() - re, text.length());
        for (int time = 0; time < num - re; time ++) {
            newText = newText + 'x';
        }
        return newText;

    }

    public static String encrypString(String text, int shiftValue, int groupSize) {
        String norText = normalizationText(text);
        String newAlp = shiftAlphabet(shiftValue);
        String afterOb = obify(norText);
        String afterCe = ceasarify(afterOb,newAlp);
        String afterGr = groupify(afterCe, groupSize);
        return afterGr;
    }

}