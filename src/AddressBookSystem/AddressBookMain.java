package AddressBookSystem;

import java.util.*;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    Map<String, AddressBook> dictionary = new HashMap<>();
   
    public void createAddressBook(){
        System.out.println("Enter a name for addressBook ");
        String addressBookName = scanner.next();
        dictionary.put(addressBookName,new AddressBook());
    }

    public void selectAddressBook(){
        System.out.println("Available Address Books Name");
        System.out.println(dictionary.keySet());

        System.out.println("Enter addressBook name to select ");
        String addressBookName = scanner.next();

        if(dictionary.containsKey(addressBookName)){

            AddressBook addressBook = dictionary.get(addressBookName);

            addressBook.contactOperation();
        }else{
            System.out.println("Address Book not found");
        }
    }

    private void deleteAddressBook() {
        System.out.println("Available Address Books Name");
        System.out.println(dictionary.keySet());

        System.out.println("Enter addressBook name to select ");
        String addressBookName = scanner.next();

        if(dictionary.containsKey(addressBookName)){
            dictionary.remove(addressBookName);
        }else{
            System.out.println("Address book does not found");
        }
    }

    public  void displayAddressBookNames(){
        if(dictionary.isEmpty()){
            System.out.println("No addressBook Found");
        }
        else{
            System.out.println(dictionary.keySet());
        }
    }


    public void addressBookOperation(){
        int choice;
        do {

            System.out.println("*********Welcome to AddressBook ***********");
            System.out.println("1. Create AddressBook\n2. Select AddressBook for operations\n3. Exit");

            System.out.println("Enter the choice ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    createAddressBook();
                    break;
                case 2:
                    selectAddressBook();
                    break;
                case 3:
                    deleteAddressBook();
                    break;
                case 4 :
                    displayAddressBookNames();
                    break;
                default:
                    return;
            }
        }while (true);
    }
    public static void main(String[] args) {

    AddressBookMain addressBookMain = new AddressBookMain();
    addressBookMain.addressBookOperation();

    }
}