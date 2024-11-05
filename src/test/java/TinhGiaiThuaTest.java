import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhGiaiThuaTest {
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
    void tinhGiaiThua() {
        // Trường hợp biên
        // Giả sử giới hạn N từ 1 -> 13
        assertEquals(1, lab2.tinhGiaiThua(0));
        assertEquals(1, lab2.tinhGiaiThua(1));
        assertEquals(2, lab2.tinhGiaiThua(2));

        assertEquals(479001600, lab2.tinhGiaiThua(12));
        assertEquals(6227020800L, lab2.tinhGiaiThua(13));
        assertEquals(-1, lab2.tinhGiaiThua(14));

        // Phân vùng tương đương
        assertEquals(-1, lab2.tinhGiaiThua(-15));
        assertEquals(3628800, lab2.tinhGiaiThua(10));
        assertEquals(-1, lab2.tinhGiaiThua(20));

        assertEquals(5040, lab2.tinhGiaiThua(7));

    }
}