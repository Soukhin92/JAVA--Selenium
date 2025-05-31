package functionLibrary.ConditionalStatementConcepts;

public class PrimeCheck {
    public static void main(String[] args) {

        int number=11;


        // Check for prime
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            // Check from 2 to square root of number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is NOT a Prime Number.");
        }
    }
}