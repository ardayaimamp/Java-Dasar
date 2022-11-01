public class MethodReturnValue {
    public static void main(String[] args) {

    var c = sum(100,520);
        System.out.println(c);

        System.out.println(hitung(100, "+", 250));
        System.out.println(hitung(100, "-", 250));
        System.out.println(hitung(100, "salah", 250));
    }


    //menggunakan 1 return .
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    static int hitung(int a, String operasi, int b) {
        switch (operasi){
            case "+":
            return a + b;
            case "-":
            return a - b;
            default :
                return 0;
        }
    }
}
