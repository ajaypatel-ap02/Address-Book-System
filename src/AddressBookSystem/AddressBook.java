package AddressBookSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner scanner = new Scanner(System.in);

    ArrayList<Contacts> contactList = new ArrayList<>();
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
                    System.out.println("Invalid input \n");
                    return;
            }

        }while(true);

    }
    public void addContacts(){

        Contacts contacts = new Contacts();

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

        contactList.add(contacts);
    }
    public Contacts checkContact (){
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
    public void editContacts(){

           Contacts contacts = checkContact();
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

    public void deleteContacts (){

        Contacts contacts = checkContact();
        if(contacts != null) {
            System.out.println("Contact found ");
            contactList.remove(contacts);
            System.out.println("The contact is deleted ");
        }else{
            System.out.println("Contact not Found");
        }
    }

    public void displayContacts() {
        if (!contactList.isEmpty()) {
            for (Contacts contacts : contactList) {

                System.out.println("\nFirst Name:" + contacts.getFirstName());

                System.out.println("Last Name:" + contacts.getLastName());

                System.out.println("Address:" + contacts.getAddress());

                System.out.println("City:" + contacts.getCity());

                System.out.println("State:" + contacts.getState());

                System.out.println("Zip Code:" + contacts.getZip());

                System.out.println("Phone Number:" + contacts.getPhoneNumber());

                System.out.println("Email:" + contacts.getEmail());

            }
        } else {
            System.out.println("No contacts found");
        }
    }
}