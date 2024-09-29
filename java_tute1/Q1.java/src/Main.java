import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter an odd length word:");
        String word=scanner.nextLine();
        if(word.length()%2==0){
            System.out.println("The word does not have an odd length");

        }
        else{
            int middleIndex=word.length()/2;
            System.out.println("The middle character is:"+word.charAt(middleIndex));
        }
        scanner.close();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}