/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spendings;

import java.time.LocalDate;

/**
 *
 * @author student
 */
public class Expense {

    private String name;
    private double price;
    private LocalDate date;

    public Expense(String name, double price, LocalDate date)
            throws InvalidDateException {
        if (date.isBefore(LocalDate.now().minusYears(100))) {
            throw new InvalidDateException(
                    "The date is older than 100 years...");
        }
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense{" + "name=" + name + ", price=" + price + ", date=" + date + '}';
    }

    
    
}
