public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Eko", "Khannedy");
        sayHello("Budi", "nugraha");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hellow " + firstName + " " + lastName);
    }
}
