package assessment2;

import java.util.Scanner;

/**
 * Handles user I/O and runs the price
 * computer.
 * 
 * @author xanderdyer
 *
 */
public class EngineRunner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter the number the vehicle you are looking to rent:\n"
            + "1 - Charter, 2 - Mini Bus, 3 - Sprinter, 4 - Party Bus, \n5 - Sedan, 6 - SUV, "
            + "7 - Limousine, 8 - Trolley\n");
        int vehicleType = Integer.parseInt(input.nextLine());
        System.out.println("How many of these vehicles are you looking to rent?:");
        int count = Integer.parseInt(input.nextLine());
        System.out.printf("Which pricing plan would you like?: \n(1 - Daily, 2 - Hourly, 3 - Distance)\n");
        int ptype = Integer.parseInt(input.nextLine());
        switch (ptype) {
            case 1:
                System.out.println("How many days would you like to rent this vehicle for?:");
                break;
            case 2:
                System.out.println("How many hours would you like to rent this vehicle for?:");
                break;
            case 3:
                System.out.println("How many miles would you like to rent this vehicle for?:");
                break;
        }
        double un = Double.parseDouble(input.nextLine());
        Vehicle veh = new Vehicle(vehicleType, ptype);
        PriceComputer result = new PriceComputer(count, veh, un);
        System.out.println("The estimate for your trip specifications is $" + result.compute());
        input.close();
    }

}
