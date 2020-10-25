/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 25/10/20
 * Project java-basic
 */
public class MethodVariableWithoutArgument {

    public static void main(String[] args) {
        int[] values = {80, 90, 90, 80};
        sayCongrats("Bagus Seno", values);
    }

    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var nilai : values) {
            total += nilai;
        }
        var totalAkhir = total / values.length;

        if (totalAkhir >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus Dengan Nilai " + totalAkhir);
        }
    }

}
