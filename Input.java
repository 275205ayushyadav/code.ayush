import java.util.Scanner;

public class Input {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(" taking input from user ");
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter number 1");
        // int a = sc.nextInt();
        // System.out.println("Enter number 2");
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println(" the sum of these number is ");
        // System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter what do you want");
        int a = sc.nextInt();
        if( a%2!=0 ){
        System.out.println("wired");
       } else if ( a%2==0 && 2<= a <=5){
        System.out.println("not wired");
       } else if (  a%2==0 && 6<= a <=20){
        System.out.println(" wired");
       }
       else ( a%2==0 && a>20){
       System.out.println(" not wired");

}
    }
