public class TernaryOperator {
    public static void main(String[] args) {

        //if tanpa ternary operator
        var nilai = 75;
        String ucapan;

        if (nilai >= 74) {
            ucapan = "Selamat anda lulus";
        } else  {
            ucapan = "Silahkan Coba lagi";
        }

        System.out.println(ucapan);

        //if Ternary Operator
        var value = 55;
        String hasil = value >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba lagi";

        System.out.println(hasil);
    }
}
