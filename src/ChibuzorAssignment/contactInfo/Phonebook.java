package ChibuzorAssignment.contactInfo;

import Chapter9.Hotel.Address;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private final ArrayList<Contact> contactList = new ArrayList<>();
    private int idCounter = 1;

    public Phonebook() {}

    public Contact getContact(int contactId) {
        return findContact(contactId);
    }

    public void add(Contact contact) {
        contactList.add(contact);
        contact.setId(idCounter++);
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void deleteContact(int contactId) {
        for (int i = 0; i < contactList.toArray().length; i++) {
            if (contactList.get(i).getId() == contactId) {
                contactList.remove(i);
                break;
            }
        }
    }

    public void updateContactName(int contactId, String name) {
        findContact(contactId).setName(name);
    }

    public void updateContactEmail(int contactId, String email) {
        findContact(contactId).setEmailAddress(email);
    }

    public void updateContactPhone(int contactId, String phone) {
        findContact(contactId).setPhoneNumber(phone);
    }

    public void updateContactAddress(int contactId, Address address) {
        findContact(contactId).setAddress(address);
    }

    private Contact findContact(int contactId) {
        Contact contact = null;
        for (int i = 0; i < contactList.toArray().length; i++) {
            if (contactList.get(i).getId() == contactId) {
                contact = contactList.get(i);
            }
        }
        if (contact == null) throw new ContactDoesNotExistException();
        return contact;
    }

    public void delete(int idToDelete) {
        contactList.remove(findContact(idToDelete));
    }
}
