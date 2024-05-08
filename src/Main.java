import java.util.Scanner;

public class Main {

    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. All Movies");
        System.out.println("2. Search Movie");
        System.out.println("3. My Favorite Movies");
        System.out.println();
        System.out.println("Enter your Choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        scanner.close();

    }

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

        if (status){
            menu();
        }
    }
}