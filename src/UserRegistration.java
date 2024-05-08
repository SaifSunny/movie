public class UserRegistration {
    public boolean registerUser(String email) {
        //Refactor case

        // Check if email is empty
        if (email.isEmpty()) {
            System.out.println("Error: Email cannot be empty.");
            return false;
        }

        // Check if email contains '@' and '.'
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Error: Invalid email format.");
            return false;
        }
        return true;
    }
}
