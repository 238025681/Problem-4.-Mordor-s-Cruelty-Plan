/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob2BookShop;

import Prob2BookShop.models.Book;
import Prob2BookShop.models.GoldenEditionBook;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author kalin
 */
public class Main {
    
    public static void main(String[] args) throws IllegalClassFormatException {
    try {
        Scanner scanner = new Scanner(System.in);
        String author = scanner.nextLine();
        String title = scanner.nextLine();
        Double price = Double.valueOf(scanner.nextLine());
        Book book = new Book(author,
                title,
                price);
        
        GoldenEditionBook goldenEditionBook = new GoldenEditionBook(author,
                title,                    
                price);
        
        Method[] bookDeclaredMethods = Book.class.getDeclaredMethods();
        Method[] goldenBookDeclaredMethods = GoldenEditionBook.class.getDeclaredMethods();
        if (goldenBookDeclaredMethods.length > 1) {
            throw new IllegalClassFormatException("Code duplication in GoldenEditionBook!");
        }
        System.out.println(book.toString());
        System.out.println(goldenEditionBook.toString());
    } catch (IllegalArgumentException error) {
        System.out.println(error.getMessage());
    }
}
    
}
