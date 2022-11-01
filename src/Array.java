public class Array {
    public static void main(String[] args) {

        //Array 1
        String[] stringArray;
        stringArray = new String [3];

        stringArray[0] = "Eko";
        stringArray[1] = "Kurniawan";
        stringArray[2] = "Khaneddy";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        //array 2
        String[] stringArray2 = new String[3];

        stringArray2[0] = "Budi";
        stringArray2[1] = "Nugaraha";
        stringArray2[2] = "Simanjuntak";

        System.out.println(stringArray2[0]);
        System.out.println(stringArray2[1]);
        System.out.println(stringArray2[2]);

        //Array 3
        String[] Arr = {
                "Eko", "Kuniawan", "Khaneddy"
        };
        System.out.println(Arr.length);

        //Array 4
        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6,
        };
        System.out.println(arrayInt[5]);

        //Array 5

        long[] arrayLong = {
                10L, 20L, 30L
        };

        arrayLong[0] = 100;

        System.out.println(arrayLong[0]);
    }
}
