import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    @Test
    public void testUserRegistrationWithEmail() {
        UserRegistration userRegistration = new UserRegistration();
        String email = "example@example.com";
        boolean registrationStatus = userRegistration.registerUser(email);
        Assertions.assertTrue(registrationStatus, "User registration with email failed");
    }
}