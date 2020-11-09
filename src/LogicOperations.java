public class LogicOperations {

    public  static void main(String[] args) {

        int x = 5, y = 10, z = 15;

//   1     x += y >> x++ * z;
        x = x + (y >> (x++ * z));
        System.out.println("1 уравнение x = " + x + " y = " + y +" z = " + z);

//   2    z = ++x & y * 5;
        z = ++x & y * 5;
        System.out.println("2 уравнение x = " + x + " y = " + y +" z = " + z);

//   3     y /= x + 5 | z;
        y = y / x + 5 / z;
        System.out.println("3 уравнение x = " + x + " y = " + y +" z = " + z);

//  4      z = x++ & y * 5;
        z = x++ & y * 5;
        System.out.println("4 уравнение x = " + x + " y = " + y +" z = " + z);

//   5     x = y << x++ ^ z;
        x = y << x ^ z;
        System.out.println("5 уравнениеx = " + x + " y = " + y +" z = " + z);
        }
}
