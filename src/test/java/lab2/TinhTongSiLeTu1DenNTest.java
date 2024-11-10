package lab2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongSiLeTu1DenNTest {
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
    void tinhTongSoLeTu1DenN() {
        // Trường hợp biên
        // Giả sử giới hạn N từ 1 -> 50
        Assertions.assertEquals(0, lab2.TinhTongSoLeTu1DenN(0));
        Assertions.assertEquals(1, lab2.TinhTongSoLeTu1DenN(1));
        Assertions.assertEquals(1, lab2.TinhTongSoLeTu1DenN(2));

        Assertions.assertEquals(625, lab2.TinhTongSoLeTu1DenN(49));
        Assertions.assertEquals(625, lab2.TinhTongSoLeTu1DenN(50));
        Assertions.assertEquals(-1, lab2.TinhTongSoLeTu1DenN(51));

        // Phân vùng tương đương
        Assertions.assertEquals(-1, lab2.TinhTongSoLeTu1DenN(-12));
        Assertions.assertEquals(169, lab2.TinhTongSoLeTu1DenN(25));
        Assertions.assertEquals(-1, lab2.TinhTongSoLeTu1DenN(72));

        Assertions.assertEquals(100, lab2.TinhTongSoLeTu1DenN(20));
    }
}