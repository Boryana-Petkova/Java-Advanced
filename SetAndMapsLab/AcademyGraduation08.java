package SetAndMapsLab;

import java.util.*;

public class AcademyGraduation08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        TreeMap<String, double[]> gradesStudents = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
           double [] gradesData = Arrays.stream(scanner.nextLine().split(" "))
                   .mapToDouble(Double::parseDouble).toArray();

           gradesStudents.put(name, gradesData);

        }
        for (Map.Entry<String, double[]> entry : gradesStudents.entrySet()) {
            double[] currentGrade = entry.getValue();
            double sum = 0;
            for (int i = 0; i < currentGrade.length; i++) {
                sum += currentGrade[i];
            }
            double avg = sum / currentGrade.length;
            System.out.println(entry.getKey() + " is graduated with " + avg);
            // принтиране на учениците
            // принтиране на средна оценка от всичките
        }
            //George is graduated with 4.375
    }
}
