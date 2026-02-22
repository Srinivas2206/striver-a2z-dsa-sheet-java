public class FindTheRepeatingandMissing {
    public int[] findMissingRepeatingNumbers(int[] nums) {
       int n = nums.length;

       long expectedSum = (long) n * (n + 1) / 2;
       long expectedSquareSum = (long) n * (n + 1) * (2*n + 1) / 6;

       long actualSum = 0, actualSquareSum = 0;
       for (int num:nums){
        actualSum += num;
        actualSquareSum += (long) num*num;
       }

       long diff = expectedSum - actualSum;
       long squareDiff = expectedSquareSum - actualSquareSum;

       long sumMR = squareDiff/diff;

       long missing = (diff + sumMR) /2;
       long repeating = missing - diff;

       return new int[]{(int) repeating, (int) missing};

    }
}
