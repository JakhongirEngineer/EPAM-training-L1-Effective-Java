package implementations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    @Test
    void testMergeSort(){
        int[] numbers = {45,23,76,1};
        Sorting sorting = new Sorting();
        sorting.mergeSort(numbers);

        assertAll( "array is sorted",
                () -> assertEquals(1, numbers[0] ),
                () -> assertEquals(23, numbers[1]),
                () -> assertEquals(45, numbers[2]),
                () -> assertEquals(76, numbers[3])
        );
    }

}