/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 25/10/20
 * Project java-basic
 */
public class MethodVariableArgument {

    public static void main(String[] args) {
        sayCongrats("Bagus Seno", 10, 20, 10, 20);
        sayCongrats("Bagus Seno Prasetyo", 100, 90, 80, 70);
    }

    static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var nilai : values) {
            total += nilai;
        }
        var totalAkhir = total / values.length;

        if (totalAkhir >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus Dengan Nilai " + totalAkhir);
        }else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }
    }


}
