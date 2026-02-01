import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner abi = new Scanner(System.in);
        int num = abi.nextInt();
        for(int i=1;i<=10;i=i+1)
        {
            System.out.println(i+"*"+num+"="+i*num);
        }
    }
}