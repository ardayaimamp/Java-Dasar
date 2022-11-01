public class ifStatement {
    public static void main(String[] args) {
        var nilai = 70;
        final var absen = 90;


        if (nilai >= 75 && absen >= 75) {
            System.out.println("Nilai anda A");
        }else if(nilai >= 55 && absen >= 75){
            System.out.println("Nilai anda B");
        }else{
            System.out.println("Nilai anda C");
        }
    }
}
