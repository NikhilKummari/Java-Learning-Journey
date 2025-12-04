
//It has methods like start(), run(), sleep(),

class A extends Thread{
    public void run(){
    for(int i=0; i<200;i ++){
        System.out.println("Hi");
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) { ex.printStackTrace();
        }
    }
}
}

class B extends Thread{
    public void run(){
        for (int i = 0; i < 200; i++) {
            System.out.println("Helo");
        }
    }
}

public class Exercisethread{
    public static void main(String[] args) {
        A obj = new A();
        B obj1 = new B();
        obj.start();
        try{
            Thread.sleep(2);
        }catch(InterruptedException e){ e.printStackTrace();

        }
        obj1.start();
        // obj1.setPriority(Thread.MAX_PRIORITY); // even if assign the priority schedular will decide which job to execute first
        System.out.println(obj1.getPriority());
        System.out.println(obj.getPriority());



    }
}
