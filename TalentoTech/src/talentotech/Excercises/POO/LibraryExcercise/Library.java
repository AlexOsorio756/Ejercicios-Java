/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talentotech.Excercises.POO.LibraryExcercise;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alexander
 */
public class Library {
    
    private ArrayList<Book> books;
    private String name;

    public Library(String name) {
        this.books = new ArrayList<>();
        this.name = name;
    }
    
    public void  addBook(Book newBook){
        books.add(newBook);
    }
    public void removeBook(Book oldBook){
        books.remove(oldBook);
    }
    
    public Book findBook(String ISBN){
        for(Book book : books){
            if(book.getISBN() == "ISBN"){
                return book;
            }
        }
        return null;
    }
    
     public void showAllBooks(){
         for(Book book : books){
            System.out.println("Book title: "+ book.getTitle() +"\n" + ", Book author:  "+ book.getAuthor()+ "\n" +", Book ISBN: "+book.getISBN()+"\n\n");
         }
         
    }

    @Override
    public String toString() {
        return "Library{" + "books=" + books + "name=" +name +'}';
    }
    
}
