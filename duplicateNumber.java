public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 3, 8, 5, 1};
        findDuplicates(array);
    }

    static void findDuplicates(int[] array) {
        boolean[] seen = new boolean[101]; // Assuming the range of values is from 1 to 100
        boolean[] duplicates = new boolean[101];
        
        for (int num : array) {
            if (seen[num]) {
                duplicates[num] = true;
            } else {
                seen[num] = true;
            }
        }

        boolean found = false;
        System.out.print("Duplicate values: ");
        for (int i = 1; i <= 100; i++) {
            if (duplicates[i]) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate values found.");
        } else {
            System.out.println();
        }
    }
}
