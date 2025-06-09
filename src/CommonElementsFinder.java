import java.util.Set;
import java.util.TreeSet;

/**
 * The CommonElementsFinder class provides a method for finding common elements
 * between two arrays of integers.
 */
public class CommonElementsFinder {

    /**
     * Finds the common elements between two arrays of integers.
     *
     * @param array1 the first array of integers
     * @param array2 the second array of integers
     * @return a Set<Integer> containing the integers that are present in both arrays
     */
    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        // TODO

        Set<Integer> set1 = new TreeSet<>();
            for (int num : array1) {
                set1.add(num);
            }


        Set<Integer> set2 = new TreeSet<>();
        for (int num : array2) {
                set2.add(num);
            }

        Set<Integer> commonNumSet = new TreeSet<>();
        for (int num : set1) {
            if (set2.contains(num)) {
                commonNumSet.add(num);
            }
        }

        return commonNumSet;
    }


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        Set<Integer> common = findCommonElements(array1, array2);
        System.out.println("Common elements: " + common);
    }
}
