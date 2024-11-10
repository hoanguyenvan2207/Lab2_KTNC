package lab3;

import org.junit.jupiter.api.AfterEach;;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GetNameTest {
    Profile profile;

    @BeforeEach
    void setUp() {
        profile = new Profile("Hoa", 22, true);
    }

    @AfterEach
    void tearDown() {
        profile = null;
    }

    @Test
    void testGetNameVoiTenHopLe() {
        assertEquals("Hoa", profile.GetName());
    }

    @Test
    void testGetNameWithNameEmpty() {
        profile = new Profile("", 10, true);
        assertEquals("", profile.GetName());
    }

    @Test
    void testGetNameWithNameNull() {
        profile = new Profile(null, 10, true);
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, () -> profile.GetName());
        Assertions.assertEquals("Tên người dùng chưa được cấu hình", exception.getMessage());
    }

    @Test
    void testGetNameVoiProfileNull() {
        profile = null;
        NullPointerException exception = Assertions.assertThrows(NullPointerException.class, () -> {
            if (profile == null) {
                throw new NullPointerException("Không thể gọi phương thức trên đối tượng null.");
            }
            profile.GetName();
        });

        // Kiểm tra thông điệp lỗi của ngoại lệ
        Assertions.assertEquals("Không thể gọi phương thức trên đối tượng null.", exception.getMessage());
    }

    // Test với đối tượng hồ sơ có tên là chuỗi dài
    @Test
    void testGetNameWithLongName() {
        String longName = "A".repeat(1000);  // Chuỗi dài 1000 ký tự
        profile = new Profile(longName, 19, false);
        String result = profile.GetName();
        assertEquals(longName, result);  // Kiểm tra tên dài có được trả về đúng hay không
    }
}
