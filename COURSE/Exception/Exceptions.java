public class Exceptions {
    public static void main(String[] args) {
        int i = 3;
        int j = 0;

        try {
            j = 17/i;
        }
        catch (Exception e) {
            System.out.println("can't divide by");
        }

        System.out.println(j);
        System.out.println("bye");
        
    }
}
