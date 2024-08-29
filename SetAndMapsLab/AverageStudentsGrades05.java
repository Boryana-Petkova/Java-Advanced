package SetAndMapsLab;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, List<Double>> students = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String [] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            Double grade = Double.parseDouble(tokens[1]);

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : students.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            // принтиране на учениците

            List<Double> gradesStudent = entry.getValue();
            for (Double grade: gradesStudent) {
                System.out.printf("%.2f ", grade);
                // принтиране на всички оценки на съответен ученик
            }
            double sum = 0;
            for (int i = 0; i < gradesStudent.size(); i++) {
                double curr = gradesStudent.get(i);
                sum += curr;
            }
            double avg = sum / gradesStudent.size();
            System.out.printf("(avg: %.2f)%n", avg);
            // принтиране на средна оценка от всичките
        }
    }
}
