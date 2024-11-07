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
    void testTinhTongTu1DenNTaiBienDuoiBang0() {
        assertEquals(0, lab2.tinhTongTu1DenN(0));
    }

    @Test
    void testTinhTongTu1DenNTaiBienBang1() {
        assertEquals(1, lab2.tinhTongTu1DenN(1));
    }
    @Test
    void testTinhTongTu1DenNTaiBienTreniBang2() {
        assertEquals(3, lab2.tinhTongTu1DenN(2));
    }

    @Test
    void testTinhTongTu1DenNTaiBienDuoiBang99() {
        assertEquals(4950, lab2.tinhTongTu1DenN(99));
    }

    @Test
    void testTinhTongTu1DenNTaiBienBang100() {
        assertEquals(5050 , lab2.tinhTongTu1DenN(100));
    }
    @Test
    void testTinhTongTu1DenNTaiBienTreniBang101() {
        assertEquals(-1, lab2.tinhTongTu1DenN(101));
    }

    @Test
    void testTinhTongTu1DenNVoiNBangAm10() {
        assertEquals(-1, lab2.tinhTongTu1DenN(-10));
    }
    @Test
    void testTinhTongTu1NVoiNBang10() {
        assertEquals(55, lab2.tinhTongTu1DenN(10));
    }
    @Test
    void testTinhTongTu1DenNVoiNLBang110() {
        assertEquals(-1, lab2.tinhTongTu1DenN(110));
    }
    @Test
    void testTinhTongTu1NVoiNBang50() {
        assertEquals(1275 , lab2.tinhTongTu1DenN(50));
    }
}