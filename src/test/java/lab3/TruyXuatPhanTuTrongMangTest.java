package lab3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruyXuatPhanTuTrongMangTest {
    Lab3 lab3;
    @BeforeEach
    void setUp() {
        lab3 = new Lab3();
    }

    @AfterEach
    void tearDown() {
        lab3 = null;
    }


        // Test 1: Truy xuất phần tử đầu tiên trong mảng
        @Test
        void testGetElementAtIndexFirstElement() {
            int[] array = {1, 2, 3, 4, 5};
            int result = lab3.getElementAtIndex(array, 0);
            assertEquals(1, result);
        }

        // Test 2: Truy xuất phần tử cuối cùng trong mảng
        @Test
        void testGetElementAtIndexLastElement() {
            int[] array = {1, 2, 3, 4, 5};
            int result = lab3.getElementAtIndex(array, 4);
            assertEquals(5, result);
        }

        // Test 3: Truy xuất phần tử ngoài giới hạn (chỉ mục âm)
        @Test
        void testGetElementAtIndexNegativeIndex() {
            int[] array = {1, 2, 3, 4, 5};
            IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
                lab3.getElementAtIndex(array, -1);
            });
            assertEquals("Index nằm ngoại phạm vi của mảng", exception.getMessage());
        }

        // Test 4: Truy xuất phần tử ngoài giới hạn (chỉ mục lớn hơn mảng)
        @Test
        void testGetElementAtIndexOutOfBounds() {
            int[] array = {1, 2, 3, 4, 5};
            IndexOutOfBoundsException exception = assertThrows(IndexOutOfBoundsException.class, () -> {
                lab3.getElementAtIndex(array, 10);
            });
            assertEquals("Index nằm ngoại phạm vi của mảng", exception.getMessage());
        }

        // Test 5: Truy xuất phần tử trong mảng chỉ có một phần tử
        @Test
        void testGetElementAtIndexSingleElement() {
            int[] array = {42};
            int result = lab3.getElementAtIndex(array, 0);
            assertEquals(42, result);
        }
    }
