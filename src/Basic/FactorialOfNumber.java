package Basic;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = fact(num);
        System.out.println(res);
    }
    public static int fact(int num){
        int res = 1;
        for(int i = num ; i >= 1; i--){
            res = res * i;
        }
        return res;
    }
}
