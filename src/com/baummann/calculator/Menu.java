package com.baummann.calculator;

//Imports existing Java-class "Scanner" to read user input
import java.util.Scanner;

//The Menu-class contains all methods and variables used to display and navigate the menu
public class Menu {

    //Creates a new scanner-object that are used within the menu-class
    private Scanner scanner = new Scanner(System.in);

    //A public mainMenu-method that shows the menu. It can be used/called from other classes.
    public void mainMenu() {

        //Variable used to keep the menu running, until the user wants to exit
        boolean running = true;

        //A list/array of strings with available options for the user to choose from
        String[] options = {"Addition", "Subtraction", "Multiplication", "Division", "Exit Program"};

        //Loop that prints the menu until running = false
        while (running) {

            //A loop that prints all options in the array and adds a number (i + 1) in front of every option
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            System.out.print("Enter your choice: ");
            //Stores value of user input in the int choice-variable
            int choice = scanner.nextInt();

            //Switch that compares the value of choice to the options with matching value
            switch (choice) {
                case 1:
                    System.out.println("You selected " + options[0]);
                    double[] numbers = new double[2];
                    System.out.println("Enter the first number: ");
                    numbers[0] = scanner.nextDouble();
                    System.out.println("Enter the second number: ");
                    numbers[1] = scanner.nextDouble();

                    double result = Operations.addition(numbers);
                    System.out.println("The result is: " + result);
                    break;

                    case 2:
                        System.out.println("You selected " + options[1]);
                        // TODO: call Operations.subtraction()
                        break;
                        case 3:
                            System.out.println("You selected " + options[2]);
                            // TODO: call Operations.multiplication()
                            break;
                            case 4:
                            System.out.println("You selected " + options[3]);
                            // TODO: call Operations.division()
                            break;

                                //Running turns false and the loop is ended
                                case 5:
                                running = false;
                                System.out.println("Exiting program...");
                                break;

                                    //Simple error-handling.
                                    default:
                                    System.out.println("Invalid choice. Choose a number between 1 and " + options.length);
            }
        }
        scanner.close();

    }
}
