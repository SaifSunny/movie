import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your email address: ");
//        String email = scanner.nextLine();
        String email = "example@example.com";
        System.out.println("Email address entered: " + email);

        UserRegistration ur = new UserRegistration();
        boolean status = ur.registerUser(email);

//        scanner.close();
    }
}