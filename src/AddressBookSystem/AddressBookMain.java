package AddressBookSystem;

import java.util.*;

public class AddressBookMain {
    Scanner scanner = new Scanner(System.in);
    Map<String, AddressBook> dictionary = new HashMap<>();
    /*
    *this function creates an address book of the given name
     */
    public void createAddressBook(){
        System.out.println("Enter a name for addressBook ");
        String addressBookName = scanner.next();
        dictionary.put(addressBookName,new AddressBook());
    }

    /*
    *this function is for select a particular address book from the list to perform contact operation over the address book
     */
    public void selectAddressBook(){

        displayAddressBookNames();

        System.out.println("Enter addressBook name to select ");
        String addressBookName = scanner.next();

        if(dictionary.containsKey(addressBookName)){

            AddressBook addressBook = dictionary.get(addressBookName);

            addressBook.contactOperation();
        }else{
            System.out.println("Address Book not found");
        }
    }

    /*
    *this function is made to delete a particular address book available in the list
     */
    private void deleteAddressBook() {

        displayAddressBookNames();

        System.out.println("Enter addressBook name to select ");
        String addressBookName = scanner.next();

        if(dictionary.containsKey(addressBookName)){
            dictionary.remove(addressBookName);
        }else{
            System.out.println("Address book does not found");
        }
    }

    /*
    *this function displays the name of the address book's
     */
    public  void displayAddressBookNames(){
        if(dictionary.isEmpty()){
            System.out.println("No addressBook Found");
        }
        else{
            System.out.println(dictionary.keySet());
        }
    }
    /*
    * this function provide the mechanism of finding the contact over multiple address books which has the same city name
     */
    public void findContact(){

        List<Contacts> contactsList = new ArrayList<>(); // temporary array list of contact object

        System.out.println("Enter city name to find the contacts");
        String city = scanner.next();

//        for(String key : dictionary.keySet()){
//            AddressBook addressBook = dictionary.get(key);
//            for(Contacts contacts : addressBook.contactList){
//                if(city.equalsIgnoreCase(contacts.getCity())){
//                    contactsList.add(contacts);
//                }
//            }
//        }
//
//        for(Contacts contacts : contactsList){
//            System.out.println(contacts.toString());
//        }

        /*
        * used lambda expression here for optimization
         */
        dictionary.keySet().forEach(
                key->dictionary.get(key)
                        .contactList.forEach(
                                contacts -> System.out.println(contacts.getFirstName()+" \t "+contacts.getAddress()
                                )
                        )
        );
    }

    /*
    *This function is made to manipulate multiple address book's
    * i.e. it creates an address book, select address book, delete address book and displays address book's name
    * provides basic functionality for handle the address book's ('addressBookMap')
     */
    public void addressBookOperation(){
        int choice;
        do {

            System.out.println("*********Welcome to AddressBook ***********");
            System.out.println("1. Create AddressBook\n2. Select AddressBook for operations\n3. Delete AddressBook");
            System.out.println( "4. Display AddressBooks\n5. Find Contacts \n6. Exit");

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
                case 5:
                    findContact();
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