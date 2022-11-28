package ChibuzorAssignment.contactInfo;

import Chapter9.Hotel.Address;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookTest {

    private Phonebook phoneBook;
    private Contact adeola;
    private Contact raheem;

    @BeforeEach
    void setUp() {
        phoneBook = new Phonebook();
        adeola = new Contact("Adeola", "08103078881", "deolaaxo@gmail.com",
                new Address("15", "Arije Layout", "Ibadan", "Oyo state", "Nigeria"));

        raheem = new Contact("Raheem", "08123456789", "adrahmzy@gmail.com",
                new Address("10", "Emily Akinola Street", "Yaba", "Lagos", "Nigeria"));
    }

    @Test
    void phoneBookExistsTest(){
        assertNotNull(phoneBook);
    }

    @Test
    void testThatItTakesNewContact() {
        phoneBook.add(adeola);
        assertNotNull(phoneBook.getContactList());
    }

    @Test
    void canAddNewContact() {
        phoneBook.add(adeola);
        assertEquals(adeola, phoneBook.getContactList().get(0));
    }

    @Test
    void canAddTwoNewContacts() {
        phoneBook.add(adeola);
        phoneBook.add(raheem);

        assertEquals(adeola, phoneBook.getContactList().get(0));
        assertEquals(raheem, phoneBook.getContactList().get(1));
    }

    @Test
    void testThatContactGetsNewId() {
        phoneBook.add(adeola);
        assertEquals(1, adeola.getId());
    }

    @Test
    void canGetContactByIdTest(){
        phoneBook.add(adeola);
        phoneBook.add(raheem);

        assertEquals(adeola, phoneBook.getContact(1));
        assertEquals(raheem, phoneBook.getContact(2));
    }

    @Test
    void testThatItThrowsExceptionWhenGivenInvalidContactId() {
        try {
            phoneBook.getContact(4);
        }
        catch (ContactDoesNotExistException c) {
            System.out.println("Yes, exception is thrown when contact is invalid.");
        }
    }

    @Test
    void canUpdateContactNameById(){
        phoneBook.add(adeola);

        phoneBook.updateContactName(1, "Adeolaa");
        assertEquals("Adeolaa", phoneBook.getContact(1).getName());
    }

    @Test
    void cannotUpdateContactNameWhenIdIsInvalid() {
        try {
            phoneBook.updateContactName(3, "Invalid");
        }
        catch (ContactDoesNotExistException c) {
            System.out.println("Yes, name is not updated when contactId is invalid.");
        }
    }

    @Test
    void canUpdateContactPhoneById(){
        phoneBook.add(adeola);
        phoneBook.add(raheem);

        phoneBook.updateContactPhone(2, "08199934445");
        assertEquals("08199934445", phoneBook.getContact(2).getPhoneNumber());
    }

    @Test
    void cannotUpdateContactPhoneWhenIdIsInvalid() {
        try {
            phoneBook.updateContactPhone(2, "08199934445");
        }
        catch (ContactDoesNotExistException c) {
            System.out.println("Yes, phoneNumber is not updated when contactId is invalid.");
        }
    }

    @Test
    void canUpdateContactEmailById(){
        phoneBook.add(adeola);
        phoneBook.add(raheem);

        phoneBook.updateContactEmail(1, "deolaaxo1@gmail.com");
        assertEquals("deolaaxo1@gmail.com", phoneBook.getContact(1).getEmailAddress());
    }

    @Test
    void cannotUpdateContactEmailWhenIdIsInvalid() {
        try {
            phoneBook.updateContactEmail(1, "deolaaxo1@gmail.com");
        }
        catch (ContactDoesNotExistException c) {
            System.out.println("Yes, email address is not updated when contactId is invalid.");
        }
    }

    @Test
    void canUpdateContactAddressById(){
        phoneBook.add(adeola);
        Address address = new
                Address("10", "Emily Akinola Street", "Yaba", "Lagos", "Nigeria");

        phoneBook.updateContactAddress(1, address);
        assertEquals(address, phoneBook.getContact(1).getAddress());
    }

    @Test
    void cannotUpdateContactAddressWhenIdIsInvalid() {
        try {
            Address address = new
                    Address("10", "Emily Akinola Street", "Yaba", "Lagos", "Nigeria");

            phoneBook.updateContactAddress(1, address);
        }
        catch (ContactDoesNotExistException c) {
            System.out.println("Yes, address is not updated when contactId is invalid.");
        }
    }

    @Test
    void canDeleteContactTest(){
        phoneBook.add(adeola);
        phoneBook.add(raheem);

        assertEquals(2, phoneBook.getContactList().toArray().length);

        int idToDelete = 2;
        phoneBook.deleteContact(idToDelete);
        try {
            phoneBook.getContact(idToDelete);
        }
        catch (ContactDoesNotExistException c) {
            System.out.println("Cannot delete non-existent contact.");
        }

        assertEquals(1, phoneBook.getContactList().toArray().length);
    }

}