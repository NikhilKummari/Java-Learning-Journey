//Static variables should call with class name
// Mobile.name = "phone";

class Mobile{
    String brand;
    double price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class Examplestatic {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 80000;
        obj1.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "IQ";
        obj2.price = 25000;
        obj2.name = "Smartphone";

        Mobile.name = "phone";

        obj1.show();
        obj2.show();

        
    }
}
