import java.util.Scanner;

public class PowerOfTwo {                          //Ready class

    public static void main(String[] args) {

//


        Scanner scn = new Scanner(System.in);
        System.out.print("Input num: ");
        int num = scn.nextInt();
        int number = num;

        if ((number & number - 1) == 0) {
            System.out.println("Число есть степенью");
        } else System.out.println("Число не есть степенью");


    }
}