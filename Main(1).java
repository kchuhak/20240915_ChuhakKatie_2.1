import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a scanner object for input
        Scanner input = new Scanner(System.in);

        // user is prompted to enter a celsius degree
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = input.nextDouble();

        // function that converts celsius to fahrenheit
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // displays result
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}