
    import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating an array of size 5
        int[] numbers = new int[5];

        // Getting user input
        int[] r = {12, 5, 20, 8, 15};
int t = 0;

for (int i = 0; i < r.length; i++) {
    if (r[i] > 10)
        t += r[i];
}

System.out.println(t);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Displaying the array
        System.out.println("\nNumbers stored in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        input.close();
    }
}

