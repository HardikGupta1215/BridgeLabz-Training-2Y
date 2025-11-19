import java.math.BigInteger;
import java.util.*;

public class NumberTasks {

    // ----------------------- Section A -----------------------

    // 1. Is Even?
    public static boolean isEven(long n) { return (n & 1) == 0; }

    // 2. Is Odd?
    public static boolean isOdd(long n) { return (n & 1) != 0; }

    // 3. Return Last Digit of the Given Number
    public static int lastDigit(long n) { return (int)Math.abs(n % 10); }

    // 4. Return Second Last Digit of the Given Number
    public static int secondLastDigit(long n) {
        return (int)(Math.abs(n / 10) % 10);
    }

    // 5. Sum of Last Digits of Two Given Numbers
    public static int sumOfLastDigits(long a, long b) {
        return lastDigit(a) + lastDigit(b);
    }

    // 6. Is N an Exact Multiple of M?
    public static boolean isExactMultiple(long n, long m) {
        if (m == 0) throw new ArithmeticException("Division by zero (m=0)");
        return n % m == 0;
    }

    // 7. Of Given 5 Numbers, How Many Are Even?
    public static int countEven(long[] arr) {
        int c = 0; for (long x : arr) if (isEven(x)) c++; return c;
    }

    // 8. Of Given 5 Numbers, How Many Are Odd?
    public static int countOdd(long[] arr) {
        int c = 0; for (long x : arr) if (isOdd(x)) c++; return c;
    }

    // 9. Of 5 Numbers, Count How Many Are Even or Odd
    public static Map<String,Integer> countEvenOdd(long[] arr) {
        Map<String,Integer> m = new HashMap<>();
        m.put("even", countEven(arr));
        m.put("odd", countOdd(arr));
        return m;
    }

    // ----------------------- Section B -----------------------

    // 1. Is Prime?
    public static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0) return false;
        long r = (long)Math.sqrt(n);
        for (long i = 3; i <= r; i += 2) if (n % i == 0) return false;
        return true;
    }

    // 2. Factorial of a Number (BigInteger for safety)
    public static BigInteger factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) res = res.multiply(BigInteger.valueOf(i));
        return res;
    }

    // 3. Nth Fibonacci Number (0-based: fib(0)=0, fib(1)=1)
    public static BigInteger nthFibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be >= 0");
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;
        BigInteger a = BigInteger.ZERO, b = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            BigInteger t = a.add(b);
            a = b; b = t;
        }
        return b;
    }

    // 4. Nth Prime Number (1-based: nthPrime(1)=2)
    public static long nthPrime(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be >= 1");
        if (n == 1) return 2;
        int count = 1; // counted prime 2
        long candidate = 1;
        while (count < n) {
            candidate += 2; // only odd candidates
            if (isPrime(candidate)) count++;
        }
        return candidate;
    }

    // 5. Number of Primes in a Specified Range [L, R]
    public static int countPrimesInRange(long L, long R) {
        if (R < L) return 0;
        int c = 0;
        for (long x = Math.max(2, L); x <= R; x++) if (isPrime(x)) c++;
        return c;
    }

    // 6. Count of All Digits in a Number (total digits)
    public static int countAllDigits(long n) {
        if (n == 0) return 1;
        return String.valueOf(Math.abs(n)).length();
    }

    // 7. Count of Unique Digits in a Number (how many distinct digits appear)
    public static int countUniqueDigits(long n) {
        boolean[] seen = new boolean[10];
        String s = String.valueOf(Math.abs(n));
        for (char ch : s.toCharArray()) seen[ch - '0'] = true;
        int c = 0; for (boolean b : seen) if (b) c++; return c;
    }

    // 8. Count of Non-Repeated Digits in a Number (digits appearing exactly once)
    public static int countNonRepeatedDigits(long n) {
        int[] freq = new int[10];
        String s = String.valueOf(Math.abs(n));
        for (char ch : s.toCharArray()) freq[ch - '0']++;
        int c = 0; for (int f : freq) if (f == 1) c++; return c;
    }

    // 9. digitSum: Sum of All Digits in a Number
    public static int digitSum(long n) {
        int sum = 0; for (char ch : String.valueOf(Math.abs(n)).toCharArray()) sum += ch - '0';
        return sum;
    }

    // 10. digitSum Even: Sum of Even Digits Only
    public static int digitSumEven(long n) {
        int sum = 0; for (char ch : String.valueOf(Math.abs(n)).toCharArray()) {
            int d = ch - '0'; if ((d & 1) == 0) sum += d;
        }
        return sum;
    }

    // 11. digitSum Odd: Sum of Odd Digits Only
    public static int digitSumOdd(long n) {
        int sum = 0; for (char ch : String.valueOf(Math.abs(n)).toCharArray()) {
            int d = ch - '0'; if ((d & 1) == 1) sum += d;
        }
        return sum;
    }

    // ----------------------- Helper / Demo -----------------------
    public static void main(String[] args) {
        // Quick demo for a few methods - replace or extend for testing.
        System.out.println("isEven(10) = " + isEven(10));
        System.out.println("lastDigit(123) = " + lastDigit(123));
        System.out.println("sumOfLastDigits(27, 45) = " + sumOfLastDigits(27, 45));
        System.out.println("isPrime(97) = " + isPrime(97));
        System.out.println("factorial(20) = " + factorial(20));
        System.out.println("nthFibonacci(50) = " + nthFibonacci(50));
        System.out.println("nthPrime(10) = " + nthPrime(10));
        System.out.println("countPrimesInRange(1,100) = " + countPrimesInRange(1,100));
        long[] five = {1,2,3,4,5};
        System.out.println("countEven in {1..5} = " + countEven(five));
        System.out.println("digitSum(9876543210) = " + digitSum(9876543210L));
        System.out.println("digitSumEven(2468) = " + digitSumEven(2468));
        System.out.println("digitSumOdd(13579) = " + digitSumOdd(13579));
    }
}
