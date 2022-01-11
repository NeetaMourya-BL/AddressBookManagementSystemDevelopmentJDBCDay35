package com.bridgelabz.jdbc;

/**
 * Welcome to Address Book Program!
 *
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookSystem {
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
					contact.add(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));// Creating
																													// a
																													// new
																													// object
																													// and
																													// adding
																													// it
																													// to
																													// list
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
					contact.add(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email)); // Creating a new object and adding it to list
					menu = sc.nextInt();
				}
				break;
			}
			System.out.println(" 0. Exit. ");
			System.out.println(" 1. Create contact. ");
			System.out.println(" 2. Add contact. ");
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
}