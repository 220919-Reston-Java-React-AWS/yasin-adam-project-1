package Main;

import Main.Main;

public class MainMenu {

    public void display() {

        while (true) {
            System.out.println("Welcome to the YADAM Tech Reimbursement System!");
            System.out.println("To get started, please select from the following options");
            System.out.println("1.) Login");
            System.out.println("2.) Register");
            System.out.println("3.) Contact and About");
            System.out.println("4) Exit");

            String choice = Main.sc.nextLine();

            if (choice.equals("1")) {
                System.out.println("Redirecting you to the login page");
                LoginMenu loginMenuObject = new LoginMenu();
                loginMenuObject.loginPrompt();
            }

            else if (choice.equals("2")) {
                System.out.println("Redirecting you to the registration page");
                RegistrationMenu registrationMenu = new RegistrationMenu();
                registrationMenu.registration();
            }

            else if (choice.equals("3")) {
                System.out.println("Redirecting you to our about us page");
                About aboutObject = new About();
                aboutObject.info();
            }

            else if (choice.equals("4")) {
                return;
            }

            else {
                System.out.println("Invalid entry");
            }
        }



    }

}
