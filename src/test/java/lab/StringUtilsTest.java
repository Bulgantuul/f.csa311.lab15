package lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    @DisplayName("reverse - хоосон string")
    void reverse_emptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    @DisplayName("reverse - нэг тэмдэгт")
    void reverse_singleCharacter() {
        assertEquals("a", StringUtils.reverse("a"));
    }

    @Test
    @DisplayName("reverse - ASCII текст")
    void reverse_asciiString() {
        assertEquals("cba", StringUtils.reverse("abc"));
        assertEquals("olleH", StringUtils.reverse("Hello"));
    }

    @Test
    @DisplayName("reverse - юникод тэмдэгтүүд")
    void reverse_unicodeString() {
        assertEquals("баярлалаа", StringUtils.reverse("аалалряаб"));
        assertEquals("лоӨ", StringUtils.reverse("Өол"));
    }

    @Test
    @DisplayName("reverse - null утга")
    void reverse_nullInput() {
        assertNull(StringUtils.reverse(null));
    }

    @Test
    @DisplayName("reverse - palindrome string")
    void reverse_palindrome() {
        String palindrome = "radar";
        assertEquals(palindrome, StringUtils.reverse(palindrome));
    }
}