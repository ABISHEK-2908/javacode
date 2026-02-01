import java.util.Scanner;

public class elifq1 {
    public static void main(String[] args) {
        Scanner abi = new Scanner(System.in);
        int score = abi.nextInt();
        if(score<50)
        {
            System.out.println("you need to improve");
        }
        else if (score==50 || score<70) {
            System.out.println("good job");
        }
        else if(score==70|| score>70){
            System.out.println("super");

        }
    }
}
