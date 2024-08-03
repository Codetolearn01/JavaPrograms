package Basic;

public class charactersRanging {
    public static void main(String[] args) {
//        char ch = 68;
//        System.out.println(ch);
        char ch ;
        System.out.println("*******************");
        System.out.println("Captial alpabets (64-89)");
        for(int i = 64; i<=89;i++){
            ch = (char)(i + 1);
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("*******************");
        System.out.println("Special characters(90-95)");
        System.out.println("*******************");
        for(int i = 90; i<=95;i++){
            ch = (char)(i + 1);
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("*******************");
        System.out.println("Small alphabets(96-121)");
        System.out.println("*******************");
        for(int i = 96; i<=121;i++){
            ch = (char)(i + 1);
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("*******************");
        System.out.println("Spec characters (122-125)");
        System.out.println("*******************");
        for(int i = 122; i<=125;i++){
            ch = (char)(i + 1);
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("*******************");
    }
}
