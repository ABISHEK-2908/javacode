import java.util.Scanner;

public class ifq1 {
    public static void main(String[] args) {
        Scanner abi = new Scanner(System.in);
        int marks = abi.nextInt();
        System.out.println("enter the mark of the student:"+marks);
        if(marks>35)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
