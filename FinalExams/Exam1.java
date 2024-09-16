package FinalExams;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fuelSequence = scanner.nextLine().split(" ");
        String[] consumptionSequence = scanner.nextLine().split(" ");
        String[] neededFuelSequence = scanner.nextLine().split(" ");

        int n = fuelSequence.length;
        int[] fuel = new int[n];
        int[] consumption = new int[n];
        int[] neededFuel = new int[n];

        for (int i = 0; i < n; i++) {
            fuel[i] = Integer.parseInt(fuelSequence[i]);
            consumption[i] = Integer.parseInt(consumptionSequence[i]);
            neededFuel[i] = Integer.parseInt(neededFuelSequence[i]);
        }

        int currentAltitude = 1;
        boolean reachedTop = false;

        for (int i = 0; i < n; i++) {
            int currentFuel = fuel[i];
            int currentConsumption = consumption[i];
            int currentNeededFuel = neededFuel[i];

            if (currentFuel >= currentNeededFuel) {
                System.out.println("John has reached: Altitude " + currentAltitude);
            } else {
                System.out.println("John did not reach: Altitude " + currentAltitude);
                if (currentAltitude == 1) {
                    System.out.println("John didn't reach any altitude.");
                } else {
                    currentAltitude--;
                    System.out.println("John failed to reach the top.");
                    System.out.print("Reached altitudes: ");
                    for (int j = 1; j <= currentAltitude; j++) {
                        if (j == currentAltitude) {
                            System.out.println("Altitude " + j);
                        } else {
                            System.out.print("Altitude " + j + ", ");
                        }
                    }
                }
            }

            if (currentFuel < currentNeededFuel) {
                reachedTop = true;
                break;
            }

            currentAltitude++;
        }

        if (!reachedTop) {
            System.out.println("John has reached all the altitudes and managed to reach the top!");
        }
    }
}
