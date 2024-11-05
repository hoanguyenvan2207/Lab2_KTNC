import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTu1DenNTest {
    Lab2 lab2;
    @BeforeEach
    void setUp() {
        lab2 = new Lab2();
    }

    @AfterEach
    void tearDown() {
        lab2 = null;
    }

    @Test
    void tinhTongTu1DenN() {
        // Phân vùng biên
        // Giả sử giới hạn N từ 1 -> 100
        assertEquals(-1, lab2.tinhTongTu1DenN(0));
        assertEquals(1, lab2.tinhTongTu1DenN(1));
        assertEquals(3, lab2.tinhTongTu1DenN(2));

        assertEquals(4950, lab2.tinhTongTu1DenN(99));
        assertEquals(5050 , lab2.tinhTongTu1DenN(100));
        assertEquals(-1 , lab2.tinhTongTu1DenN(101));

        // Phân vùng tương đương
        assertEquals(-1, lab2.tinhTongTu1DenN(-10));
        assertEquals(55, lab2.tinhTongTu1DenN(10));
        assertEquals(-1, lab2.tinhTongTu1DenN(110));

        assertEquals(1275 , lab2.tinhTongTu1DenN(50));
    }
}