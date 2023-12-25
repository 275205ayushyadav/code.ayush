import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("I amgoing to make my own calculator to caculate percentage value");
        try (Scanner sc = new Scanner(System.in)) {7uj
            System.out.println("enter total number");
            int a = sc.nextInt();
            System.out.println("number get in 1st");
            int b = sc.nextInt();
            System.out.println("2nd");
            int c = sc.nextInt();
            System.out.println("3rd");
            int d = sc.nextInt();
            System.out.println("number got in 4th");
            int e = sc.nextInt();
            System.out.println("5th");
            int f = sc.nextInt();
            int sum =(b + c + d + e + f);
            System.out.println(sum);
            float per = (sum * 100) / a;
            System.out.println(per);
            Float A =45.98f;