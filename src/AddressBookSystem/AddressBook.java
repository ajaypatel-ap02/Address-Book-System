package AddressBookSystem;

import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);
    Contacts contacts = new Contacts();
    public void addContacts(){

        System.out.println("Enter first name");
        contacts.setFirstName(scanner.next());

        System.out.println("Enter last name ");
        contacts.setLastName(scanner.next());

        System.out.println("Enter address ");
        scanner.nextLine();
        contacts.setAddress(scanner.nextLine());

        System.out.println("Enter city name ");
        contacts.setCity(scanner.next());

        System.out.println("Enter state name ");
        contacts.setState(scanner.next());

        System.out.println("Enter zip code ");
        contacts.setZip(scanner.next());

        System.out.println("Enter your phone number ");
        contacts.setPhoneNumber(scanner.next());

        System.out.println("Enter your email ");
        contacts.setEmail(scanner.next());

    }
    public void editContacts(){
        System.out.println("Enter name to edit contact ");
        String firstName = scanner.next();

        if(firstName.equalsIgnoreCase(contacts.getFirstName())) {

            System.out.println("Contact found. ");

            System.out.println("Enter first name");
            contacts.setFirstName(scanner.next());

            System.out.println("Enter last name ");
            contacts.setLastName(scanner.next());

            System.out.println("Enter address ");
            scanner.nextLine();
            contacts.setAddress(scanner.nextLine());

            System.out.println("Enter city name ");
            contacts.setCity(scanner.next());

            System.out.println("Enter state name ");
            contacts.setState(scanner.next());

            System.out.println("Enter zip code ");
            contacts.setZip(scanner.next());

            System.out.println("Enter your phone number ");
            contacts.setPhoneNumber(scanner.next());

            System.out.println("Enter your email ");
            contacts.setEmail(scanner.next());
        }else{
            System.out.println("Contact not found. ");
        }
    }
    public void deleteContacts (){
        System.out.println("Enter first name to delete the contact ");
        String firstName = scanner.next();

        if(firstName.equalsIgnoreCase(contacts.getFirstName())) {
            System.out.println("Contact found ");
            contacts = null;
            System.out.println("The contact is deleted ");
        }else{
            System.out.println("Contact does not found");
        }
    }
    public void displayContacts(){

        System.out.println("\nFirst Name:"+contacts.getFirstName());

        System.out.println("Last Name:"+contacts.getLastName());

        System.out.println("Address:"+contacts.getAddress());

        System.out.println("City:"+contacts.getCity());

        System.out.println("State:"+contacts.getState());

        System.out.println("Zip Code:"+contacts.getZip());

        System.out.println("Phone Number:"+contacts.getPhoneNumber());

        System.out.println("Email:"+contacts.getEmail());

    }
     
    public static void main(String[] args) {

        System.out.println("Welcome to Address book System");

        AddressBook addressBook = new AddressBook();

        addressBook.addContacts();
        addressBook.displayContacts();

        addressBook.editContacts();
        addressBook.displayContacts();
        addressBook.deleteContacts();
//        addressBook.displayContacts();//causing a NullPointerException
    }

}
