package Strings;

import java.util.Scanner;

public class ReverseEachWord {
//   input :  I love Java Programming
//   output : I evol avaJ gnimmargorP

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = reverseWords(str);
        System.out.println(res);
    }
    public static String reverseWords(String str){
        StringBuilder revString = new StringBuilder();
        String [] parts = str.split(" ");

        for(String part : parts){
            StringBuilder revEach = new StringBuilder();

            for(char p : part.toCharArray()){

                revEach.insert(0,p);

            }
            revString.append(revEach).append(" ");
        }
        return revString.toString();
    }
}
