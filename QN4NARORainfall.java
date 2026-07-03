import java.util.Random;

public class QN4NARORainfall {

    public static void main(String[] args) {

        Random rand = new Random();

        int[] rainfall = new int[30];

        int total = 0;
        int wetDays = 0;

        System.out.println("Daily Rainfall Readings (mm):");

        for (int i = 0; i < 30; i++) {

            rainfall[i] = rand.nextInt(61); // 0–60 mm

            System.out.println("Day " + (i + 1) + ": " + rainfall[i]);

            total += rainfall[i];

            if (rainfall[i] > 30) {
                wetDays++;
            }
        }

        double average = (double) total / 30;

        System.out.println("\nTotal Monthly Rainfall = " + total + " mm");
        System.out.printf("Average Daily Rainfall = %.2f mm%n", average);
        System.out.println("Number of Wet Days = " + wetDays);

        // Classification
        if (total <= 300) {
            System.out.println("Month Classification: Dry");
        }
        else if (total < 600) {
            System.out.println("Month Classification: Normal");
        }
        else {
            System.out.println("Month Classification: Flood-risk");
        }
    }
}
