/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 25/10/20
 * Project java-basic
 */
public class MethodReturnValue {

    public static void main(String[] args) {
        var total = sum(10, 20);
        System.out.println(total);
        System.out.println(sum(200, 200));

        System.out.println(hitung(100, 100, "-"));
        System.out.println(hitung(100, 100, "+"));
        System.out.println(hitung(100, 100, "/"));
        System.out.println(hitung(100, 100, "*"));
    }

    static int sum(int nilai1, int nilai2) {
        var total = nilai1 + nilai2;
        return total;
    }

    static int hitung(int nilai1, int nilai2, String operation){
        switch (operation){
            case "+":
                return nilai1 + nilai2;
            case "-":
                return nilai1 - nilai2;
            case "/":
                return nilai1 / nilai2;
            case "*":
                return nilai1 * nilai2;
            default:
                return 0;
        }
    }

}
