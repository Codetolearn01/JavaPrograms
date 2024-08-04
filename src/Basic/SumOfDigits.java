package Basic;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = sumOfDig(num);
        System.out.println(res);
    }
    public static int sumOfDig(int num){
        int sum = 0;
        while(num!=0){
            int mod = num%10;
            sum = sum+mod;
            num/=10;
        }
        return sum;
    }
}
