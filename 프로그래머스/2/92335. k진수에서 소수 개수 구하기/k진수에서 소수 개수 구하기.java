class Solution {
    public boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int solution(int n, int k) {

        String converted = Integer.toString(n, k);

        String[] parts = converted.split("0+");

        int primeCount = 0;
        for (String part : parts) {
            if (!part.isEmpty() && isPrime(Long.parseLong(part))) {
                primeCount++;
            }
        }

        return primeCount;
    }
}
