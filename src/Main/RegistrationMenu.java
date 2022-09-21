package Main;

public class RegistrationMenu {

    public void registration() {


            System.out.println("Please create a username");
               String newUsername = Main.sc.nextLine();


            System.out.println("Please create a password");
            String newPassword = Main.sc.nextLine();

            System.out.println("Please confirm password");
            String confirmPassword = Main.sc.nextLine();

            if (!newPassword.equals(confirmPassword)) {
                System.out.println("Passwords do not match, please re-enter new password");

            }

            else if (newPassword.equals(confirmPassword)) {
                System.out.println("You have successfully created a new username and password");
                System.out.println("You will now be redirected to the login page");
                LoginMenu loginMenuObject = new LoginMenu();
                loginMenuObject.loginPrompt();



           }


}}
