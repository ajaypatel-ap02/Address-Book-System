package AddressBookSystem;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Contacts {
    private String firstName;
    private String lastName;
    private String city;
    private String address;
    private String zip;
    private String state;
    private String email;
    private String phoneNumber;
    /*
    * this take a string and a Scanner objects input
    * and check the requirements and return a valid string
    * this is basically made for getting a valid contact information
     */
    public static String checkInput(String str, Scanner sc){
//        Pattern pattern = Pattern.compile("^[A-Z][A-Za-z]{2,}$");
//        Matcher matcher = pattern.matcher(str);
//        Pattern pattern = null;
        String pattern = "^[A-Z][A-Za-z]{2,}$";
        boolean flag = Pattern.matches(pattern,str);
        while (!flag){
            System.out.println("Please enter valid input [first letter capital and no number included");
            str = sc.next();
//            matcher = pattern.matcher(str);
            flag = Pattern.matches(pattern,str);
        }
            return str;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", zip='" + zip + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
