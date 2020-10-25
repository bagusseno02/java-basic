/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 25/10/20
 * Project java-basic
 */
public class RecursiveMethod {

    public static void main(String[] args) {
        System.out.println(factorialLoop(5));
        System.out.println(1 * 2 * 3 * 4 * 5);
        System.out.println(factorialRecursive(5));

        /* Error Recursive */
        loop(100000);
    }

    static int factorialLoop(int value) {
        var result = 1;
        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    static int factorialRecursive(int value) {
        return value == 1 ? 1 : value * factorialRecursive(value - 1);
    }

    /* Error Stackoverflow */
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value - 1);
        }
    }

}
