package com.bridgelabz.jdbc;

import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many books do you want to create? ");
		int howManyBooks;
		int howManyEntries;
		AddressBookSystem[] library = new AddressBookSystem[0];
		while (true) {
			howManyBooks = scanner.nextInt();
			if (howManyBooks > 0) {
				library = new AddressBookSystem[howManyBooks];
				break;
			} else
				System.out.print("You must create at least 1 book.");
		}
		for (int i = 0; i < library.length; i++) {
			library[i] = new AddressBookSystem();
			while (true) {
				System.out.print("How many entries in book " + i + "? ");
				howManyEntries = scanner.nextInt();
				if (howManyEntries > 0) {
					library[i].initEntries(howManyEntries);
					break;
				} else
					System.out.println("You must create at least 1 Entry.");
			}
		}
		boolean done = false;
		int selectedBook = 0;
		int selection;
		while (done == false) {
			System.out.println("Book " + selectedBook + " is currently selected.");

			for (int i = 0; i < library[selectedBook].getEntries(); i++) {
				System.out.println("===========Entry " + i + " ===========");
				library[selectedBook].contents[i].readEntry();
				System.out.println("================================");
			}

			System.out.println("Select an option!");
			System.out.println("1. Add an entry");
			System.out.println("2. Exit the menu");
			System.out.print("> ");
			selection = scanner.nextInt();
			String firstName, lastName, address, city, state, zip, phoneNumber, email;
			switch (selection) {
			case 1:
				System.out.print("First name: ");
				firstName = scanner.next();
				System.out.print("Last name: ");
				lastName = scanner.next();
				System.out.print("Address: ");
				address = scanner.next();
				System.out.print("city: ");
				city = scanner.next();
				System.out.print("state: ");
				state = scanner.next();
				System.out.print("zip: ");
				zip = scanner.next();
				System.out.print("phone number: ");
				phoneNumber = scanner.next();
				System.out.print("Email: ");
				email = scanner.next();
				library[selectedBook].add(firstName, lastName, address, city, state, zip, phoneNumber, email);
				break;
			case 2:
				done = true;
				break;
			default:
				System.out.print("Please choose a valid menu number");
			}
		}
	}
}