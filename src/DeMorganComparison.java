public class DeMorganComparison {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Условие до применения теоремы Де Моргана.
        if (a | b)
           System.out.println("A | B = " + (a | b));
//        else
//            System.out.println("A || B = " + (!a || !b));
//
//        // после применения теоремы Де Моргана.
//        if ((a & b))
//            System.out.println("(A & B) = " + !(!a & !b));
//        else
            System.out.println("!(!A & !B) = " + !(!a & !b));

    }
}
