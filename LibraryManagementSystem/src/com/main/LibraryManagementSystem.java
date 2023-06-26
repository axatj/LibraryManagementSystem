package com.main;

import com.controller.*;
import java.util.*;
import com.service.*;

public class LibraryManagementSystem {

	public static void main(String[] args) {
		LibraryController lc = new LibraryController();
		HashMap<Integer, Book> hs1 = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Library managemnt system portal\nyou want to select the choice ");
		char ch;
		do {

			System.out.println("1.Add Book");
			System.out.println("2.Remove Book");
			System.out.println("3.Search by title");
			System.out.println("4.Search by author");
			System.out.println("5.Display all books");
			System.out.println("6.display books by genre");
			System.out.println("Enter a choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				lc.Operation(choice);
				break;
			case 2:
				lc.Operation(choice);
				break;
			case 3:
				lc.Operation(choice);
				break;
			case 4:
				lc.Operation(choice);
				break;
			case 5:
				lc.Operation(choice);
				break;
			case 6:
				lc.Operation(choice);
				break;
			default:
				System.out.println("Invalid option");

			}
			System.out.println("Do you want to continue y/n");
			ch = sc.next().charAt(0);

		} while (ch == 'Y' || ch == 'y');
		System.out.println("Thank you");
	}

}
