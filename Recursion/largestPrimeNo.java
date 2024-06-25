public class largestPrimeNo {
    static int PrimeIndex = 0;
    static int largest = Integer.MIN_VALUE;
    public static Boolean isPrime(int number, int i) {
        if (i == number - 1) {
            return true;
        }
        if (number % i == 0) {
            return false;
        }
        isPrime(number, ++i);
        return true;
    }

    public static int largestPrimeIndex(int numbers[], int len, int index) {
        if (index == len - 1) {
            return -1;
        }
        if (isPrime(numbers[index], 2)) {
            if (numbers[index] >= largest) {
                PrimeIndex = index;
            }

        }
        largestPrimeIndex(numbers,len,index+1);
        return PrimeIndex;
    }

    public static void main(String[] args) {
        int numbers[] = { 10, 15, 3, 7, 11, 13, 17, 19, 23, 29,71 };
        int len = numbers.length;
        int result = largestPrimeIndex(numbers, len, 0);
        System.out.println("Index of the largest prime number: " + result);
    }
}
