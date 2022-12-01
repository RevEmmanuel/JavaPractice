package ChibuzorAssignment.contactInfo;

import Chapter9.Hotel.Address;

public class Contact {

    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address address;
    private int id;

    public Contact(String name, String phoneNumber, String emailAddress, Address address) {
        validateEmailAddress(emailAddress);
        validatePhoneNumber(phoneNumber);
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        validateEmailAddress(emailAddress);
        this.emailAddress = emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", address=" + address +
                ", id=" + id +
                '}';
    }

    private void validatePhoneNumber(String phoneNumber) {
        validatePhoneNumberLength(phoneNumber);
        validatePhoneNumberDigits(phoneNumber);
    }

    private void validatePhoneNumberLength(String phoneNumber) {
        if(phoneNumber.length() != 11) throw new IllegalArgumentException("Phone number must contain 11 digits.");
    }

    private void validatePhoneNumberDigits(String phoneNumberDigits) {
        checkDigits(phoneNumberDigits);
    }

    private void checkDigits(String phoneNumberDigits) {
        for(int i = 0; i < phoneNumberDigits.length(); i++) {
            if (!isANumber(phoneNumberDigits.charAt(i))) throw new IllegalArgumentException();
        }
    }

    private boolean isANumber(char number) {
        char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for (char aNumber : numbers) {
            if (aNumber ==number) return true;
        }
        return false;
    }

    private void validateEmailAddress(String emailAddress) {
        validateEmailAddressContainsAtSign(emailAddress);
        validateEmailAddressContainsDotSign(emailAddress);
    }

    private void validateEmailAddressContainsAtSign(String emailAddress) {
        if (!emailAddress.contains("@")) throw new IllegalArgumentException("Enter a valid email address.");
    }

    private void validateEmailAddressContainsDotSign(String emailAddress) {
        if (!emailAddress.contains(".")) throw new IllegalArgumentException("Enter a valid email address.");
    }
}
