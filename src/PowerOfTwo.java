import java.util.Scanner;

public class PowerOfTwo {                          //Ready class

    public static void main(String[] args) {

//        Вариант решения 1



        Scanner scn = new Scanner(System.in);
        System.out.print("Input num: ");
        int num = scn.nextInt();
        int number = num;

        while (num != 1 && num % 2 == 0) {
            num /= 2;
        }
        System.out.println("Вариант решения 1");
        System.out.println(num == 1 ? "Число " + num + " является степенью двойки " : "Число " + num + "  не является степенью двойки");



//             Вариант решения 2

        System.out.println("Вариант решения 2");


        final char ONE = '1';

        if (number < 0)
            System.out.println("Error: Not a positive integer");
        else {
            System.out.println("Бинарное значение числа " + number + " : " + Integer.toBinaryString(number));

            System.out.println("Количество бит со значением 1: " + Integer.bitCount(number));
        }

    }
}