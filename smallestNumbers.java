public class SmallestElements {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 1, 7, 6};
        findSmallestElements(array);
    }

    static void findSmallestElements(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("No distinct second smallest element found.");
        } else {
            System.out.println("Smallest element: " + smallest);
            System.out.println("Second smallest element: " + secondSmallest);
        }
    }
}
