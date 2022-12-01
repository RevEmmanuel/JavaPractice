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
    void testThatEntriesNumberCanBeGottenWhenDiaryIsUnlocked() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(1, diary.getNumberOfEntries());
    }

    @Test
    void testThatHappeningsCanBeAddedToTheDiary() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(1, diary.getNumberOfEntries());
    }

    @Test
    void testThatEntriesNumberCannotBeGottenWhenDiaryIsLocked() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(1, diary.getNumberOfEntries());
        diary.lock();

        assertTrue(diary.isLocked());
        assertEquals(0, diary.getNumberOfEntries());
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

    @Test
    void testThatEntryCanBeDeletedFromDiary() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(1, diary.getNumberOfEntries());
        diary.write("I love him", "He is the love of my life.");
        assertEquals(2, diary.getNumberOfEntries());

        diary.deleteEntry(1);
        try {
            assertEquals(1, diary.getNumberOfEntries());
        }
        catch (NullPointerException np) {
            System.out.println("Yes, no entry was found");
        }
    }

    @Test
    void testThatEntryCannotBeDeletedWhenDiaryIsLocked() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(1, diary.getNumberOfEntries());
        diary.write("I love him", "He is the love of my life.");
        assertEquals(2, diary.getNumberOfEntries());
        diary.lock();

        diary.deleteEntry(1);
        diary.unlockWith("password");
        assertEquals(2, diary.getNumberOfEntries());
    }

    @Test
    void testThatEntryTitleCanBeUpdated() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(1, diary.getNumberOfEntries());

        diary.updateEntryTitle(1, "Simi");
        assertEquals("Simi", diary.getTitleOfEntry(1));
    }

    @Test
    void testThatEntryContentCanBeUpdated() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(1, diary.getNumberOfEntries());

        diary.updateEntryContent(1, "This dude hates me");
        assertEquals("This dude hates me", diary.getContentOfEntry(1));
    }

    @Test
    void testThatEntryTitleCannotBeUpdatedWhenDiaryIsLocked() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(1, diary.getNumberOfEntries());
        diary.lock();

        diary.updateEntryTitle(1, "Simi");

        diary.unlockWith("password");
        assertNotEquals("Simi", diary.getTitleOfEntry(1));
        assertEquals("My Break-up With Simi", diary.getTitleOfEntry(1));
    }

    @Test
    void testThatEntryContentCannotBeUpdatedWhenDiaryIsLocked() {
        diary.unlockWith("password");
        assertFalse(diary.isLocked());

        diary.write("My Break-up With Simi", "I did not do anything to him, he just came back one day and...");
        assertEquals(1, diary.getNumberOfEntries());
        diary.lock();

        diary.updateEntryContent(1, "This dude hates me");

        diary.unlockWith("password");
        assertNotEquals("This dude hates me", diary.getContentOfEntry(1));
        assertEquals("My Break-up With Simi", diary.getTitleOfEntry(1));
    }
}
