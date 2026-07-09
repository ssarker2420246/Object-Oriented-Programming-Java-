import java.util.ArrayList;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner SCAN= new Scanner(System.in);
        ArrayList<Character> chars = new ArrayList<Character>();

        System.out.print("Enter a String: ");
        String string = SCAN.nextLine();

        for (int J = 0 ; J<string.length(); J++ ){
            chars.add(string.charAt(J));
        }

        System.out.println(chars);

        if (string.length()>=3){
            chars.set(2,'z');
        }else {
            System.out.println("This String does not have the Third Element!!");
        }

        System.out.println(chars);

    }

}

