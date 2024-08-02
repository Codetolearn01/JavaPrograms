package Basic;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean check = isPrime(n);
        if(check){
            System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" is not a prime");
        }
    }
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 1;i <= n/2;i++){
            if(n % i == 0){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}
