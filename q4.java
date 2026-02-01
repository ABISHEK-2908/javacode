import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner abi = new Scanner(System.in);
        String name = abi.nextLine();
        double score = abi.nextDouble();
        abi.nextLine();
        String dept = abi.nextLine();
        System.out.println("my name is:"+name);
        System.out.println("my score is:"+score/10);
        System.out.println("my dept is:"+dept);
    }
}
