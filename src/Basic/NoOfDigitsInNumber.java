package Basic;

import java.util.Scanner;

public class NoOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int res = countOfDigits(num);
        System.out.println(res);
    }
    public static int countOfDigits(int num){
        int count = 0;
        while(num != 0){
            count++;
            num = num/10;
        }
        return count;
    }
}
