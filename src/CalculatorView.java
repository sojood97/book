import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;



import javax.swing.*;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

 
public class CalculatorView extends JFrame{

 

    private JTextField firstNumber  = new JTextField(10);

    private JLabel additionLabel = new JLabel("+");

    private JTextField secondNumber = new JTextField(10);

    private JButton calculateButtonadd = new JButton("Calculate add");

    private JTextField calcSolution = new JTextField(10);

 
    private JLabel subLabel = new JLabel("-");
    private JButton calculateButtonsub = new JButton("Calculate sub");
    
     private JLabel divLabel = new JLabel("/");
    private JButton calculateButtondiv = new JButton("Calculate div");

    private JLabel mulLabel = new JLabel("*");
    private JButton calculateButtonmul = new JButton("Calculate mul");

    private JLabel modLabel = new JLabel("%");
    private JButton calculateButtonmod = new JButton("Calculate mod");
    
    private JLabel squareLabel = new JLabel("");
    private JButton calculateButtonsquare = new JButton("Calculate squreroot");
    
    
   

    

    CalculatorView(){

         

        
         

        JPanel calcPanel = new JPanel();
     


         

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(600, 200);

         

        calcPanel.add(firstNumber);

        calcPanel.add(additionLabel);
        calcPanel.add(subLabel);
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButtonsub);
        calcPanel.add(calculateButtondiv);
        calcPanel.add(calculateButtonadd);
        calcPanel.add(calculateButtonmul);
        calcPanel.add(calculateButtonmod);
        calcPanel.add(calculateButtonsquare);
        calcPanel.add(calcSolution);

        

        this.add(calcPanel);
       


         

        

         

    }
    public double getFirstNumber(){
    	
    	         
    	
    	        return Double.parseDouble(firstNumber.getText());
    	
    	         
    	
    	    }
    
    	     
    	
    	    public double getSecondNumber(){
    
    	         
    	
    	        return Double.parseDouble(secondNumber.getText());
    	
    	         
    	
    	    }
    	
    	     
    	
    	    public double getCalcSolution(){
    	    	return Double.parseDouble(calcSolution.getText());
    	    	
   	         
    	    	
    	    }
    	
    	     
    	
    	    public void setCalcSolution(String solution){
    	
    	         
    	
    	        calcSolution.setText(solution);
    	
    	         
    	
    	    }
    	
    	     
    	
    	    
    
    	     
    	
    	    void addCalculateListener(ActionListener listenForCalcButton){
    	
    	         
    	
    	        calculateButtonadd.addActionListener(listenForCalcButton);
    	
    	         
    	
    	    }
    	    void subCalculateListener(ActionListener listenForCalcButton){
    	    	
   	         
    	    	
    	        calculateButtonsub.addActionListener(listenForCalcButton);
    	
    	         
    	
    	    }
    	    void mulCalculateListener(ActionListener listenForCalcButton){
    	    	
   	         
    	    	
    	        calculateButtonmul.addActionListener(listenForCalcButton);
    	
    	         
    	
    	    }
         void divCalculateListener(ActionListener listenForCalcButton){
    	    	
   	         
    	    	
    	        calculateButtondiv.addActionListener(listenForCalcButton);
    	
    	         
    	
    	    }
         void modCalculateListener(ActionListener listenForCalcButton){
 	    	
   	         
 	    	
 	        calculateButtonmod.addActionListener(listenForCalcButton);
 	
 	         
 	
 	    }
         
         void squareCalculateListener(ActionListener listenForCalcButton){
  	    	
   	         
  	    	
  	        calculateButtonsquare.addActionListener(listenForCalcButton);
  	
  	         
  	
  	    }
    	

    	    void displayErrorMessage(String errorMessage){
    	    	
    	    	         
    	    	
    	    	        JOptionPane.showMessageDialog(this, errorMessage);
    	    	
    	    	         
    	    	
    	    	    }
    	    	
    	    	     
    	    	
    	    	}