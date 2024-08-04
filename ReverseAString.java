package Strings;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res1 = reverseMethod_1(str);
        String res2 = reverseMethod_2(str);
        System.out.println(res1);
        System.out.println(res2);
    }
    public static String reverseMethod_1(String str){
        String rev = "";
        for(char ch : str.toCharArray()){
            rev = ch + rev;
        }
        return rev;
    }
    public static String reverseMethod_2(String str){
        StringBuilder rev = new StringBuilder(str);
//        for(char s : str.toCharArray()){
//            rev.append(s);
//        }
        
//        return rev.toString();
        return String.valueOf(rev.reverse());
    }

}
