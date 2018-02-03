import java.awt.event.ActionListener;

 

import javax.swing.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;


           
public class Soft1 {

     

    public static void main(String[] args) {

         

        CalculatorView theView = new CalculatorView();

         

        CalculatorModel theModel = new CalculatorModel();

         

        CalculatorController theController = new CalculatorController(theView,theModel);

         

        theView.setVisible(true);

         

    }

}
