/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 25/10/20
 * Project java-basic
 */
public class Break {

    public static void main(String[] args) {

        var counter = 1;

        while (true){
            System.out.println("Perulangan Ke - " + counter);
            counter++;

            if(counter > 10){
                break;
            }
        }

    }

}
