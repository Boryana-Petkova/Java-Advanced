package SetAndMapsLab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Set<String> parkingLot = new LinkedHashSet<>();
        // ако е лист, ще има твърде много пренареждане на елементите
        // при всяко махане на елемент, и твърде много обхождане

        while (!input.equals("END")){
            String [] tokens = input.split(", ");
            String direction = tokens[0];
            String carRegistration = tokens[1];

            if (direction.equals("IN")){
                parkingLot.add(carRegistration);
            }else {
                parkingLot.remove(carRegistration);
            }

            input = scanner.nextLine();
        }
        if (parkingLot.isEmpty()){
            System.out.println("Parking Lot is Empty");
        } else {
            for (String car : parkingLot) {
                System.out.println(car);
            }
        }
    }
}
