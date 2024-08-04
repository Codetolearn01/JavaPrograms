package Basic;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = armstrongNum(num);
        System.out.println(res);
    }
    public static int armstrongNum(int num){
        int res = 0;
        while(num != 0){
            int mod = num%10;
            res = res+mod*mod*mod;
            num = num/10;
        }
        return res;
    }
}
