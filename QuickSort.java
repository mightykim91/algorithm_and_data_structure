import java.util.Arrays;

class QuickSort {
    
    public static void quicksort(int[] array, int left, int right){
        if (left >= right){
            return;
        }
        int pivot = array[(left + right)/2];
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index-1);
        quicksort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivot){
        while(left <= right){
            while(array[left] < pivot){
                left++;
            }
            while(array[right] > pivot){
                right--;
            }
            if (left <= right){
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }

    public static void main(String[] args){
        int[] array = {9,2,6,4,3,5,1};
        quicksort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}