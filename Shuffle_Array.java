

///Shuffel_Array
// A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
import java.util.Random;

public class Shuffle_Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array:");
        printArray(array);

        // Shuffle the array
        shuffleArray(array);

        System.out.println("\nShuffled Array:");
        printArray(array);
    }

    // Fisher-Yates shuffle algorithm
    private static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int randomIndex = random.nextInt(i + 1);

            // Swap array[i] with the element at randomIndex
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }

    // Helper method to print the array
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
