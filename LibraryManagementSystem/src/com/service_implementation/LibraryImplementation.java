package com.service_implementation;

import com.service.*;
import java.util.*;
import java.util.Map.Entry;

public class LibraryImplementation implements LibraryManagement {

	Book b = new Book();
	HashMap<Integer, Book> hs = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addBook() {
		System.out.println("Enter size of Book");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {

			System.out.println("Enter id");
			int id = sc.nextInt();
			System.out.println("Enter title name");
			String title = sc.next();
			System.out.println("Enter author name");
			String author = sc.next();
			System.out.println("Enter Genre name");
			String genre = sc.next();
			System.out.println("Enter Year");
			int year = sc.nextInt();
			System.out.println("Enter quantity");
			int quantity = sc.nextInt();
			hs.put(id, new Book(title, author, genre, year, quantity));

		}
	}

	@Override
	public void removeBook() {
		System.out.println("Enter Book id you want to remove");
		int id = sc.nextInt();
		if (hs.isEmpty()) {
			throw new NotFoundException();
		}
		boolean isPresent = false;
		Set<Integer> key = hs.keySet();
		Iterator<Integer> itr = key.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (id == i) {
				isPresent = true;
			}
		}
		if (isPresent == true) {
			Iterator<Integer> itr1 = key.iterator();
			while (itr1.hasNext()) {
				Integer i = itr1.next();
				if (id == i) {
					itr1.remove();
					System.out.println("remove successfully");
				}
			}
		} else {
			throw new NotFoundException();
		}
	}

	@Override
	public void searchByTitle() {
		System.out.println("Enter a book title you want to search");
		String title = sc.next();
		if (hs.isEmpty()) {
			throw new NotFoundException();
		} else {
			for (Map.Entry<Integer, Book> bk : hs.entrySet()) {
				if (title.equals(bk.getValue().getTitle())) {
					System.out.println(bk.getKey() + " " + bk.getValue());
				}

				else {
					throw new NotFoundException();
				}
			}
		}
	}

	@Override
	public void searchByAuthor() {
		System.out.println("Enter a book author you want to search");
		String author = sc.next();
		if (hs.isEmpty()) {
			throw new NotFoundException();
		} else {
			for (Map.Entry<Integer, Book> au : hs.entrySet()) {
				if (author.equals(au.getValue().getAuthor())) {
					System.out.println(au.getKey() + " " + au.getValue());
				} else {
					throw new NotFoundException();
				}
			}
		}
	}

	@Override
	public void displayAllBooks() {
		System.out.println("ALL book list");
		try {
			if (hs.isEmpty()) {
				throw new NullPointerException("Book is not in the list");

			}
		} catch (NullPointerException b) {
			System.out.println(b.getMessage());
		}
		for (Map.Entry<Integer, Book> bk : hs.entrySet()) {
			System.out.println(bk.getKey() + " " + bk.getValue());
		}
	}

	@Override
	public void displayBooksByGenre() {
		System.out.println("Enter book genre you want to search");
		String genre = sc.next();
		if (hs.isEmpty()) {
			throw new NotFoundException();
		} else {
			for (Map.Entry<Integer, Book> gn : hs.entrySet()) {
				if (genre.equals(gn.getValue().getGenre())) {
					System.out.println(gn.getKey() + " " + gn.getValue());
				} else {
					throw new NotFoundException();
				}
			}
		}
	}
}
