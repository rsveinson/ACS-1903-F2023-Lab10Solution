/**
 * ACS-1903 Lab 10 Q7
 * @author (your name and student number here)
 */

import java.util.ArrayList;
import java.util.Collections;

public class OverstockReport{
    public static void main(String[] args){
        ArrayList<String> items = new ArrayList<>();        
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        Collections.addAll(items, "stick", "skates", "pucks", "helmet", "pads");
        Collections.addAll(prices, 39.99, 129.99, 19.99, 89.99, 49.59);
        Collections.addAll(quantities, 26, 5, 20, 30, 13);

        System.out.println("Overstock items: ");
         
        // enter your code here

    }
}
