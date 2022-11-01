public class ForEach {
    public static void main(String[] args) {
        String[] array = {
                "eko", "kuniawan", "khannedy",
                "programmer", "Zaman", "Now"
        };

        //Loop array[] tanpa For each
        for( int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("===========================");


        //Loop array[] dengan ForEach
        for (var value : array) {
            System.out.println(value);
        }
    }
}
