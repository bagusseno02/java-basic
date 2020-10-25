/**
 * @author <a href="mailto:bagus.seno39@gmail.com>seno</a>
 * Created on 24/10/20
 * Project java-basic
 */
public class Array {

    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[4];
        arrayString[0] = "Bagus";
        arrayString[1] = "Seno";
        arrayString[2] = "Prasetyo";
        arrayString[3] = "Diwiryo";

        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString[3]);

        arrayString[0] = "Ubah Nama";
        System.out.println(arrayString[0]);

        String[] arrayString2 = new String[4];

        /* Array Initializer */
        String[] arrayStringInitializer = {
                "Bagus", "Seno", "Prasetyo", "Diwiryo"
        };

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5
        };

        long[] arrayLong = {
                1L, 2L, 3L, 4L
        };

        System.out.println("Jumlah Data Array " + arrayStringInitializer.length);
        System.out.println("Jumlah Data Array " + arrayInt.length);
        System.out.println("Jumlah Data Array " + arrayLong.length);

        /* Array Dalam Array */
        String[][] members = {
                {"Bagus", "Seno"},
                {"Prasetyo", "Diwiryo"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][0]);

    }

}
