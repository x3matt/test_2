package controller;   
import library.entity.*;
import library.dao.*;       
public class LibraryApp {
        
	public static void main(String[] args) {
		 String[] authors1= {"Karl Marx"};
		 String[] authors2= {"Friedriech Engles"};
         String[] authors3= {"Karl Marx" ,"Friedriech Engles"};
         
         Book b1= new Book("Kapital", authors1, 500, 121);
         Book b2= new Book("Red Hat",authors2, 356,223);
         Book b3= new Book("MKP", authors3, 1, 4223);
         
         Library lib1= new Library(10);
         lib1.addBook(b1);
         lib1.addBook(b2);
         lib1.addBook(b3);
         lib1.display();
         System.out.println();
         System.out.println("************");
         System.out.println();
         lib1.removeBook(b1);
         lib1.display();
	}   
}       