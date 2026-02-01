import java.util.Scanner;

public class qa12 {
    public static void main(String[] args) {
        Scanner abi = new Scanner(System.in);
        String name = abi.nextLine();
        int age = abi.nextInt();
        abi.nextLine();
        String address = abi.nextLine();
        System.out.println("my name is:"+name);
        System.out.println("my age is:"+age);
        System.out.println("my address is:"+address);
    }
}
