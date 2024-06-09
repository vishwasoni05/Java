import java.util.HashMap;
import java.util.Arrays;

public class MapTask {

    public static double calculateAverageGrade(String[] studentNames,double[] studentGrades){
        HashMap<String, Double> map = new HashMap<>();
        double sum = 0;
        map.put(studentNames[0], studentGrades[0]);
        map.put(studentNames[1], studentGrades[1]);
        map.put(studentNames[2], studentGrades[2]);
        map.put(studentNames[3], studentGrades[3]);

        System.out.println(map);

        for (double d : map.values()) {
            sum += d;
        }
        
        double averageGrades = (sum) / map.size();
        return averageGrades;
    }
    public static void main(String[] args) {
        String[] studentNames = { "Alice", "Bob", "Charlie", "David" };
        double[] studentGrades = { 85.5, 92.0, 78.5, 88.0 };
        double averageGrades = calculateAverageGrade(studentNames, studentGrades);
        System.out.println("The average grade for class: "+averageGrades);

    }
}
