package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;

    @BeforeEach
    void setUp() {
        diary = new Diary("Amirah", "password");
    }

    @Test
    void diaryExistsTest() {
        assertNotNull(diary);
    }

    @Test
    void testThatNewDiaryIsLocked() {
        assertTrue(diary.isLocked());
    }

    @Test
    void testThatDiaryCanBeUnlocked() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
    }

    @Test
    void testThatDiaryCannotBeUnlockedWithWrongPassword() {
        assertTrue(diary.isLocked());
        diary.unlockWith("amirahmacha");
        assertTrue(diary.isLocked());
    }

    @Test
    void testThatDiaryCanBeLockedAfterBeingUnlocked() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }

    @Test
    void testThatHappeningsCanBeAddedToTheDiary() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(1, diary.getNumberOfEntries());
    }

    @Test
    void testThatEntriesCannotBeAddedWhenDiaryIsLocked() {
        assertTrue(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(0, diary.getNumberOfEntries());
    }

    @Test
    void testThatEntriesCanBeFoundById() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(1, diary.getNumberOfEntries());

        Entry foundEntry = diary.findEntryWithId(1);
        assertEquals(1, foundEntry.getId());
        assertEquals("My Break-up With Simi", foundEntry.getTitle());
        assertEquals("I did not do anything to him, he just came back one day and...", foundEntry.getContent());
    }

    @Test
    void testThatDiaryCannotBeSearchedWhenDiaryIsLocked() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(1, diary.getNumberOfEntries());
        diary.lock();
        assertTrue(diary.isLocked());

        Entry foundEntry = diary.findEntryWithId(1);
        assertNull(foundEntry);
    }
}
