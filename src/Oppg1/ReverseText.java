package Oppg1;
import java.util.Scanner;
/**
 * Created by Thea on 07.04.2016.
 */

public class ReverseText {

    public static void backwards(String text){
        backwards(text, text.length());
    }

    public static void backwards(String text, int last){
        if(last == 0) return;
        System.out.print(text.substring(last - 1));
        backwards(text.substring(0, last - 1));
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine();
        backwards(text);
        System.out.print("\nYour string has been reversed.");
        System.out.print("\nThe number of characters in your String is: " + text.replace(" ", "").length());
    }
}
