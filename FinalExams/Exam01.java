package FinalExams;

import java.util.*;


public class Exam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] fuelSequence = scanner.nextLine().split(" ");
        String[] consumptionSequence = scanner.nextLine().split(" ");
        String[] neededFuelSequence = scanner.nextLine().split(" ");

        Stack<Integer> fuelStack = new Stack<>();
        Queue<Integer> consumptionQueue = new LinkedList<>();
        Queue<Integer> neededFuelQueue = new LinkedList<>();

        for (String fuel : fuelSequence) {
            fuelStack.push(Integer.parseInt(fuel));
        }

        for (String consumption : consumptionSequence) {
            consumptionQueue.offer(Integer.parseInt(consumption));
        }

        for (String neededFuel : neededFuelSequence) {
            neededFuelQueue.offer(Integer.parseInt(neededFuel));
        }

        int currentAltitude = 1;
        boolean reachedTop = false;

        while (!fuelStack.isEmpty() && !neededFuelQueue.isEmpty()) {
            int currentFuel = fuelStack.pop();
            int consumption = consumptionQueue.poll();
            int neededFuel = neededFuelQueue.poll();


            if (currentFuel >= neededFuel) {
                System.out.println("John has reached: Altitude " + currentAltitude);
            } else {
                System.out.println("John did not reach: Altitude " + currentAltitude);
                if (currentAltitude == 1) {
                    System.out.println("John didn't reach any altitude.");
                } else {
                    currentAltitude--;
                    System.out.println("John failed to reach the top.");
                    System.out.print("Reached altitudes: ");
                    for (int i = 1; i <= currentAltitude; i++) {
                        if (i == currentAltitude){
                            System.out.println("Altitude " + i);
                        } else {
                            System.out.print("Altitude " + i + ", ");

                        }
                    }

                }
            }
            if (currentFuel < neededFuel){
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
