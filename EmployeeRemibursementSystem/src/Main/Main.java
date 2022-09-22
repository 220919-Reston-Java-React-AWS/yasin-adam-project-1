package Main;

import java.util.Scanner;
import Main.MainMenu;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        MainMenu mainMenuObject = new MainMenu();
        mainMenuObject.display();

        System.out.println("Thank you for using our software!");
        System.out.println("Take Care!");
    }
}
