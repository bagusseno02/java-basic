/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 25/10/20
 * Project java-basic
 */
public class IfElseIfStatement {

    public static void main(String[] args) {

        var nilai = 70;
        var absen = 90;

        if (nilai >= 90 && absen >= 90) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Anda C");
        } else {
            System.out.println("Anda Tidak Lulus");
        }

    }

}
