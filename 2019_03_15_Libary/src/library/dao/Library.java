package library.dao;
    
import library.entity.*;
         
public class Library {
       
	private Book[] books;
	private int currentsize;
	
	public Library(int capacity) {
	books=new Book[capacity];
	currentsize=0;
	    
	}   
	public int getCurrentsize() {
		return currentsize;
	}   
	public boolean addBook(Book book) {
		if(currentsize<books.length) {
			books[currentsize]=book;
			currentsize++;
		    return true;					
		}
		return false;
	}
	public boolean removeBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if(books[i].equals(book)) {
			books[i]=books[currentsize-1];
			currentsize--;
			return true;
			}
		}
		
		return false;		
	}
	public void display() {
     for (int i = 0; i < currentsize; i++) {
		System.out.println(books[i]);
	 }
	}
}
