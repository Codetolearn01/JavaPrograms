package Basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
    }
    public static void fib(int n){
        int a = 1;
        int b = 1;
        int c ;
        System.out.print(a+" "+b+" ");
        while(n>2){
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
            n--;
        }
    }
}
