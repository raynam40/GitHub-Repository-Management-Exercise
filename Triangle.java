// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *      The program gets input for three sides of a rectangle to calculate the Perimeter of a Triangle.
 *      The input is valid when the sum of a pair of two sides is greater than the last side.
 *
 *      Date Last Modified: 08/31/23
 *      @author Rayna Miller
 *      Lab Section 1
 *
 *      CS1122, Fall 2023
 *
 */
public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type the Side Lengths of your Triangle to calculate the Perimeter.");
        System.out.println("Enter side A");
        int sideA = input.nextInt();            // User input for the first side of a triangle
        System.out.println("Enter side B");
        int sideB = input.nextInt();            // User input for the second side of a triangle
        System.out.println("Enter side C");
        int sideC = input.nextInt();            // User input for the third side of a triangle

        if ((sideA + sideB > sideC) && (sideA + sideC > sideB) && (sideB + sideC > sideA)) {
            System.out.println(sideA + sideB + sideC);
        } else {
            System.out.println("Your input is not valid");
        }
    }
}