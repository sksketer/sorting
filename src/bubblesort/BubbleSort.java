package bubblesort;

public class BubbleSort {

    public void sort(int[] array, int choiceForSorting) {
        System.out.println(choiceForSorting == 1 ? "DESCENDING ORDER SORT" : "ASCENDING ORDER SORT");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array.length - 1); j++) {
                if (choiceForSorting == 1) {
                    sortDescending(array, j);
                } else {
                    sortAscending(array, j);
                }
            }
        }
    }

    private void sortDescending(int[] array, int j) {
        if (array[j] < array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }

    private void sortAscending(int[] array, int j) {
        if (array[j] > array[j + 1]) {
            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;
        }
    }
}