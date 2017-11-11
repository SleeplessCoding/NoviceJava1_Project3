/**
 * Introduction to Java Programming I(IT151)
 * Professor Dr. Mazen Alkhatib
 * Individual Project 3
 */

/**
 * @author Nicholas Weinold
 * 4/24/2016
 */

import javax.swing.JOptionPane;

 class car{ // Creating our assignment class outside of our main class to set up out three attributes for getter methods within main class 
    
    String color;  //Here are the three attributes Color of car, amount of seats, engine liters (power)
    int seats;
    double liters;
  
     String colorGet(){ //creating accessor method to get the color from the stored data
         return color;
     }
     
     int seatsGet(){   //creating accessor method to get the seats from the stored data
         return seats;
     }
     
     double litersGet(){   //creating accessor method to get the liters from the stored data
         return liters;
     }
     
     car(String colorInit, int seatsInit, double litersInit){//Creating the constructor with parameters we create the objects and then we will assign the attributes
         color = colorInit;
         seats = seatsInit;
         liters = litersInit;        
} 
     
}//class creation complete we can now use it in our program

public class IndividualProject3 { //START main class creation as a public to other classes in the program with the name IndividualProject2

   
    public static void main(String[] args) { 
        
        String colorInit = ""; //we create our varibales to get our input from the user for message prompts we give them values to allow our loop to validate
        int seatsInit = 0;
        int litersInit = 0;
        
        //create variables to test against user input when the parseInt converts string to a null
        String seatssInit="";
        String literssInit="";
     
        
        //again we use JOptionPane input dialog boxes
        
        while(colorInit.isEmpty()){  // We start our while loop and set the condition to not allow empty results using .isEmpty()
            
            colorInit = JOptionPane.showInputDialog("Please select one of the following colors. \n - Red \n - Blue \n - Grey \n - Black \n - White"); //we ask the user what color they want, we then store the response

        } //loop end
            
        while((seatsInit<=1)||(seatsInit>5)||(seatsInit==3)){ // We start our second loop and set the condiition to not allow for inputs less than 1, greater than 5, or equal to 3
            
            seatssInit=JOptionPane.showInputDialog("How many seats would you like? \n - 2   (Two-seater) (coupe) \n - 4  " + " (4 seat sedan)  \n - 5   (added middle seat sedan)");//we ask the user what seat option they want and store it in our new seatssInit variable
                if(!seatssInit.isEmpty()) {                  //we create a line here to test to see if the seatssInit is empty or "" and if its false it will process as normal
                seatsInit = Integer.parseInt(seatssInit);    //if the seatssInit is false it will invert it using !seastssInit and then execute the integer.parse store the data and continue
                }                                            
        } //loop end    
                    
        while((litersInit<=1)||(litersInit>4)){         // We start our third loop and set the condiition to not allow for inputs less than 1 or greater than 4
        literssInit = JOptionPane.showInputDialog("Please select a liter option? \n 2  (liters) \n 3  (liters) \n 4  (liters)"); //we ask the user which liter option they want and store it in our new literssInit variable
            if(!literssInit.isEmpty()) {                // again we create a line here to test to see if the literssInit is empty or "" and if its false it will process as normal
            litersInit = Integer.parseInt(literssInit); //if the literssInit is false it will invert it using !literssInit and then execute the integer.parse store the data and continue
            }                                                                     
        }//loop end
        
        
        car car1 = new car(colorInit, seatsInit, litersInit); // creating the object car1 using the car object which belongs to the car class 
        
        
        
        System.out.println("Car color = "+ car1.colorGet()); // Now we use getters that we call above to display the stored user inputs
        System.out.println("Car Seats = "+ car1.seatsGet());
        System.out.println("Car Liters = "+ car1.litersGet());
        
        
    }
    
} //END
