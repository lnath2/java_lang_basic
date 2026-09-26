import java.util.Scanner;
public class ScTest {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);      
            System.out.print("What is your name? ");
            String userName = sc.nextLine();
            System.out.println("Welcome," + userName + "!");
            
            //Scanner enclosure.
            sc.close();
    }



}