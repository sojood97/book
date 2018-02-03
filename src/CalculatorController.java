import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;



import javax.swing.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

//import CalculatorController.CalculateListener;

public class CalculatorController {

    

   private CalculatorView theView;

   private CalculatorModel theModel;

    

   public CalculatorController(CalculatorView theView, CalculatorModel theModel) {

       this.theView = theView;

       this.theModel = theModel;

        

       // Tell the View that when ever the calculate button

       // is clicked to execute the actionPerformed method

       // in the CalculateListener inner class

        

       this.theView.addCalculateListener(new CalculateListener());
       this.theView.subCalculateListener(new CalculateListener1());
       //this.theView.mulCalculateListener(new CalculateListener2());
       //this.theView.divCalculateListener(new CalculateListener3());
      // this.theView.modCalculateListener(new CalculateListener4());

   }

    

   class CalculateListener implements ActionListener{



       public void actionPerformed(ActionEvent e) {
    	   int firstNumber, secondNumber = 0;

           

           // Surround interactions with the view with

           // a try block in case numbers weren't

           // properly entered

            

           try{

            

               firstNumber = theView.getFirstNumber();

               secondNumber = theView.getSecondNumber();

                

               theModel.addTwoNumbers(firstNumber, secondNumber);
              
               
               theView.setCalcSolution(theModel.getCalculationValue());
              
            

           }
           catch(NumberFormatException ex){

               

               System.out.println(ex);

                

               theView.displayErrorMessage("You Need to Enter 2 Integers");

                

           }

            

       }

        

   }

   class CalculateListener1 implements ActionListener{



       public void actionPerformed(ActionEvent e) {
    	   int firstNumber, secondNumber = 0;

           

           // Surround interactions with the view with

           // a try block in case numbers weren't

           // properly entered

            

           try{

            

               firstNumber = theView.getFirstNumber();

               secondNumber = theView.getSecondNumber();

                

               theModel.subTwoNumbers(firstNumber, secondNumber);
              
               
               theView.setCalcSolution(theModel.getCalculationValue1());
              
            

           }
           catch(NumberFormatException ex){

               

               System.out.println(ex);
               theView.displayErrorMessage("You Need to Enter 2 Integers");

               

           }

            

       }

        

   }



}
           
       