package Main;

public class About {
    public void info() {

        while (true) {
            System.out.println("==========YADAM Tech Reimbursement System==========");
            System.out.println("Thank you for using our Reimbursement System.");
            System.out.println("This system was created to provide an efficient and easy to use system for companies to manage employee reimbursements.");
            System.out.println("This software allows managers to view all requests, approve or deny requests, filter requests, as well look at total money reimbursed.");
            System.out.println("This software also allows for employees to submit tickets, check on past tickets and their status.");
            System.out.println("For any questions please do not hesitate to contact us at 123-456-7890");
            System.out.println(" ");
            System.out.println("Please select the following option");
            System.out.println("1.) Return back to the main menu");

            String choice = Main.sc.nextLine();

            if (choice.equals("1")) {
                System.out.println("Redirecting you to the main menu");
                break;
            }

            else {
                System.out.println("Invalid entry");
            }
        }
    }
}
