import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the to find decrement");
        int n =sc.nextInt();
        for (int i=n;i>0;i--){
            System.out.println(2*i+1);
            System.out.println(" result is :"+i);
        }
    }
}
