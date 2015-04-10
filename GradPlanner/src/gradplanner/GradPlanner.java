/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradplanner;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author Mike
 */
public class GradPlanner {
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        
        double semTuition = 2890;
        double moPerTerm = 6;
          
        System.out.println("Hello! - Welcome to the WGU Graduation Planner.");
        
        System.out.println("Please enter the number of CUs or units for each remaining course, type 'done' when finished: ");
        
        ArrayList<Double> units = new ArrayList<>();
        
            double number = 0;
            double remainingUnits = 0;

            number = Integer.parseInt(in.nextLine());
            if (number <= 0) {
                System.out.println("The number of units must be greater than zero");
            }

            while (in.hasNextDouble()) {
                units.add(in.nextDouble());
            }

            for (Double unit : units) {
                remainingUnits += unit;
            }
        
        //System.out.println(remainingUnits);
       
        Scanner planned = new Scanner(System.in);
        System.out.print("Please enter the number of units you plan to complete per term: ");
        int plannedUnits = planned.nextInt();
        if (plannedUnits <= 0) {
           System.out.println("The number of planned units must be greater than zero");
        }
        
        int remainingTerms = (int) (remainingUnits / plannedUnits);
        
        if (remainingTerms == 1) {
            System.out.println("You have " + remainingTerms + " term left until Graduation"); 
        } else {
        System.out.println("You have " + remainingTerms + " terms left until Graduation"); 
        }
        
        int totalCost = (int) (semTuition * remainingTerms);     
        System.out.println("Your total tuition cost is $" + NumberFormat.getNumberInstance(Locale.US).format(totalCost));
        
        int totalMonths = (int) (remainingTerms * moPerTerm);
        System.out.println("You have " + totalMonths + " months remaining");        
    }

}

