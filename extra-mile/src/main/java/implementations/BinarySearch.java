package implementations;

public class BinarySearch {

    public boolean binarySearchIterative(int[] numbers, int number){
        int left = 0;
        int right = numbers.length - 1;

        while (left < right){
            int middle = left + (right - left)/2;
            if (numbers[middle] == number){
                return true;
            } else if (numbers[middle] > number){
                right = middle -1;
            } else {
                left = middle + 1;
            }
        }
        return false;
    }

    public boolean binarySearchRecursive(int[] numbers, int number){
        return binarySearchRecursiveHelper(numbers, number, 0, numbers.length-1);
    }

    private boolean binarySearchRecursiveHelper(int[] numbers, int number, int left, int right) {
        if (left > right){
            return false;
        }
        int middle = left + (right - left) / 2;
        if (numbers[middle] == number){
            return true;
        } else if (numbers[middle] > number){
            return binarySearchRecursiveHelper(numbers, number, left, middle-1);
        } else {
            return binarySearchRecursiveHelper(numbers, number, middle+1, right);
        }
    }

}
