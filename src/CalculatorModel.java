import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculatorModel {

 

   
     

    private double calculationValue;

    private JTextField calcSolution;
    String result;
    double y;
    public void addTwoNumbers(double firstNumber, double secondNumber){

         

        calculationValue = firstNumber + secondNumber;
        result=" "+calculationValue;
         

    }

     

    public String getCalculationValue(){

         

        return result;

         

    }
    
    public void subTwoNumbers(double firstNumber, double secondNumber){

        

        calculationValue = firstNumber - secondNumber;

        result=" "+calculationValue;

    }

     

    public String getCalculationValue1(){

         

        return result;

         

    }
    public void mulTwoNumbers(double firstNumber, double secondNumber){

        

        calculationValue = firstNumber * secondNumber;

        result=" "+calculationValue;

    }

     

    public String getCalculationValue2(){

         

        return result;

         

    }
    public void divTwoNumbers(double firstNumber, double secondNumber){

        if( secondNumber ==0){
        	 JOptionPane.showMessageDialog(null,"enter any number except zero in division");
        	 y=20.0;
        	 
        }
        else{

        calculationValue = firstNumber / secondNumber;

        } 
        result=" "+calculationValue;
       // calcSolution.setText(" ");
    }

     

    public String getCalculationValue3(){

         

        return result;

         

    }
    public void modTwoNumbers(double firstNumber, double secondNumber){

        
   int x= (int) ( firstNumber);
   int y= (int) ( secondNumber);
    	
        calculationValue = (int) (x % y);

        result=" "+calculationValue;

    }

     

    public String getCalculationValue4(){

         

        return  result;

         

    }
    
public void squareNumber(double firstNumber){

        
        if(firstNumber<0){
        	JOptionPane.showMessageDialog( null,"must positve value in square root ");
        	
        }
        else{
       calculationValue =  Math.sqrt(firstNumber) ;
	
        }
	
	        

	            
        result=" "+calculationValue;

    }

     

    public String getCalculationValue5(){

         

        return result;

         

    }
    
    
}