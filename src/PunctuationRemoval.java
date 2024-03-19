import java.util.Scanner;

public class PunctuationRemoval {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number with comma : ");
        String inputNUmber = sc.next();
        int len = inputNUmber.length();
        String firstSome = inputNUmber.substring(0,len-4);
        String lastThree = inputNUmber.substring(len-3,len);
        System.out.println(firstSome + lastThree);
    }
}
