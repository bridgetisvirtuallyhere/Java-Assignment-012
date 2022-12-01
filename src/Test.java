import java.util.Arrays;

public class Test {

    // find the lowest card at or to the right of i
    public int findTheLowest(int[] array, int idx) {

        int min = idx;

        for (int i = idx + 1; i < array.length; i++) {
            if (array[min] > array[i]) {
                min = i;
            }
        }
        return min;
    }

    public void selectionSort(int[] array) {
        for (int i=0; i<array.length; i++) {
            int min = findTheLowest(array, i);
            swap(array, i, min);
        }
    }

    // swap the ith card and the lowest card found
    public void swap(int[] array, int i, int min) {
        int temp = array[min];
        array[min] = array[i];
        array[i] = temp;
    }

    public static void main(String[] args) {
        Test t = new Test();
        int[] array = {12,5,19,10,74,64};
        t.selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
