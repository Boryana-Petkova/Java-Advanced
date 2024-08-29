package SetAndMapsLab;

import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeSet<String> vip = new TreeSet<>();
        TreeSet<String> regular = new TreeSet<>(); // използваме tree защото виждаме,
                                                    // че са низходящо подредени в output-а
        String guest = scanner.nextLine();

        while (!guest.equals("PARTY")){
            char startGuest = guest.charAt(0);
            if (Character.isDigit(startGuest)){
                vip.add(guest);
            } else {
                regular.add(guest);
            }


            guest = scanner.nextLine();
        }
        guest = scanner.nextLine();

        while (!guest.equals("END")){
            vip.remove(guest);
            regular.remove(guest);

            guest = scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size()); // принтираме размерите на сетовете

        for (String guestVip : vip) {
            System.out.println(guestVip); // първо виповете принтираме
        }
        for (String guestReg : regular) {
            System.out.println(guestReg);
        }
    }
}
