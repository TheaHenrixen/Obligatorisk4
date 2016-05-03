package Oppg2;
import java.util.Scanner;
/**
 * Created by Thea on 07.04.2016.
 */
public class TowerOfHanoi {
    static int count = 0;
    static int recMethCalls = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");
        int number = input.nextInt();
        System.out.println("The moves are: ");
        moveDisks(number, 'A', 'B', 'C');
        System.out.println("The total number of moves are: " + count + "\nNumber of " +
                "calls to the recursive method: " + recMethCalls);
    }

    public static void moveDisks(int number, char fromTower, char toTower, char auxTower){
        count++;
        if (number == 1){
            System.out.println("Move disk " + number + " from " + fromTower + " to " + toTower);
        }else{
            moveDisks(number - 1, fromTower, auxTower, toTower);
            System.out.println("Move disk " + number + " from " + fromTower + " to " + toTower);
            moveDisks(number - 1, auxTower, toTower, fromTower);
            recMethCalls++;
        }
    }

}
