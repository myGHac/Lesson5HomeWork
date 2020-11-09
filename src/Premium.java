import java.util.Scanner;

public class Premium {

    public static void main(String [] args) {

        double salarySize = 50000;
        double premiunRate;
        System.out.print("Введите полное значение количества отработанных лет: ");

        Scanner in = new Scanner(System.in);
        int yearQuantity = in.nextInt();

        if (yearQuantity < 5) {
            premiunRate = salarySize * 0.10;
            System.out.println("Выслуга до 5 лет. Премия (10% от заработной платы) составляет - " + premiunRate);
        }
        if (yearQuantity >= 5 & yearQuantity < 10) {
            premiunRate = salarySize * 0.15;
            System.out.println("Выслуга 5 - 10 лет. Премия (15% от заработной платы) составляет - " + premiunRate);
        }
        if (yearQuantity >= 10 & yearQuantity < 15) {
            premiunRate = salarySize * 0.25;
            System.out.println("Выслуга 10 - 15 лет. Премия (25% от заработной платы) составляет - " + premiunRate);
        }
        if (yearQuantity >= 15 & yearQuantity < 20) {
            premiunRate = salarySize * 0.35;
            System.out.println("Выслуга 15 - 20 лет. Премия (35% от заработной платы) составляет - " + premiunRate);
        }
        if (yearQuantity >= 20 & yearQuantity < 25) {
            premiunRate = salarySize * 0.45;
            System.out.println("Выслуга 20 - 25 лет. Премия (45% от заработной платы) составляет - " + premiunRate);
        }
        if (yearQuantity >= 25) {
            premiunRate = salarySize * 0.50;
            System.out.println("Выслуга свыше 25 лет. Премия (50% от заработной платы) составляет - " + premiunRate);
        }

//
    }
}
