public class Continue {
    public static void main(String[] args) {

    for ( int counter = 1; counter <= 25; counter++){
        if (counter % 2 == 0 ) {
            continue;
        }

        System.out.println(counter);
    }
    }
}
