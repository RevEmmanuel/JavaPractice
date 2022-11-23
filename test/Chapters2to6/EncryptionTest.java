package Chapters2to6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest {

    @Test
    void encryptNumber() {
        assertEquals("0918", Encrypting.encryptNumber(4132));
        assertEquals("9078", Encrypting.encryptNumber(Integer.parseInt("0123")));
        assertEquals("7682", Encrypting.encryptNumber(1509));
    }

    @Test
    void decryptNumber() {
        assertEquals("4132", Encrypting.decryptNumber(Integer.parseInt("0918")));
        assertEquals("0123", Encrypting.decryptNumber(9078));
        assertEquals("1509", Encrypting.decryptNumber(7682));
    }
}
