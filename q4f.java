import java.util.Scanner;
public class q4f {
    public static void main(String[] args) {
        Scanner abi = new Scanner(System.in);
        int size = abi.nextInt();
        int[]num = new int[size];
        
        for(int i=0;i<=size-1;i=i+1)
        {
            num[i] = abi.nextInt();            
        }
    }
}
