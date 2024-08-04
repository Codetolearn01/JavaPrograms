package Basic;

import java.util.Scanner;

public class ReversingANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = reverse(num);
        System.out.println(res);
    }
    public static int reverse(int num){
        int rev = 0;
        while(num != 0){
            int mod = num%10;
            rev = rev*10+mod;
            num=num/10;
        }
        return rev;
    }
}
