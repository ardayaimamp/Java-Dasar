public class SwitchStatement {
    public static void main(String[] args) {

        //Switch Biasa
       var nilai = "A";

       switch (nilai) {
           case "A":
               System.out.println("Wow Anda Lulus Dengan Baik");
               break;
           case "B":
           case "c":
               System.out.println("Anda Lulus");
               break;
           case "D" :
               System.out.println("Anda Tidak Lulus");
               break;
           default:
               System.out.println("Anda Bobrok!");

       }
    //Switch lambda
       var value = "B";

       switch (nilai){
           case "A" -> System.out.println("Wow Anda Lulus Optimal");
           case "B", "C" -> System.out.println("Anda Lulus");
           case "D" -> System.out.println("Anda Tidak Lulus");
           default -> {
               System.out.println("Anda Bobrok!");
           }
       }

       //Switch tanpa Yield
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = ("Wow Anda Lulus Optimal");
            case "B", "C" -> ucapan = ("Anda Lulus");
            case "D" -> ucapan = ("Anda Tidak Lulus");
            default -> {
                ucapan = ("Anda Bobrok!");
            }
        }

        System.out.println(ucapan);

        //Switch dengan Yield
        ucapan = switch (nilai) {
            case "A":
                yield "Wow Anda Lulus Optimal";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Anda Bobrok!";
        };

        System.out.println(ucapan);

    }
}
