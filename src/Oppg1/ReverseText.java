package Oppg1;
import java.util.Scanner;
/**
 * Created by Thea on 07.04.2016.
 * Ja, oppgaven skriker "SKRIV PÅ NORSK", men regner med du helst vil ha alt på engelsk?
 */

public class ReverseText {
    public static void backwards(String text){
        if(text.length() == 0) {
            return;
        }else {
            System.out.print(text.substring(text.length() - 1));
            backwards(text.substring(0, text.length() - 1));
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String text = input.nextLine();
        backwards(text);
        System.out.print("\nYour word has been reversed.");
    }
}
