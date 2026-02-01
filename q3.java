import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner abi = new Scanner(System.in);
        int a = abi.nextInt();
        int b = abi.nextInt();
        int c = abi.nextInt();
        int d = a*b*c;
        int e = a+b+c;
        int f = d/e;
        System.out.println(f);
    }
}
