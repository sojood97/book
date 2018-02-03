
public class CalculatorModel {

 

    // Holds the value of the sum of the numbers

    // entered in the view

     

    private int calculationValue;

     

    public void addTwoNumbers(int firstNumber, int secondNumber){

         

        calculationValue = firstNumber + secondNumber;

         

    }

     

    public int getCalculationValue(){

         

        return calculationValue;

         

    }
    
    public void subTwoNumbers(int firstNumber, int secondNumber){

        

        calculationValue = firstNumber - secondNumber;

         

    }

     

    public int getCalculationValue1(){

         

        return calculationValue;

         

    }
    public void mulTwoNumbers(int firstNumber, int secondNumber){

        

        calculationValue = firstNumber * secondNumber;

         

    }

     

    public int getCalculationValue2(){

         

        return calculationValue;

         

    }
    public void divTwoNumbers(int firstNumber, int secondNumber){

        

        calculationValue = firstNumber / secondNumber;

         

    }

     

    public int getCalculationValue3(){

         

        return calculationValue;

         

    }
    public void modTwoNumbers(int firstNumber, int secondNumber){

        

        calculationValue = firstNumber % secondNumber;

         

    }

     

    public int getCalculationValue4(){

         

        return calculationValue;

         

    }
    
    
}