import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend! \n\"What's your name?:\"");
        String eName = input.nextLine();

        System.out.println("Enter a floating-point number: ");
        double spice = input.nextDouble();

        double formula = (4.0/3.0) * Math.pow(2, Math.sqrt(5.0)/Math.pow(spice,3.0));

        System.out.println("Well " + eName + ", the spice value resulted in " + formula);
        System.out.println("And the converted value is " + (int)(formula*100)*0.01);


    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        // define our named constants
        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        double area = wallHeight * wallWidth;
        System.out.println("Wall area :" + area + " square feet ");
        System.out.printf("Paint needed : % .2f gallons\n", (area/350));
        System.out.println("Cans needed: " + (int)Math.ceil(area/350) + "can(s)");

        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall

        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
    }
}
