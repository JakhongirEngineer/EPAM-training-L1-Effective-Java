package implementations;

public class Sorting {

    public void insertionSort(int[] numbers){

        for (int i = 1; i < numbers.length; i++){
            int key = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > key){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j +1] = key;
        }

    }

    public void mergeSort(int[] numbers){
        mergeSortHelper(numbers, 0, numbers.length-1);
    }

    private void mergeSortHelper(int[] numbers, int left, int right) {
        if (left < right){
            int middle = left + (right - left) / 2;
            mergeSortHelper(numbers, left, middle);
            mergeSortHelper(numbers, middle + 1, right);
            merge(numbers, left, middle, right);
        }
    }

    private void merge(int[] numbers, int left, int middle, int right) {
        int leftArraySize = middle - left + 1;
        int rightArraySize = right - middle;

        int[] leftArray = new int[leftArraySize];
        int[] rightArray = new int[rightArraySize];

        for (int i = 0; i < leftArraySize; i++){
            leftArray[i] = numbers[left + i];
        }
        for (int j = 0; j < rightArraySize; j++) {
            rightArray[j] = numbers[middle + 1 + j];
        }
        int leftPointer = 0;
        int rightPointer = 0;
        int index = left;
        while (leftPointer < leftArraySize && rightPointer < rightArraySize){
            if (leftArray[leftPointer] < rightArray[rightPointer]){
                numbers[index++] = leftArray[leftPointer++];
            } else {
                numbers[index++] = rightArray[rightPointer++];
            }
        }

        while (leftPointer < leftArraySize){
            numbers[index++] = leftArray[leftPointer++];
        }
        while (rightPointer < rightArraySize){
            numbers[index++] = rightArray[rightPointer++];
        }

    }

}
