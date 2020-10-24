import java.util.Arrays;

public class SelectionSort {

    public void selectionsort(int[] array){
        for (int i=0; i < array.length - 1; i++) {
            int min = 987654321;
            int minIdx = 0;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < min){
                    min = array[j];
                    minIdx = j;
                }
            }
            if (array[i] > min){
                int temp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args){
        SelectionSort mysort = new SelectionSort();
        int[] array = { 9, 2, 6, 4, 3, 5, 1 };
        mysort.selectionsort(array);
        System.out.println(Arrays.toString(array));
    }
    
}
