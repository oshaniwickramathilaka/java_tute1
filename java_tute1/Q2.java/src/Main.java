import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your full name(first middle last):");
        String fullName=scanner.nextLine();
        String[] nameParts=fullName.split("");
        if(nameParts.length==3){
            String firstName=nameParts[0];
            String middleName=nameParts[1];
            String lastName=nameParts[2];
            String formattedName=lastName+","+firstName+middleName.charAt(0)+".";
            System.out.println("Formatted name:"+formattedName);

        }
        else{
            System.out.println("Please enter the name in 'first middle last' format.");

        }
        scanner.close();

    }
}