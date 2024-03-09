import java.util.Arrays;

public class ClosestToZero {
    public static void main(String[] args) {
        int[] array = {1, -5, 2, 3, -8, 6};
        findClosestToZero(array);
    }

    static void findClosestToZero(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;
        int minSum = Integer.MAX_VALUE;
        int resultLeft = 0;
        int resultRight = 0;

        while (left < right) {
            int sum = array[left] + array[right];

            if (Math.abs(sum) < Math.abs(minSum)) {
                minSum = sum;
                resultLeft = left;
                resultRight = right;
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Two elements with sum closest to zero: " +
                array[resultLeft] + " and " + array[resultRight]);
    }
}
