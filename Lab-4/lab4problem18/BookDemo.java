package lab4problem18;

import java.util.Scanner;

public class BookDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Author a1 = new Author("Mk", "Mithun");
        Book b1 = new Book("Java", "Russel", 80);
        System.out.print("Enter First Name: ");
        String firstName = input.nextLine();
        a1.setFirstName(firstName);
        System.out.print("Enter Last Name: ");
        String lastName = input.nextLine();
        a1.setLastName(lastName);
        System.out.print("Enter Book Tittle: ");
        String title = input.nextLine();
        b1.setTitle(title);
        System.out.print("Enter Book Author: ");
        String author = input.nextLine();
        b1.setAuthor(author);
        System.out.print("Enter Book Price: ");
        double price = input.nextDouble();
        b1.setPrice(price);
        //System.out.println("First Name: " + a1.getFirstName());
        //System.out.println("Last Name: " + a1.getLastName());
        //System.out.println("To String: " + a1.toString());
        //System.out.println("Title: " + b1.getTitle());
        //System.out.println("Author Name: " + b1.getAuthor());
        System.out.println(b1.toString());
    }
}


