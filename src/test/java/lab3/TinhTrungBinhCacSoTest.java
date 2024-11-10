package lab3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TinhTrungBinhCacSoTest {
    Lab3 lab3;
    @BeforeEach
    void setUp() {
        lab3 = new Lab3();
    }

    @AfterEach
    void tearDown() {
        lab3 = null;
    }

    // 1. Test với danh sách chứa một số duy nhất
    @Test
    void testTinhTrungBinhWithSingleNumber() {
        double result = lab3.tinhTrungBinh(Arrays.asList(10));
        assertEquals(10.0, result);
    }

    // 2. Test với danh sách chứa các số dương
    @Test
    void testTinhTrungBinhWithPositiveNumbers() {
        double result = lab3.tinhTrungBinh(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(3.0, result);
    }

    // 3. Test với danh sách chứa các số âm
    @Test
    void testTinhTrungBinhWithNegativeNumbers() {
        double result = lab3.tinhTrungBinh(Arrays.asList(-1, -2, -3, -4, -5));
        assertEquals(-3.0, result);
    }

    // 4. Test với danh sách trống
    @Test
    void testTinhTrungBinhWithEmptyList() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> lab3.tinhTrungBinh(Collections.emptyList()));
        assertEquals("Không thể tính trung bình của danh sách trống.", exception.getMessage());
    }

    // 5. Test với danh sách chứa số 0
    @Test
    void testTinhTrungBinhWithZero() {
        double result = lab3.tinhTrungBinh(Arrays.asList(0, 0, 0, 0));
        assertEquals(0.0, result);
    }
}