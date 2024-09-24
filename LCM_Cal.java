import java.util.Scanner;

public class LCM_Cal {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("First number (N): ");
        int N = scanner.nextInt();
        
        System.out.print("Second number (M): ");
        int M = scanner.nextInt();
       
        int lcm = lcm(N, M);
        
        System.out.println("Output: " + lcm);
        
        scanner.close();
    }
}
