package selectionsort;

public class SelectionSort
{
    public void sort(int[] array) {
        // to run the loop for non-sorted elements
        for (int fill = 0; fill < (array.length - 1); fill++) {
            int posMin = fill;
            // to search for the smallest element
            for (int next = fill + 1; next < array.length; next++) {
                if (array[next] < array[posMin]) {
                    posMin = next;
                }
            }
            swap(array, fill, posMin);
        }
    }

    private void swap(int[] array, int fill, int posMin) {
        int temp = array[fill];
        array[fill] = array[posMin];
        array[posMin] = temp;
    }
}
