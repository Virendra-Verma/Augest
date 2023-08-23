import java.util.Scanner;

public class Basic_Function {
    public static void Calculate(int a, int b){
        int sum = a+b;
        System.out.println("The sum of the given number: "+ sum);
    }
    public static int multiply(int a, int b){
       int product = a*b;
       return product;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        Calculate(a,b);
        int prod=multiply(a,b);
        System.out.println("The Multiplication of the given number:"+ prod);

    }
}
