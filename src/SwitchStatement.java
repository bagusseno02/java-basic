/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 25/10/20
 * Project java-basic
 */
public class SwitchStatement {

    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Anda Lulus Dengan Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus Dengan Nilai Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }

    }

}
