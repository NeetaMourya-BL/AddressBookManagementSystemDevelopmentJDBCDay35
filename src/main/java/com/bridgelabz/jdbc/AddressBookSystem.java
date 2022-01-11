package com.bridgelabz.jdbc;

/**
 * Welcome to Address Book Program!
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class AddressBookSystem {
	Set<Contact> listOfContacts = new HashSet<>();
	private static List<Contact> contact = new ArrayList<Contact>();

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program ");
		AddressBookSystem addressBook = new AddressBookSystem();
		Scanner sc = new Scanner(System.in);
		int menu;
		String choice;
		System.out.println(" 0. Exit. ");
		System.out.println(" 1. Create contact. ");
		System.out.println(" 2. Add contact. ");
		System.out.println(" 3. Edit contact. ");
		System.out.println(" 4. Delete contact. ");
		System.out.println(" 5. add multiple contact. ");
		menu = sc.nextInt();

		while (menu != 0) {

			switch (menu) {
			case 1:
				while (menu != 2) {
					System.out.println("Enter First Name: ");
					String firstName = sc.next();
					System.out.println("Enter Last Name: ");
					String lastName = sc.next();
					System.out.println("Enter address:");
					String address = sc.next();
					System.out.println("Enter city:");
					String city = sc.next();
					System.out.println("Enter state:");
					String state = sc.next();
					System.out.println("Enter zip:");
					String zip = sc.next();
					System.out.println("Enter phone Number:");
					String phoneNumber = sc.next();
					System.out.println("Enter email:");
					String email = sc.next();
					contact.add(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));// Creating a new object and adding it to list
					menu = sc.nextInt();
				}
				break;
			case 2:
				while (menu != 2) {
					System.out.println("Enter First Name: ");
					String firstName = sc.next();
					System.out.println("Enter Last Name: ");
					String lastName = sc.next();
					System.out.println("Enter address:");
					String address = sc.next();
					System.out.println("Enter city:");
					String city = sc.next();
					System.out.println("Enter state:");
					String state = sc.next();
					System.out.println("Enter zip:");
					String zip = sc.next();
					System.out.println("Enter phone Number:");
					String phoneNumber = sc.next();
					System.out.println("Enter email:");
					String email = sc.next();
					contact.add(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));// Creating a new object and adding it to list
					menu = sc.nextInt();
				}
				break;

			case 3:
				System.out.println("Enter First Name of contact that you would like to edit: ");
				int index = sc.nextInt();
				System.out.println("Updated name is: ");
				break;
			case 4:
				System.out.println("Enter First Name of contact that you would like to delete: ");
				choice = sc.next();
				contact.remove(choice);
				break;
			case 5:
				while (menu != 2) {
					System.out.println("Enter First Name: ");
					String firstName = sc.next();
					System.out.println("Enter Last Name: ");
					String lastName = sc.next();
					System.out.println("Enter address:");
					String address = sc.next();
					System.out.println("Enter city:");
					String city = sc.next();
					System.out.println("Enter state:");
					String state = sc.next();
					System.out.println("Enter zip:");
					String zip = sc.next();
					System.out.println("Enter phone Number:");
					String phoneNumber = sc.next();
					System.out.println("Enter email:");
					String email = sc.next();
					contact.add(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));// Creating a new object and adding it to list
					System.out.println("Would you like to add someone else? 1: Yes, 2: No");
					menu = sc.nextInt();
				}
				break;
			}
			System.out.println(" 0. Exit. ");
			System.out.println(" 1. Create contact. ");
			System.out.println(" 2. Add contact. ");
			System.out.println(" 3. Edit contact. ");
			System.out.println(" 4. Delete contact. ");
			System.out.println(" 5. add multiple contact. ");
			menu = sc.nextInt();
		}
		System.out.println("Goodbye!");

	}

	private void createData(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		Contact person = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
		contact.add(person);
	}

	private void addData(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		Contact person = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
		contact.add(person);
	}

	private void editData(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
		Contact person = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
		boolean index;
		if (index = contact != null) {
			boolean temp = index;
			return;
		}
	}

	private void deleteByFirstName(String firstName) {
		for (Iterator<Contact> iterator = contact.iterator(); iterator.hasNext();) {
			Contact temp = iterator.next();
			if (temp.getFirstName().equalsIgnoreCase(firstName)) {
				iterator.remove();
				return;
			}
		}

		System.out.println("No contact with first name " + firstName + " was found.");
	}

	private void addmultipleData(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String email) {
    	Contact person = new Contact(firstName, lastName, address , city, state, zip, phoneNumber, email);
        contact.add(person);
    }
}