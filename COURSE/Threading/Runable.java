class A implements Runnable{
    public void run(){
    for(int i=0; i<5;i ++){
        System.out.println("Hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) { ex.printStackTrace();
        }
    }
}
}

class B implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Helo");
        }
    }
}

public class Runable{
    public static void main(String[] args) {
        Runnable obj = new A();
        Runnable obj1 = new B(); // we can create a  reference of a interface and object of a class.
    
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj1);
        t1.start();
        t2.start();


    }
}
