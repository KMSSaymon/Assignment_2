import java.util.Scanner;
public class FileNameAndLocation {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        //prompting the user for input
        System.out.println("Enter the drive letter(c): ");
        String driveletter = Sc.nextLine();
        System.out.println("Enter the path (\\Windows\\System : ");
        String path = Sc.nextLine();
        System.out.println("Enter the file name: Readme");
        String fileName = Sc.nextLine();
        System.out.println("Enter the extension: text");
        String extension = Sc.nextLine();

        //printing the complete file name
        System.out.println("Complete file name : " + driveletter +":" + path + "\\" + fileName + "." + extension + ".");
    }
}
