import java.util.Scanner;

public class MissingNum(2) {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int totalSum = n * (n + 1) / 2;
        System.out.println("Enter " + (n - 1) + " integers from the range 1 to " + n + ":");
        int actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            actualSum += scanner.nextInt();
        }

        int missingNum = totalSum - actualSum;
        System.out.println("The missing number is: " + missingNum);

        scanner.close();
    }
}
