import java.util.Scanner;

public class AddressBookMain {
   /* creating a method for taking the information.
     */
    public static Person info(Scanner scanner) {
        System.out.println("Add details of a person");

        System.out.println("Please provide first name");
        String firstName = scanner.next();

        System.out.println("Please provide Last name");
        String lastName = scanner.next();

        System.out.println("Please provide address");
        String address = scanner.next();

        System.out.println("Please provide city");
        String city = scanner.next();

        System.out.println("Please provide state");
        String state = scanner.nextLine();

        System.out.println("Please provide zip");
        int zip = scanner.nextInt();

        System.out.println("Please provide phone number");
        String phoneNumber = scanner.next();

        System.out.println("Please provide email");
        String email = scanner.next();

        Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber, email);

        return person;
    }

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
    /*
    adding new contact by calling the info method.
     */
        Person person = info(scanner);
        addressBook.addContact(person);
        addressBook.printAddressBook();
    /*
    adding another new contact by calling the info method.
     */
        System.out.println("Please enter details of new contacts you want to add");
        Person person1 = info(scanner);
        addressBook.addContact(person1);
        addressBook.printAddressBook();
}}
