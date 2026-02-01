import java.util.Scanner;
public class elifq2 {
    public static void main(String[] args) {
        Scanner abi = new Scanner(System.in);
        int num1 = abi.nextInt();
        int num2 = abi.nextInt();
        int num3 = abi.nextInt();
        int num4 = abi.nextInt();
        int num5 = abi.nextInt();
        int add = num1+num2+num3+num4+num5;
        int avg = add/5;
        System.out.println("avg mark is"+ avg);
        if(avg<35)
        {
            System.out.println("additional cls req");
        }
        else{
            System.out.println("good to go");
        }
    }
}
