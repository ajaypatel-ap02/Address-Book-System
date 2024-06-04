package AddressBookSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);

    List<Contacts> contactList = new ArrayList<>();
    /*
    * this function work for performing operations over contacts inside the address book
     */
    public void contactOperation(){
        int choice;
        do{
            System.out.println("--------Address Book----------");
            System.out.println("1. Create Contact\n2. Edit Contact\n3. Delete Contact\n4. Display Contacts\n5. Exit ");
            System.out.println("Enter operation number ");
            choice = scanner.nextInt();

            switch(choice){

                case 1:
                    addContacts();
                break;

                case 2:
                    editContacts();
                break;

                case 3:
                    deleteContacts();
                break;

                case 4:
                    displayContacts();
                break;

                default:
                    System.out.println("See you soon \n");
                    return;
            }

        }while(true);

    }
    /*
    * this function add a contact to the address book
     */
    public void addContacts(){

        Contacts contacts = new Contacts();

        System.out.println("Enter first name");
        contacts.setFirstName(Contacts.checkInput(scanner.next(),scanner));

        System.out.println("Enter last name ");
        contacts.setLastName(Contacts.checkInput(scanner.next(),scanner));

        System.out.println("Enter address ");
        scanner.nextLine();
        contacts.setAddress(Contacts.checkInput(scanner.next(),scanner));

        System.out.println("Enter city name ");
        contacts.setCity(Contacts.checkInput(scanner.next(),scanner));

        System.out.println("Enter state name ");
        contacts.setState(Contacts.checkInput(scanner.next(),scanner));

        System.out.println("Enter zip code ");
        contacts.setZip(scanner.next());

        System.out.println("Enter your phone number ");
        contacts.setPhoneNumber(scanner.next());

        System.out.println("Enter your email ");
        contacts.setEmail(scanner.next());

        contactList.add(contacts);
    }
    /*
    *this function finds a particular contact in the address book
     */
    public Contacts searchContact(){
        if(!contactList.isEmpty()){
            System.out.println("Enter first name to find ");
            String firstName = scanner.next();
            for (Contacts contacts : contactList) {
                boolean found = contacts.getFirstName().equalsIgnoreCase(firstName);
                if (found) {
                    return contacts;
                }

            }
        }
            return null;
    }
    /*
    * this function is made for edit the existing contact in the address book
     */
    public void editContacts(){

           Contacts contacts = searchContact();
            if(contacts != null){
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
                System.out.println("No Contact found with the first name ");
            }
       }

       /*
       *this function is made for remove a particular contact from a address book
        */
    public void deleteContacts (){

        Contacts contacts = searchContact();
        if(contacts != null) {
            System.out.println("Contact found ");
            contactList.remove(contacts);
            System.out.println("The contact is deleted ");
        }else{
            System.out.println("Contact not Found");
        }
    }
    /*
    *this function is used to display the contact list of an address book
     */
    public void displayContacts() {
        if (!contactList.isEmpty()) {
            for(Contacts contacts : contactList){
            System.out.println(contacts.toString());

            }
        } else {
            System.out.println("No contacts found");
        }
    }
}