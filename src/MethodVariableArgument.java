public class MethodVariableArgument {
    public static void main(String[] args) {

        //memanggil Varibale Argument ...values{array}
        sayCongran("eko", 20,100,70,40);
    }

    //Varibale Argument = int...
    static void sayCongran(String name, int...values){
    var total = 0;
    for(var value : values){

        total += value;

    }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat" + name +" anda lulus");
        } else {
            System.out.println("Selamat " + name +" anda belum lulus");
        }

    }
}
