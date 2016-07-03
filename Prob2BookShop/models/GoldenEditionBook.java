/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prob2BookShop.models;

/**
 *
 * @author kalin
 */
public class GoldenEditionBook extends Book {

    public GoldenEditionBook(String author, String title, double price) {
        super(author, title, price);
    }

    
    public double getPrice() {
        return super.getPrice() + super.getPrice() * 0.3;
    }

}
