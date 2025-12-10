import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        // STATIC ARRAY
        int[] scores = {10, 20, 30, 40, 50};

        // Print each score
        System.out.println("Static Scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        // Sum
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("Sum = " + sum);

        // Average
        System.out.println("Average = " + (sum / scores.length));

        // Highest and Lowest
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) highest = scores[i];
            if (scores[i] < lowest) lowest = scores[i];
        }

        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);


        // DYNAMIC ARRAY
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        // Input values
        for (int i = 0; i < n; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        // Print updated array
        System.out.println("\nUpdated Scores:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        sc.close();
    }
}