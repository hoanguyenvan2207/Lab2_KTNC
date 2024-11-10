package lab2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
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
        // Giả sử giới hạn N từ 0 -> 13
        Assertions.assertEquals(-1, lab2.tinhGiaiThua(-1));
        Assertions.assertEquals(1, lab2.tinhGiaiThua(0));
        Assertions.assertEquals(1, lab2.tinhGiaiThua(1));

        Assertions.assertEquals(479001600, lab2.tinhGiaiThua(12));
        Assertions.assertEquals(6227020800L, lab2.tinhGiaiThua(13));
        Assertions.assertEquals(-1, lab2.tinhGiaiThua(14));

        // Phân vùng tương đương
        Assertions.assertEquals(-1, lab2.tinhGiaiThua(-15));
        Assertions.assertEquals(3628800, lab2.tinhGiaiThua(10));
        Assertions.assertEquals(-1, lab2.tinhGiaiThua(20));

        Assertions.assertEquals(5040, lab2.tinhGiaiThua(7));

    }

}