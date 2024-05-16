import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a whole number: ");
        int number = scanner.nextInt();

        Set<Integer> primeFactors = factorizeToPrimes(number);

        if (primeFactors.size() == 1 && primeFactors.contains(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not prime.");
            System.out.println("Prime factors: " + primeFactors);
        }

        scanner.close();
    }

    // Function to factorize a number into prime factors using a Set
    private static Set<Integer> factorizeToPrimes(int n) {
        Set<Integer> primeFactors = new HashSet<>();
        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        if (n > 1) {
            primeFactors.add(n);
        }
        return primeFactors;
    }
}
