import  java.util.Scanner;
public class SimpleCalc {
   /* public enum romaDigits  {
        I, II, III, IV, V, VI, VII, VIII, IX, X
    };*/



    public static void main(String[] args) {
        int op1;
        int op2;
        char op;

        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split("\\s");

        try {
            ArithOper ap = new ArithOper(str[1], str[0], str[2]);

            if (ap.romaDigits) {
                System.out.println(ap.intToRoman(ap.getResult()));
            } else {
                System.out.println(ap.getResult());
            }

            /*if (ap.isRomaDigits(str[0], str[2])) {
                ap.convertRomaToArab(str[0], str[2]);
                System.out.println(ap.convertArabToRoma(ap.getResult()));
            }
            if (ap.isArabDigits(str[0], str[2])) {
                System.out.println(ap.getResult());
            }*/
        } catch (Exception e) {
            System.out.println(e);
        }

    }





    
}
