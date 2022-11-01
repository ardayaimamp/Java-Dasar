public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("eko");
        sayHello("eko", "Khannedy");
    }
    static void sayHello(){
        System.out.println("Hellow");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
