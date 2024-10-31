import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {
    TinhTong tinhTong = new TinhTong();

    @Test
    void testTinhTongTu1DenN() {
        // Trường hợp biên
        assertEquals(0, tinhTong.tinhTongTu1DenN(0));  // Biên dưới
        assertEquals(1, tinhTong.tinhTongTu1DenN(1));  // Biên trên
        assertEquals(3, tinhTong.tinhTongTu1DenN(2));
        assertEquals(5050, tinhTong.tinhTongTu1DenN(100));  // Biên lớn hơn

        // Phân vùng tương đương
        assertEquals(0, tinhTong.tinhTongTu1DenN(-10));  // Giá trị âm
        assertEquals(55, tinhTong.tinhTongTu1DenN(10));  // Giá trị dương nhỏ
        assertEquals(0, tinhTong.tinhTongTu1DenN(-5));   // N < 0

        // Các giá trị lớn
        assertEquals(500500, tinhTong.tinhTongTu1DenN(1000));  // N = 1000
        assertEquals(50005000, tinhTong.tinhTongTu1DenN(10000));  // N = 10000

        // Giá trị lớn
        assertEquals(Integer.MAX_VALUE, tinhTong.tinhTongTu1DenN(Integer.MAX_VALUE));
    }

    @Test
    void testTinhTongSoLeTu1DenN() {
        // Trường hợp biên
        assertEquals(0, tinhTong.TinhTongSoLeTu1DenN(0));  // Biên dưới
        assertEquals(1, tinhTong.TinhTongSoLeTu1DenN(1));  // Biên trên
        assertEquals(4, tinhTong.TinhTongSoLeTu1DenN(3));  // Số lẻ

        // Phân vùng tương đương
        assertEquals(25, tinhTong.TinhTongSoLeTu1DenN(10));  // Giá trị chẵn
        assertEquals(1, tinhTong.TinhTongSoLeTu1DenN(2));  // Giá trị nhỏ, số chẵn
        assertEquals(249001, tinhTong.TinhTongSoLeTu1DenN(1000));  // Giá trị lớn

        // Kiểm tra giá trị âm
        assertEquals(0, tinhTong.TinhTongSoLeTu1DenN(-1));  // Giá trị âm
        assertEquals(1666665000, tinhTong.TinhTongSoLeTu1DenN(100000));  // Giá trị rất lớn

        // Kiểm tra đoán lỗi
        assertEquals(1, tinhTong.TinhTongSoLeTu1DenN(1));  // Giá trị tối thiểu
        assertEquals(250000, tinhTong.TinhTongSoLeTu1DenN(10000));  // Giá trị chẵn lớn
    }

    @Test
    void testTinhGiaiThua() {
        // Trường hợp biên
        assertEquals(1, tinhTong.tinhGiaiThua(0));  // Biên dưới
        assertEquals(1, tinhTong.tinhGiaiThua(1));  // Biên trên
        assertEquals(2, tinhTong.tinhGiaiThua(2));
        assertEquals(6, tinhTong.tinhGiaiThua(3));

        // Phân vùng tương đương
        assertEquals(-1, tinhTong.tinhGiaiThua(-1));  // Giá trị âm
        assertEquals(24, tinhTong.tinhGiaiThua(4));   // Giá trị nhỏ
        assertEquals(120, tinhTong.tinhGiaiThua(5));  // Giá trị trung bình
        assertEquals(3628800, tinhTong.tinhGiaiThua(10));  // Giá trị lớn

        // Giá trị lớn hơn
        assertEquals(479001600, tinhTong.tinhGiaiThua(12));  // N = 12
        assertEquals(6227020800L, tinhTong.tinhGiaiThua(13)); // N = 13 (Long.MAX_SAFE)
    }
}
