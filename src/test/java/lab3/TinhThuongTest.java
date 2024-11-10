package lab3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TinhThuongTest {
    Lab3 lab3;
    @BeforeEach
    void setUp() {
        lab3 = new Lab3();
    }

    @AfterEach
    void tearDown() {
        lab3 = null;
    }

    @Test
    void testTinhThuongVoiSoABangAm101SoBHopLe() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> lab3.tinhThuong(-101, 10));
        assertEquals("Giá trị phải nằm trong khoảng từ -100 đến 100", exception.getMessage());
    }

    @Test
    void testTinhThuongVoiSoABangAm100SoBHopLe(){
        assertEquals(-10, lab3.tinhThuong(-100, 10));
    }

    @Test
    void testTinhThuongVoiSoABangAm99SoBHopLe() {
        assertEquals(-9.9, lab3.tinhThuong(-99, 10));
    }

    @Test
    void testTinhThuongVoiSoABang99SoBHopLe(){
        assertEquals(8.25, lab3.tinhThuong(99, 12));
    }

    @Test
    void testTinhThuongVoiSoABang100SoBHopLe() {
        assertEquals(2.9411764705882355, lab3.tinhThuong(100, 34));
    }
    @Test
    void testTinhThuongVoiSoABang101SoBHopLe() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> lab3.tinhThuong(101, 10));
        assertEquals("Giá trị phải nằm trong khoảng từ -100 đến 100", exception.getMessage());
    }

    @Test
    void testTinhThuongVoiSoABangAm200SoBHopLe() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> lab3.tinhThuong(-200, 10));
        assertEquals("Giá trị phải nằm trong khoảng từ -100 đến 100", exception.getMessage());
    }

    @Test
    void testTinhThuongVoiSoAHopLeSoBHopLe() {
        assertEquals(10, lab3.tinhThuong(30, 3));
    }

    @Test
    void testTinhThuongVoiSoABang340SoBHopLe() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> lab3.tinhThuong(340, 10));
        assertEquals("Giá trị phải nằm trong khoảng từ -100 đến 100", exception.getMessage());
    }

}