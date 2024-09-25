import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime_Fac {

    public static List<Integer> primeFactors(int N) {
        List<Integer> factors = new ArrayList<>();
        while (N % 2 == 0) {
            factors.add(2);
            N /= 2;
        }
        for (int i = 3; i <= Math.sqrt(N); i += 2) {
            while (N % i == 0) {
                factors.add(i);
                N /= i;
            }
        }
        if (N > 2) {
            factors.add(N);
        }
        
        return factors;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int N = scanner.nextInt();
        List<Integer> result = primeFactors(N);
        System.out.println(result);
        
        scanner.close();
    }
}
