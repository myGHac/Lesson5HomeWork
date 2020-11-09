import java.util.Scanner;

public class Parity {

    public static void main(String[] args) {

        int number, result;
        Scanner in = new Scanner(System.in);
//
        System.out.println("Enter a positive integer");
        number = in.nextInt();

        result = number % 2;
        if (result == 0) {
            System.out.println("Число " + number + " четное.");
            //System.out.println(" : " + result);
        }
        else
        {System.out.println("Число " + number + " нечетное.");
            //System.out.println(" : " + result);
        }
    }
}