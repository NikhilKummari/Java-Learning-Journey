public class Varables{
    public static void main(String[] args) {
        // TODO: Print numbers 1 to 5 using for loop
        System.out.print("For Loop: ");
        for(int i=1;i<=5;i++){
            System.out.print(i+ " ");

        }

        int i =1;
        System.out.println();
        System.out.print("While Loop: ");
        while(i<=5){
            System.out.print(i+ " ");
            i++;
        }

        int j =1;
        // TODO: Print numbers 1 to 5 using do-while loop
        System.out.println();
        System.out.print("Do-While Loop: ");
        do{
        System.out.print(j+ " ");
        j++;
        }while(j<=5);
    }
}
