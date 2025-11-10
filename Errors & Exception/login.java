import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class login {
    public static void validate(String user, String pass) throws InvalidCredentialsException {
        String validUser = "admin";
        String validPass = "1234";
        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid username or password");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.print("Enter username: ");
            String user = input.nextLine();
            System.out.print("Enter password: ");
            String pass = input.nextLine();

            try {
                validate(user, pass);
                System.out.println("Login successful!");
                loggedIn = true;
            } catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage());
                System.out.println("Please try again.\n");
            }
        }

        input.close();
    }
}
