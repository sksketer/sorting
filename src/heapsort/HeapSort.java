package heapsort;

public class HeapSort {


    public static void sort(int[] array) {
        buildHeap(array);
        shrinkHeap(array);
    }


    private static void buildHeap(int[] array) {
        int currentIndex = 1;

        while (currentIndex++ < array.length) {

            int childIndex = currentIndex - 1;

            int parentIndex = (childIndex - 1) / 2;

            while (parentIndex >= 0 && array[parentIndex] < array[childIndex]) {
                swap(array, parentIndex, childIndex);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }
    }


    private static void shrinkHeap(int[] array) {

        int currentIndex = array.length;

        while (currentIndex-- > 0) {

            swap(array, 0, currentIndex);

            int parentIndex = 0;

            while (true) {

                int leftChildIndex = 2 * parentIndex + 1;

                if (leftChildIndex >= currentIndex) {
                    break;
                }

                int rightChildIndex = leftChildIndex + 1;
                // or simply, 2 * parentIndex + 2;

                int maxChildIndex = leftChildIndex;

                if (rightChildIndex < currentIndex &&
                        array[leftChildIndex] < array[rightChildIndex]) {
                    maxChildIndex = rightChildIndex;
                }

                if (array[parentIndex] < array[maxChildIndex]) {
                    swap(array, parentIndex, maxChildIndex);
                    parentIndex = maxChildIndex;
                } else {
                    break;
                }
            }
        }
    }


    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}