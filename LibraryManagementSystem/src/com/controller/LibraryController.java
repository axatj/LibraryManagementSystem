package com.controller;

import com.service.NotFoundException;
import com.service_implementation.*;

public class LibraryController {
	private LibraryImplementation ls;

	public LibraryController() {
		this.ls = new LibraryImplementation();
	}

	public void Operation(int option) {
		switch (option) {
		case 1:
			ls.addBook();
			break;
		case 2:try
		{
			ls.removeBook();
		}
		catch(NotFoundException e)
		{
			e.getMessage();
		}
			break;
		case 3:
			try
			{
			ls.searchByTitle();
			}
			catch(NotFoundException t)
			{
				t.getMessage();
			}
			
			break;
		case 4:try
		{
			ls.searchByAuthor();
		}
		catch(NotFoundException a)
		{
			a.getMessage();
		}
			break;
		case 5:try
		{
			ls.displayAllBooks();
		}
		catch(NullPointerException d)
		{
			d.getMessage();
		}
			break;
		case 6:try
		{
			ls.displayBooksByGenre();
		}
		catch(NotFoundException g)
		{
			g.getMessage();
		}
			break;
		default:
			System.out.println("Invalid Option");
		}
	}

}
