/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 25/10/20
 * Project java-basic
 */
public class Continue {

    public static void main(String[] args) {

        for(var counter = 1; counter <= 100; counter++){
            if(counter % 2 == 0){
                continue;
            }
            System.out.println("Perulangan Ganjil " + counter);
        }

    }

}
