/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 25/10/20
 * Project java-basic
 */
public class ForLoop {

    public static void main(String[] args) {

        var counter = 1;

        /* Perulangan Dengan Kondisi */
        for (; counter <= 10; ) {
            System.out.println("Perulangan ke - " + counter);
            counter++;
        }

        /* Perulangan Dengan Kondisi dan Init Statement */
        for (var count = 1; count <= 10; ) {
            System.out.println("Perulangan ke - " + count);
            count++;
        }

        /* Perulangan Dengan Kondisi, Init Statement dan Post Statement */
        for (var count2 = 1; count2 <= 10; count2++) {
            System.out.println("Perulangan ke - " + count2);
        }

    }

}
