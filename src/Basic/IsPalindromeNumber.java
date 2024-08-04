package Basic;

import java.util.Scanner;

public class IsPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean res = isPal(num);
        System.out.println(res);
    }
    public static boolean isPal(int num){
        int res = 0;
        int temp = num;
        while (num != 0) {
            int mod = num % 10;
            res = res*10+mod;
            num = num/10;
        }
        if(res == temp){
            return true;
        }
        else{
            return false;
        }
    }
}
