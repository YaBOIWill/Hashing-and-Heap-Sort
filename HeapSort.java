import java.util.Arrays;

//heap sort public class
public class HeapSort {
    public void sort(int arr[]) {
        int size = arr.length;
        
        //building the heap
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(arr, size, i);
        }
        //extract the max element from heap replace it with last element
        for (int i = size - 1; i >= 0; i--) {
            int x = arr[0];
            arr[0] = arr[i];
            arr[i] = x;
            heapify(arr, i, 0);
        }
    }
    //heap method
    public void heapify(int arr[], int heapSize, int i) {
        //initialize variable for root and children
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        
        //if the left child is larger than the root
        if (leftChild < heapSize && arr[leftChild] > arr[largest]) {
            largest = leftChild;
        }
        //if the right child is larger than the root
        if (rightChild < heapSize && arr[rightChild] > arr[largest]) {
            largest = rightChild;
        }
        //if the largest is not the root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            
            //heap the subtree 
            heapify(arr, heapSize, largest);
        }
    }
    //main method
    public static void main(String[] args) {
        int arr[] = {6, 12, 34, 29, 28, 11, 23, 7, 0, 33, 30, 45};
        //prints out the old array before the sort
        System.out.println("The original array was: " + Arrays.toString(arr));
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);
        //prints out the newly sorted array
        System.out.println("The newly sorted array is: " + Arrays.toString(arr));
    }
}
