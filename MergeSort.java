import java.util.Arrays;

public class MergeSort {

    public static void mergesort(int[] array) {
        mergesort(array, new int[array.length], 0, array.length - 1);    
    }

    public static void mergesort(int[] array, int[] temp, int left, int right) {
        if (left < right){
            int mid = (left + right) / 2;
            mergesort(array, temp, left, mid);
            mergesort(array, temp, mid + 1, right);
            merge(array, temp, left, right);
        }
    }

    public static void merge(int[] array, int[] temp, int left, int right) {
        int leftStart = left;
        int leftEnd = (left + right) / 2;
        int rightStart = leftEnd + 1;
        int rightEnd = right;
        int index = leftStart;
        while (leftStart <= leftEnd && rightStart <= rightEnd){
            if (array[leftStart] < array[rightStart]){
                temp[index] = array[leftStart];
                leftStart++;
            } else {
                temp[index] = array[rightStart];
                rightStart++;
            }
            index++;
        }
        for (int i = leftStart; i <= leftEnd; i++) {
            temp[index] = array[i];
            index++;
        }
        for (int i = rightStart; i <= rightEnd; i++) {
            temp[index] = array[i];
            index++;
        }
        for (int i = left; i <= right; i++) {
            array[i] = temp[i];
        }
    }

    public static void main(String[] args){
        int[] arr = {9, 2, 6, 4, 3, 5, 1};
        mergesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
