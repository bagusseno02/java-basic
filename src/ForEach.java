/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 25/10/20
 * Project java-basic
 */
public class ForEach {

    public static void main(String[] args) {
        String[] array = {
                "Bagus", "Seno", "Prasetyo", "Diwiryo"
        };

        System.out.println("========== For Each ==========");
        for(var nama : array){
            System.out.println(nama);
        }
    }

}
