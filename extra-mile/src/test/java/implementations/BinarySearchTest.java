package implementations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch binarySearch;

    @BeforeEach
    void initEach(){
        binarySearch = new BinarySearch();
    }

    @Test
    @DisplayName("binary search iterative not found")
    void testBinarySearchIterativeNotFound() {
        int[] numbers = {1,2,10,45,222,777};
        int number = 50;
        boolean result = binarySearch.binarySearchIterative(numbers,number);
        assertFalse(result);
    }


    @Test
    @DisplayName("binary search iterative found")
    void testBinarySearchIterativeFound() {
        int[] numbers = {-10,-5,10,20,22,24,33,35,55,66,67,77,78,79,90};
        int number = 79;
        boolean result = binarySearch.binarySearchIterative(numbers,number);
        assertTrue(result);
    }

    @Test
    @DisplayName("binary search iterative not found")
    void testBinarySearchRecursiveNotFound() {
        int[] numbers = {1,2,10,45,222,777};
        int number = 50;
        boolean result = binarySearch.binarySearchRecursive(numbers,number);
        assertFalse(result);
    }


    @Test
    @DisplayName("binary search iterative found")
    void testBinarySearchRecursiveFound() {
        int[] numbers = {-10,-5,10,20,22,24,33,35,55,66,67,77,78,79,90};
        int number = 79;
        boolean result = binarySearch.binarySearchRecursive(numbers,number);
        assertTrue(result);
    }


}