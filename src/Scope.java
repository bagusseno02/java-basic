/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 25/10/20
 * Project java-basic
 */
public class Scope {

    public static void main(String[] args) {
        sayHello("Bagus Seno"); /* Di Dalam Scope */
        System.out.println(hello); /* Di Luar Scope */
    }

    static void sayHello(String name) {
        String hello = "Hello " + name;
        if (!name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }
        System.out.println(hello);
    }

}
