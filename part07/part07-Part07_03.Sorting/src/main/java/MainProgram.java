
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {

        int[] array = {3, 1, 5, 99, 3, 12};
        MainProgram.sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        return smallest;
    
    }   

    public static int indexOfSmallest(int[] array) {
        int indexOfSmallest = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[indexOfSmallest]) {
                indexOfSmallest = i; // Save the new smallest element's index
            }
        }

        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int indexOfSmallest = startIndex;

        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[indexOfSmallest]) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int i1, int i2) {
        int r = array[i1];
        array[i1] = array[i2];
        array[i2] = r;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));

            int smallestIndex = MainProgram.indexOfSmallestFrom(array, i);

            MainProgram.swap(array, i, smallestIndex);
        }
    }
}
