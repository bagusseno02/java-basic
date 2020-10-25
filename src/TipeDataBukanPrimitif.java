/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 24/10/20
 * Project java-basic
 */
public class TipeDataBukanPrimitif {

    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 100000L;

        Byte iniByte = null;

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        /* Konversi Bukan Primitif Ke Primitif */
        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

        Long amount = 100000L;

    }

}
