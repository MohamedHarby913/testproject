import java.io.*;
import java.util.*;

public class testCode
{
	public static void main(String [] args)
	{
		choiceFunctionEPTesting();
	       	findingShapeEPTesing();
	      	yesOrNoEPTesting();
	      	nameOfShapeFunctionEPTesting();
	       	negativeValidationEPTesting();
	       	findingPerimeterEPTesting();
	       	findingAreaEPTesting();
	       	comparingEPTesting();
	      	comparingBVATesting();
		yesOrNoWBTesting();
		choiceFunctionWBTesting();
 		findingPerimeterWBTesting();
 		findingAreaWBTesting();
	


	}
	
	public static void choiceFunctionEPTesting()
	{ 
		ByteArrayOutputStream capOut = new ByteArrayOutputStream();
	      	assert productionCode.choiceFunction(1) : "user chose the first option";
		assert productionCode.choiceFunction(2) : "user chose the second option";
	  	System.setOut(new PrintStream(capOut));
	  	assert !productionCode.choiceFunction(116) : "This is not an option";
	  	capOut.reset(); 
	  	System.setOut(System.out);
	}
	
	public static void findingShapeEPTesing()
	{ 
		ByteArrayOutputStream capOut = new ByteArrayOutputStream();
	 	System.setOut(new PrintStream(capOut));
		assert "triangle".equals(productionCode.findingShape(3)) : "user chose triangle";
		capOut.reset();
	 	System.setOut(new PrintStream(capOut));
		assert "square".equals(productionCode.findingShape(4)) : "user chose Square";
	  	capOut.reset();
	  	System.setOut(new PrintStream(capOut));
	  	assert "pentagon".equals(productionCode.findingShape(5)) : "user chose Pentagon";
	  	capOut.reset();
	  	System.setOut(new PrintStream(capOut));
	  	assert "hexagon".equals(productionCode.findingShape(6)) : "user chose Hexagon";
	  	capOut.reset();
	  	System.setOut(new PrintStream(capOut));
	  	assert "heptagon".equals(productionCode.findingShape(7)) : "user chose Heptagon";
	  	capOut.reset();
	  	System.setOut(new PrintStream(capOut));
	  	assert "error".equals(productionCode.findingShape(-5)) : "user gave a negative number ";
	  	capOut.reset();
	  	System.setOut(new PrintStream(capOut));
	  	assert "error".equals(productionCode.findingShape(2)) : "user gave a small number";
	  	capOut.reset();
    		System.setOut(new PrintStream(capOut));
	  	assert "error".equals(productionCode.findingShape(116)) : "user gave a big number";
	  	capOut.reset();
	  	System.setOut(System.out);
	  
	}
	public static void yesOrNoEPTesting()
	{
		ByteArrayOutputStream capOut = new ByteArrayOutputStream();
	       	System.setIn(new ByteArrayInputStream("YES".getBytes()));
	        assert "YES".equals(productionCode.yesOrNo(new Scanner(System.in))) : "user said yes";
        

        	System.setIn(new ByteArrayInputStream("NO".getBytes()));
        	assert "NO".equals(productionCode.yesOrNo(new Scanner(System.in))) : "user said no";
        
        	System.setIn(new ByteArrayInputStream("Harby\nYES".getBytes()));
            	System.setOut(new PrintStream(capOut));
        	assert "YES".equals(productionCode.yesOrNo(new Scanner(System.in))) : "user gave a wrong answer";
        	capOut.reset();
	      	System.setOut(System.out);
        	System.setIn(System.in);
    
	}
	
	
	public static void nameOfShapeFunctionEPTesting()
	{
		ByteArrayOutputStream capOut = new ByteArrayOutputStream();
	 	assert 3 == productionCode.nameOfShapeFunction("3") : "3 sides";
	  	assert 4 == productionCode.nameOfShapeFunction("4") : "4 sides";
	  	assert 3 == productionCode.nameOfShapeFunction("Triangle") : "Triangle";
	  	assert 4 == productionCode.nameOfShapeFunction("Square") : "Square";
	  	System.setOut(new PrintStream(capOut));
	  	assert 0 == productionCode.nameOfShapeFunction("Harby") : "This is not an option";
	   	capOut.reset();
	      	System.setOut(System.out);
	}
	
	public static void negativeValidationEPTesting()
	{
		ByteArrayOutputStream capOut = new ByteArrayOutputStream();
	  	assert productionCode.negativeValidation(5.9) : "length is positive ";
	 	System.setOut(new PrintStream(capOut));
	  	assert !productionCode.negativeValidation(-6.8) : "length is negative";
	  	capOut.reset();
	      	System.setOut(System.out);
	}
	
	public static void findingPerimeterEPTesting()
	{
	  	assert 19.5 == productionCode.findingPerimeter(3,6.5) : "triangle and length is positive";
	  	assert 28.4 == productionCode.findingPerimeter(4,7.1) : "square and length is positive";
	  	assert 0 == productionCode.findingPerimeter(3,-5) : "triangle and length is negative ";
	  	assert 0 == productionCode.findingPerimeter(4,-5) : "square and length is negative";
	  	assert 0 == productionCode.findingPerimeter(5,5) : "not an angle and length is positive";
	  	assert 0 == productionCode.findingPerimeter(5,-5) : "not an angle and length is negative";
	}
	
	public static void findingAreaEPTesting()
	{
	  	assert 18.3 == productionCode.findingArea(3,6.5) : "triangle and length is positive";
	  	assert 50.4 == productionCode.findingArea(4,7.1) : "square and length is positive";
	  	assert 0 == productionCode.findingArea(3,-5) : "triangle and length is negative ";
	  	assert 0 == productionCode.findingArea(4,-5) : "square and length is negative";
	  	assert 0 == productionCode.findingArea(5,5) : "not an angle and length is positive";
	  	assert 0 == productionCode.findingArea(5,-5) : "not an angle and length is negative";
	}
	
	public static void comparingEPTesting()
	{ 
	  	String output = "";
	 	ByteArrayOutputStream capOut = new ByteArrayOutputStream();
	  	System.setOut(new PrintStream(capOut));
	  	productionCode.comparing(60.4);
	  	output = capOut.toString().trim();
	  	assert "The area is too small".equals(output);
	  	capOut.reset();
	  	System.setOut(new PrintStream(capOut));
	  	productionCode.comparing(80.6);
	  	output = capOut.toString().trim();
	  	assert "The area is within the range of the hand size of a child".equals(output);
	  	capOut.reset();
	  	System.setOut(new PrintStream(capOut));
	  	productionCode.comparing(100.2);
	  	output = capOut.toString().trim();
	  	assert "The area is too large".equals(output);
		System.setOut(System.out);
	}
	
	public static void comparingBVATesting()
	{ 
	  	String output = "";
	  	ByteArrayOutputStream capOut = new ByteArrayOutputStream();
	  	System.setOut(new PrintStream(capOut));
	  	productionCode.comparing(70.4);
	 	output = capOut.toString().trim();
	  	assert "The area is too small".equals(output);
	  	capOut.reset();
	  	System.setOut(new PrintStream(capOut));
	  	productionCode.comparing(70.5);
	  	output = capOut.toString().trim();
	  	assert "The area is within the range of the hand size of a child".equals(output);
	  	capOut.reset();
	  	System.setOut(new PrintStream(capOut));
	  	productionCode.comparing(90.5);
	  	output = capOut.toString().trim();
	  	assert "The area is within the range of the hand size of a child".equals(output);
	  	capOut.reset();
	  	System.setOut(new PrintStream(capOut));
	  	productionCode.comparing(90.6);
	  	output = capOut.toString().trim();
	  	assert "The area is too large".equals(output);
    		System.setOut(System.out);
	}
	
	
	
	//white-box testing 
	
	
	public static void yesOrNoWBTesting()
	{
		ByteArrayOutputStream capOut = new ByteArrayOutputStream();
        	System.setIn(new ByteArrayInputStream("NO".getBytes()));
        	assert "NO".equals(productionCode.yesOrNo(new Scanner(System.in))) : "user said no";
        	System.setIn(new ByteArrayInputStream("Harby\nYES".getBytes()));
            	System.setOut(new PrintStream(capOut));
        	assert "YES".equals(productionCode.yesOrNo(new Scanner(System.in))) : "user gave a wrong answer";
        	capOut.reset();
		System.setOut(System.out);
        	System.setIn(System.in);
    
	}
	
	public static void choiceFunctionWBTesting()
	{ 
	  	ByteArrayOutputStream capOut = new ByteArrayOutputStream();
	  	System.setOut(new PrintStream(capOut));
	  	assert !productionCode.choiceFunction(116) : "This is not an option";
	  	capOut.reset();
	  	assert productionCode.choiceFunction(1) : "user chose the first option";
	  	System.setOut(System.out);
	}
	
	public static void findingPerimeterWBTesting()
	{
	  	assert 19.5 == productionCode.findingPerimeter(3,6.5) : "triangle and length is positive";
	  	assert 28.4 == productionCode.findingPerimeter(4,7.1) : "square and length is positive";
	}
	
	public static void findingAreaWBTesting()
	{
	  	assert 18.3 == productionCode.findingArea(3,6.5) : "triangle and length is positive";
	  	assert 50.4 == productionCode.findingArea(4,7.1) : "square and length is positiive";
	}
}
