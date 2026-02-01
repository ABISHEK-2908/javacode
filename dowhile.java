import java.util.Scanner;

public class dowhile {

    public static void main(String[] args) {
        Scanner abi = new Scanner(System.in);
        int count = 0;
        do{
            System.out.println("enter the number>10 :");
            count = abi.nextInt();

        }while(count<10);
    }
}
