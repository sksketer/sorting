package mergesort;

public class MergeSort
{
    public static void sort(int[] array) {
        // base case; we stop the partitioning or arrays when it has only 1 element
        if (array.length > 1) {
            int halfSize = array.length / 2;

            int[] leftArray = new int[halfSize];
            int[] rightArray = new int[array.length - halfSize];

            System.arraycopy(array, 0, leftArray, 0, halfSize);
            System.arraycopy(array, halfSize, rightArray, 0,
                    array.length - halfSize);

            sort(leftArray); // {x}
            sort(rightArray); // {y}

            merge(array, leftArray, rightArray);
            // {x, y}, {x}, {y}
        }
    }


    private static void merge(int[] outputArray, int[] leftSubArray, int[] rightSubArray) {
        int i = 0; // for leftSubArray
        int j = 0; // for rightSubArray
        int k = 0; // for outputArray

        while (i < leftSubArray.length && j < rightSubArray.length) {
            if (leftSubArray[i] < rightSubArray[j]) {
                outputArray[k++] = leftSubArray[i++];
            } else {
                outputArray[k++] = rightSubArray[j++];
            }
        }

        while (i < leftSubArray.length) {
            outputArray[k++] = leftSubArray[i++];
        }

        while (j < rightSubArray.length) {
            outputArray[k++] = rightSubArray[j++];
        }
    }
}
