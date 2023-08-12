import java.net.URL;
import java.util.Random;
import java.util.Scanner;

public class HighLow {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome To The Guess Game Here You Have To Guess The No. And You Only Have 6 Tries, So Good Luck");
        int i;
        int count = 0;
        boolean opt;
        String ans;
        final int max = 20;
        Random rand = new Random();
        int target = rand.nextInt(max)+1;
        while (true) {
            System.out.print("Enter The No. Within 20 - ");
            i = in.nextInt();
            if (i<=20) {
                if (target < i) {
                    System.out.println("Your Guess Is High");
                } else if (target > i) {
                    System.out.println("Your Guess Is Low");
                } else {
                    System.out.println("Congrats!! You Won");
                    opt = choice();
                    if (opt == false) {
                        break;
                    }else{
                        target = rand.nextInt(max)+1;
                        continue;
                    }
                }
            } else {
                System.out.println("Please Guess The No. Within The Range");
            }
            count++;
            if (count == 5) {
                System.out.println("Caution! It's The Last Chance To Get It Right");
            }
            if (count == 6) {
                System.out.println("Oops!! You Ran Out Of Chances");
                opt = choice();
                if (opt == false) {
                    break;
                }else{
                    target = rand.nextInt(max)+1;
                    continue;
                }
            }
        }
        System.out.println("Thank You For Playing.");
    }
    static boolean choice() {
        System.out.print("Do You Want To Play Again y/n - ");
        char resp = in.next().charAt(0);
        while (resp == 'y') {
            if (resp == 'y') {
                return true;
            } else if (resp == 'n') {
                return false;
            } else {
                System.out.println("Your Input Is Invalid.");
            }
        }
        return false;
    }
}
