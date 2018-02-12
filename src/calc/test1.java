package calc;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class test1 {

	
	CalculatorModel  c1=new CalculatorModel();
	
	CalculatorView c2=new CalculatorView();
	CalculatorController c3=new CalculatorController(c2, c1);

	@Test
	 public void addtest() throws Exception {
		 double expexted=7.0;
		 c1.addTwoNumbers(3.0,4.0);
		 String x=c1.getCalculationValue();
		assertEquals(expexted,Double.parseDouble(x),0);
		 
		 
	
	 }
	
/*	@Test
	 public void addnegativetest() throws Exception {
		 double expexted=-7.0;
		 
		 
		 c1.addTwoNumbers(-3.0,-4.0);
		 String x=c1.getCalculationValue();
		assertEquals(expexted,Double.parseDouble(x),-2);
		 
		 
	
	 }
	
	@Test
	 public void divbyzerotest() throws Exception {
		
		 double expexted=20.0;
		 
		 c1.divTwoNumbers(4.0,0.0);
		// String x=c1.getCalculationValue();
		assertEquals(expexted,c1.y,0);
		 
		 
	
	 }
	@Test
	public void negativesquarerrottest() throws Exception {
		
		 //double expexted=2.0;
		 
		 c1.squareNumber(-4.0);
		 String x=c1.getCalculationValue();
		assertEquals(0,Double.parseDouble(x),0);
		 
		 
	
	 }
	@Test
	public void notaccseptstringtest() throws Exception {
		
		
		
		try{

	            
		//double expexted=50.0;
			 String s="s";
				double z;
				z=Double.parseDouble(s);
				
				c1.addTwoNumbers(z,4.0);
				 String x=c1.getCalculationValue();
				
              assertEquals(0,Double.parseDouble(x),0);

            
            
             
             

     }
      catch(NumberFormatException ex){

             

      System.out.println(ex);
           c2.displayErrorMessage("You Need to Enter 2 double number not a string");

             

       }
		 
	
	 }
	@Test
	 public void subnegativetest() throws Exception {
		 double expexted=2.0;
		 
		 
		 c1.subTwoNumbers(-2.0,-4.0);
		 String x=c1.getCalculationValue();
		assertEquals(expexted,Double.parseDouble(x),-2);
		 
		 
	
	 }
	
	@Test
	 public void divtest() throws Exception {
		 double expexted=2.0;
		 
		 
		 c1.divTwoNumbers(4.0,2.0);
		 String x=c1.getCalculationValue();
		assertEquals(expexted,Double.parseDouble(x),-2);
		 
		 
	
	 }
	
	@Test
	 public void multest() throws Exception {
		 double expexted=8.0;
		 
		 
		 c1.mulTwoNumbers(4.0,2.0);
		 String x=c1.getCalculationValue();
		assertEquals(expexted,Double.parseDouble(x),-2);
		 
		 
	
	 }

	@Test
	 public void modtest() throws Exception {
		 double expexted=0.0;
		 
		 
		 c1.modTwoNumbers(4.0,2.0);
		 String x=c1.getCalculationValue();
		assertEquals(expexted,Double.parseDouble(x),-2);
		 
		 
	
	 }
	
	*/
	    

}
