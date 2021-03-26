/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spendings;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InvalidDateException {
        //List<Expense> expenses = new ArrayList<>();
        /*try {
            Expense e = new Expense("Test expense", 100, LocalDate.of(1820, Month.AUGUST, 31));
            expenses.add(e);
        } catch (InvalidDateException ex) {
            System.out.println("You have added a wrong date...");
        }*/
        //System.out.println("Go on with the rest of the code");
        //Expense e2 = new Expense("", 0, LocalDate.MAX);
        try {
            Scanner fsc = new Scanner(new File("data.txt"));
            fsc.useDelimiter("[\\n@]");
            while (fsc.hasNext()) {
                LocalDate Id=LocalDate.parse(fsc.next());
                String name= fsc.next();
                double price= Double.parseDouble(fsc.next());
                Expense e = new Expense(name, price, Id);
                System.out.println(e);
            }
            fsc.close();
            } catch (FileNotFoundException ex) {
            System.err.println("data.txt file does not exist...");
        }
        catch(InvalidDateException ex){
            System.err.println("A wrong datawas given....");
        }
        
       
    }

}
