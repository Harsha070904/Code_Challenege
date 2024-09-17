import java.util.Scanner;

public class FindDup {
    public static int findDup(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];
        
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast); 
        slow = arr[0];
        
        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
       
        return slow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];
       
        System.out.println("Enter the array elements (between 1 and " + (n - 1) + "): ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int duplicate = findDup(arr);
        System.out.println("The duplicate number is: " + duplicate);
        
        scanner.close();
    }
}
