package lab3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
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
    void testTinhTongVoiSoABangAm10001SoBHopLe() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> lab3.tinhTong("-10001", "10"));
        Assertions.assertEquals("Gia tri cua a va b khong nho hon -10000 va khong lon hon 10000", exception.getMessage());
    }

    @Test
    void testTinhTongVoiSoATaiBienVaSoBHopLe() {
        assertEquals(-9000, lab3.tinhTong("-10000","1000"));
    }

    @Test
    void testTinhTongVoiSoABangAm999SoBHopLe() {
        assertEquals(1, lab3.tinhTong("-9999","10000"));
    }

    @Test
    void testTinhTongVoiSoAHopLeSoBBangAm10001() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> lab3.tinhTong("8000", "-10001"));
        Assertions.assertEquals("Gia tri cua a va b khong nho hon -10000 va khong lon hon 10000", exception.getMessage());
    }

    @Test
    void testTinhTongVoiSoAHopLeSoBBangAm10000() {
        assertEquals(0, lab3.tinhTong("10000","-10000"));
    }

    @Test
    void testTinhTongVoiSoAHopLeSoBBangAm9999() {
        assertEquals(1, lab3.tinhTong("10000","-9999"));
    }


    @Test
    void testTinhTongVoiSoABangAm12000SoBHopLe() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> lab3.tinhTong("-12000", "9000"));
        Assertions.assertEquals("Gia tri cua a va b khong nho hon -10000 va khong lon hon 10000", exception.getMessage());
    }

    @Test
    void testTinhTongVoiSoAHopLeVaSoBHopLe() {
        assertEquals(1000, lab3.tinhTong("0","1000"));
    }

    @Test
    void testTinhTongVoiSoABang15000SoBHopLe() {
        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class, () -> lab3.tinhTong("15000", "1000"));
        Assertions.assertEquals("Gia tri cua a va b khong nho hon -10000 va khong lon hon 10000", exception.getMessage());
    }

    @Test
    void testTinhTongVoiSoALaChuoiVaSoBHopLe() {
        NumberFormatException exception = Assertions.assertThrows(NumberFormatException.class, () -> lab3.tinhTong("Thay Tien", "1000"));
        Assertions.assertEquals("So phai la so nguyen", exception.getMessage());
    }
}