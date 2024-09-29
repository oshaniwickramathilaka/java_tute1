import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter length in centimeters:" );
        double centimeters=scanner.nextDouble();
        double meters=centimeters/100;
        double feet=centimeters/30.48;
        System.out.println(centimeters+"cm is equal to:");
        System.out.println(meters+"meters");
        System.out.println(feet+"feet");
        scanner.close();

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}