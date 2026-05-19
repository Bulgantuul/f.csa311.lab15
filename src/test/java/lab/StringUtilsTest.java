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
    @Test
    @DisplayName("isBlank - null утга")
    void isBlank_null() {
        assertTrue(StringUtils.isBlank(null));
    }
    
    @Test
    @DisplayName("isBlank - хоосон string")
    void isBlank_empty() {
        assertTrue(StringUtils.isBlank(""));
    }
    
    @Test
    @DisplayName("isBlank - зөвхөн зай")
    void isBlank_onlySpaces() {
        assertTrue(StringUtils.isBlank("   "));
    }
    
    @Test
    @DisplayName("isBlank - хоосон биш текст")
    void isBlank_notBlank() {
        assertFalse(StringUtils.isBlank("hello"));
        assertFalse(StringUtils.isBlank(" hello "));
    }
    
    // ========== capitalize() тестүүд ==========
    
    @Test
    @DisplayName("capitalize - null утга")
    void capitalize_null() {
        assertNull(StringUtils.capitalize(null));
    }
    
    @Test
    @DisplayName("capitalize - хоосон string")
    void capitalize_empty() {
        assertEquals("", StringUtils.capitalize(""));
    }
    
    @Test
    @DisplayName("capitalize - зөвхөн зай")
    void capitalize_onlySpaces() {
        assertEquals("   ", StringUtils.capitalize("   "));
    }
    
    @Test
    @DisplayName("capitalize - эхний үсгийг том болгох")
    void capitalize_normal() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
        assertEquals("World", StringUtils.capitalize("world"));
    }
    
    @Test
    @DisplayName("capitalize - аль хэдийн том үсэгтэй")
    void capitalize_alreadyCapitalized() {
        assertEquals("Hello", StringUtils.capitalize("Hello"));
    }
    
    @Test
    @DisplayName("capitalize - нэг тэмдэгт")
    void capitalize_singleChar() {
        assertEquals("A", StringUtils.capitalize("a"));
        assertEquals("Z", StringUtils.capitalize("Z"));
    }
}