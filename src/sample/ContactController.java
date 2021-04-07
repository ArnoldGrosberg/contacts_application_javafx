package sample;// required package
// required imports

import javafx.fxml.FXML;
import sample.datamodel.Contact;
import javafx.scene.control.TextField;
// public class for Contact and it's methods, variables
public class ContactController {
    // private FXML variables
    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private TextField notesField;
    // method to edit contact
    public void editContact(Contact selectedContact) {
        firstNameField.setText(selectedContact.getFirstName());
        lastNameField.setText(selectedContact.getPhoneNumber());
        phoneNumberField.setText(selectedContact.getPhoneNumber());
        notesField.setText(selectedContact.getNotes());
    }
    // method to add contact
    public Contact getNewContact() {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String phoneNumber = phoneNumberField.getText();
        String notes = notesField.getText();

        Contact newContact = new Contact(firstName, lastName, phoneNumber, notes);
        return newContact;
    }
    // method to update contacts
    public void updateContact(Contact selectedContact) {
        selectedContact.setFirstName(firstNameField.getText());
        selectedContact.setLastName(lastNameField.getText());
        selectedContact.setPhoneNumber(phoneNumberField.getText());
        selectedContact.setNotes(notesField.getText());

    }
}
