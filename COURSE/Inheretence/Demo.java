class A{

}
class B extends A{
    
}
class C extends A,B{
    
}
public class Demo {
    public static void main(String args[]){
        VeryAdvCalc obj = new VeryAdvCalc();

        System.out.println(obj.add(4,5));
        System.out.println(obj.sub(4,5));
        System.out.println(obj.mul(4,5));
        System.out.println(obj.div(4,5));
        System.out.println(obj.power(4,2));


    }
}
