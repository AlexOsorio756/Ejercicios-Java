/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talentotech.Excercises.POO.LibraryExcercise;
import java.util.Scanner;

/**
 *
 * @author Alexander 
 */
public class LibraryManagement {
    private Library library;

    public LibraryManagement(Library library) {
        this.library = library;
    }
    
    public void menuOptionAddBookToLibrary(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ingrese el titulo del libro nuevo:  ");
         String newBookTitle = scanner.nextLine();
         System.out.println("Ingrese el autor del libro nuevo:  ");
         String newBookAuthor = scanner.nextLine();
         System.out.println("Ingrese el ISBN del libro nuevo:  ");
         String newISBN = scanner.nextLine();
         Book newBook = new Book(newBookTitle, newBookAuthor, newISBN);
         this.library.addBook(newBook);
    }
    
    public void menuOptionRemoveBookFromLibrary(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ingrese el ISBN del libro que desea borrar:  ");
         String ISBNtoRemove = scanner.nextLine();
         
         if(library.findBook(ISBNtoRemove) != null){
             library.removeBook(library.findBook(ISBNtoRemove));
             System.out.println("Se elimino satisfactoriamente el libro...");
             
         }else{
             System.out.println("El libro con el ISBN "+ISBNtoRemove + " no existe...");
         }
    }
    
   public void menuOptionShowAllBooks(){
       library.showAllBooks();
   }
   
   public void menuOptionSearchBook(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Ingrese el ISBN del libro que desea buscar:  ");
         String ISBNtoFind = scanner.nextLine();
         
         if(library.findBook(ISBNtoFind) != null){
             library.removeBook(library.findBook(ISBNtoFind));
             Book bookFound = library.findBook(ISBNtoFind);
             System.out.println("Book found! \n\n");
             System.out.println("Book title: "+ bookFound.getTitle() +"\n" + ", Book author:  "+ bookFound.getAuthor()+ "\n" +", Book ISBN: "+bookFound.getISBN());
             
         }else{
             System.out.println("El libro con el ISBN "+ISBNtoFind + " no existe...");
         }
   }
   public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        Library newLibrary = new Library("Carlos Gaviria Biblioteca");
        LibraryManagement managemenet = new LibraryManagement(newLibrary);

        while (true) {
            System.out.println("Menú de opciones:\n");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Buscar libro");
            System.out.println("4. Ver todos los libros");
            System.out.println("5. Salir");

            System.out.print("Selecciona una opción (1-5): ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    managemenet.menuOptionAddBookToLibrary();
                    break;
                case "2":
                    managemenet.menuOptionRemoveBookFromLibrary();
                    break;
                case "3":
                    managemenet.menuOptionSearchBook();
                    break;
                case "4":
                    managemenet.menuOptionShowAllBooks();
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    // No cerramos el scanner aquí, lo cerramos fuera del bucle si es necesario
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
            
        }
    }
   
  
   
   public static void main(String[] args){
       mainMenu();
    }
    
    
    
   
}
