/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 25/10/20
 * Project java-basic
 */
public class MethodParameter {

    public static void main(String[] args) {
        sayHello("Bagus Seno", "Prasetyo Diwiryo");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }

}
