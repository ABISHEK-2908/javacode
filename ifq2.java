import java.util.Scanner;
public class ifq2 {
    public static void main(String[] args) {
        Scanner abi = new Scanner(System.in);
        int income = abi.nextInt();
        if (income>7000)
        {
            System.out.println("scholar is available");
        }
        else{
            System.out.println("not available");
        }
    }
}
