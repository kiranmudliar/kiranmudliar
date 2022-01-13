import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter FirstName: ");
        String firstname = input.next();

        System.out.println("Enter LastName: ");
        String lastname = input.next();

        System.out.println("Your full name is " +firstname+" "+lastname);
    }
}
