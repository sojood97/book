package calc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;



import javax.swing.*;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.lang.Math;




public class CalculatorController {

    double w;

   private CalculatorView theView;

   private CalculatorModel theModel;

    

   public CalculatorController(CalculatorView theView, CalculatorModel theModel) {

       this.theView = theView;

       this.theModel = theModel;

        

    

       this.theView.addCalculateListener(new CalculateListener());
       this.theView.subCalculateListener(new CalculateListener1());
       this.theView.mulCalculateListener(new CalculateListener2());
     this.theView.divCalculateListener(new CalculateListener3());
     this.theView.modCalculateListener(new CalculateListener4());
     this.theView.squareCalculateListener(new CalculateListener5());

   }

    

   class CalculateListener implements ActionListener{



       public void actionPerformed(ActionEvent e) {
    	   double firstNumber, secondNumber = 0.0;

           

          
            

           try{

            

               firstNumber = theView.getFirstNumber();

               secondNumber = theView.getSecondNumber();

               theModel.addTwoNumbers(firstNumber, secondNumber);
               
               theView.setCalcSolution(theModel.getCalculationValue());
              
            

           }
           catch(NumberFormatException ex){

               

               System.out.println(ex);

                w=50;

               theView.displayErrorMessage("You Need to Enter 2 Integers not a string value");

                

           }

            

       }

        

   }

   class CalculateListener1 implements ActionListener{



       public void actionPerformed(ActionEvent e) {
    	   double firstNumber, secondNumber = 0.0;

           

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

               w=50;

               System.out.println(ex);
               theView.displayErrorMessage("You Need to Enter 2 doubles only");

               

           }

            

       }

        

   }

   class CalculateListener2 implements ActionListener{



       public void actionPerformed(ActionEvent e) {
    	   double firstNumber, secondNumber = 0.0;

           

           // Surround interactions with the view with

           // a try block in case numbers weren't

           // properly entered

            

           try{

            

               firstNumber = theView.getFirstNumber();

               secondNumber = theView.getSecondNumber();

                

               theModel.mulTwoNumbers(firstNumber, secondNumber);
              
               
               theView.setCalcSolution(theModel.getCalculationValue2());
              
            

           }
           catch(NumberFormatException ex){

               w=50;

               System.out.println(ex);
               theView.displayErrorMessage("You Need to Enter 2 doubles only");
           }
       }
   }
   class CalculateListener3 implements ActionListener{
   public void actionPerformed(ActionEvent e) {
	   double firstNumber, secondNumber =0.0;

       

       // Surround interactions with the view with

       // a try block in case numbers weren't

       // properly entered

        

       try{

        

           firstNumber = theView.getFirstNumber();
           
      //     if(theView.getSecondNumber()==0)
      //    {
        //1	 JOptionPane.showMessageDialog(null,"enter any number except zero");
      //    }
           
          
         
          // secondNumber = theView.getSecondNumber();

         // }
         secondNumber = theView.getSecondNumber();
           theModel.divTwoNumbers(firstNumber, secondNumber);
          
           
           theView.setCalcSolution(theModel.getCalculationValue3());
          
       

       }
       catch(NumberFormatException ex){

           w=50;

           System.out.println(ex);
           theView.displayErrorMessage("You Need to Enter 2 doubles only");
       }
   }
}
   class CalculateListener4 implements ActionListener{
	   public void actionPerformed(ActionEvent e) {
		   double firstNumber, secondNumber = 0.0;

	       

	      
	        

	       try{

	        

	           firstNumber = theView.getFirstNumber();

	           secondNumber = theView.getSecondNumber();

	            

	           theModel.modTwoNumbers(firstNumber, secondNumber);
	          
	           
	           theView.setCalcSolution(theModel.getCalculationValue4());
	          
	        

	       }
	       catch(NumberFormatException ex){
	    	   w=50;

	           

	           System.out.println(ex);
	           theView.displayErrorMessage("You Need to Enter 2 double");
	       }
	   }
	}
   class CalculateListener5 implements ActionListener{
	   public void actionPerformed(ActionEvent e) {
		   double firstNumber = 0.0;

	       

	       
	        

	       try{

	        

	           firstNumber = theView.getFirstNumber();

	           

	            

	           theModel.squareNumber(firstNumber);
	          
	           
	           theView.setCalcSolution(theModel.getCalculationValue5());
	          
	        

	       }
	       catch(NumberFormatException ex){

	           w=50;

	           System.out.println(ex);
	           theView.displayErrorMessage("You Need to Enter 1 double value in square root");
	       }
	   }
   }
}

           
       