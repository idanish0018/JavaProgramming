import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    public static  int factorial(int n){
        int fact=1;
        for (int i =n; i>1;i--){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+" = "+factorial(n));
    }
}
