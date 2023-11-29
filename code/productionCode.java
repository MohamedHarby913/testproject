/*Author: Mohamed Ahmed Harby
 *Date: 14/11/2023
 *purpose: This system will take the number of sides of a regular polygon and do some calculation on it.
 * */


import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import javax.imageio.ImageIO;

public class productionCode{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		try
		{
		System.out.println("Welcome to the Regular Polygon program");
		int choice;// This will save the choice of the user whether they want scenario a or scenario b 
		String goAgain = "";// this will be used at the end, to see whether the user want to repeat the loop
		do
		{
			do
			{ 
			  	System.out.println("Enter (1) for finding the shape of a regular polygon");
       			  	System.out.println("OR enter (2) for finding the perimeter and area of a regular polygon");
			  	choice = input.nextInt();// user will input their choice 
			  	input.nextLine();//take empty line
			}while (!choiceFunction(choice));// this will make sure that the choice is either 1 or 2 only
			
			if ( choice == 1 ) // if choice equal 1 
			{ 
				int numOfSides;// will save the number of sides 
			  	String shape = "";
			  	do 
			  	{ 
					System.out.println("Enter the number of side to the shape of the regular polygon");
					System.out.println("Options [3-7] sides");
			    		numOfSides = input.nextInt();// user will input the number of sides  
			    		input.nextLine();//take empty line
			  		// this will return the shape based on the number of sides
					shape = findingShape(numOfSides);
			  	}while(shape.equals("error"));//will make sure the shape is available
			  	// will save the user choice to see whether they would like an image or not
				String imageChoice = "";
				System.out.print("Would like an image of the shape ");
				imageChoice = yesOrNo(input);//will return either yes or no 
				if (imageChoice.toUpperCase().equals("YES")) // yes 
				{
					displayImage(shape + ".png");
				}
			}
			else // if the user choice is equal to 2  
			{	
				int chosenShape;
				String nameOfShapeAnswer = "";
				do
				{ 	
					System.out.println("Enter the name of the shape or the number of sides");
					System.out.println("Options [triangle Or sqaure] ");
					// user will input the name of the shape or the number of sides 
					nameOfShapeAnswer = input.nextLine(); 
					// will return the number of sides 
					chosenShape = nameOfShapeFunction(nameOfShapeAnswer);
				}while(chosenShape == 0);// will make sure that the number of sides is either 3 or 4 
				double length;
				do 
				{
					System.out.println("Enter the length of the side");
	                	        length = input.nextDouble(); // user will input the length of the side
         		                input.nextLine();
				// this will make sure that the length is not negative 
				}while(!negativeValidation(length)); 
				double perimeter = findingPerimeter(chosenShape, length);//will return the perimeter 
				System.out.println("The perimeter of the shape " + perimeter + " cm ");
				double area = findingArea(chosenShape, length);// will return the area 
				System.out.println("The area  of the shape " + area + " cm2 ");
				System.out.println("The shape area compared to the hand size of a child (70.5-90.5)");
				// this will compare the area of the shape to the area of a hand of a child
				comparing(area);
			}
			// ask the user whether they would like to go again
			System.out.print("Would like to go again ? ");
			goAgain = yesOrNo(input);// this will be used to either get yes or no 
     			 
		}while (goAgain.toUpperCase().equals("YES"));// if equal yes, the loop will repeat 
		}
		catch (InputMismatchException error )
		  {
	    		System.out.println("Something went wrong!");
	 	 	System.out.println("The error is " + error);
		  }
	}		





	public static boolean choiceFunction(int choice)
	{
			
	    	boolean output = true;
		if ( choice != 1 && choice != 2 )
		{	
			System.out.println("This is not an option");
			output = false;
		}
		return output;

	}
	public static String findingShape(int numOfSides)
	{
		String shape = "error";
		if (numOfSides == 3)
		{
			System.out.println("The shape is a triangle");
			shape = "triangle";
		}
		else if (numOfSides == 4 )
		{
			System.out.println("The shape is a square");
			shape = "square";
		}
		else if (numOfSides == 5 )        
		{
                        System.out.println("The shape is a pentagon");
			shape = "pentagon";
                }
		else if (numOfSides == 6 )
                {
			System.out.println("The shape is a hexagon");
			shape = "hexagon";
                }
		else if (numOfSides == 7 )
                {
			System.out.println("The shape is a heptagon");
			shape = "heptagon";
		}
		else if ( numOfSides < 0)
		{

			System.out.println("Number of sides cannot be negative");
                }
		else if (numOfSides < 3 )
		{
			System.out.println("Number is too small");
		}
		else 
		{
			System.out.println("Number is too big");
		}
		return shape;

	}	

	public static String yesOrNo(Scanner input)
	{
	      	String answer = "";	
		do
	 	{
	  
			System.out.println("[YES or NO]");
			answer = input.nextLine();
			if (!answer.toUpperCase().equals("YES") && !answer.toUpperCase().equals("NO"))
			{
		  		System.out.println("This is not an option");
			}
		}while(!answer.toUpperCase().equals("YES") && !answer.toUpperCase().equals("NO"));
		return answer;
	}

	public static boolean negativeValidation(double answer)
	{
		boolean output = true;
		if (answer < 0 )
		{
			System.out.println("Length cannot be negative");
			output = false;
		}
		return output;
	}

	public static int nameOfShapeFunction(String answer)
	{	
		int output;
		if (answer.equals("3") || answer.toUpperCase().equals("TRIANGLE"))
		{
			output = 3; 
		}	
		else if (answer.toUpperCase().equals("SQUARE") || answer.equals("4"))
		{
			output = 4;
		}
		else 
		{
			System.out.println("Sorry this is not an available shape");
			output = 0;
		}
		return output;
	}

	public static double findingPerimeter(int chosenShape, double length)
	{
	 	double perimeter = 0;
		if (chosenShape == 3)
		{
			perimeter = 3*length;
		}
		else if ( chosenShape == 4 )
		{
			perimeter = 4*length;
		}	
		perimeter = (Math.round(perimeter*10)/10.0);
		if (length < 0 )
		{ 
		perimeter = 0;
		}
		return perimeter;
	}

	public static double findingArea( int chosenShape, double length)
		
	{
	
		double area = 0; 
		if (chosenShape == 3)
                {
                        area  = Math.round(((Math.sqrt(3))/4)*length*length*10)/10.0;
                }
                else if ( chosenShape == 4 )
                {
                        area  = Math.round(length*length*10)/10.0;
                }
		
		if (length < 0 )
		{ 
		area = 0;
		}
                
		return area;
	}

	public static void comparing(double area)
	{
		String statement = "";
		if (area < 70.5)
		{
			System.out.println("The area is too small");
		}
		else if (area > 90.5)
		{
			System.out.println("The area is too large");
		}
		else
		{
			System.out.println("The area is within the range of the hand size of a child");
		}
	}
	public static void displayImage(String imagePath) {
        try {
            // Load the image using ImageIO
            ImageIcon icon = new ImageIcon(ImageIO.read(new java.io.File(imagePath)));

            // Create a JFrame
            JFrame frame = new JFrame("Image Display");

            // Create a JLabel with the image icon
            JLabel label = new JLabel(icon);

            // Add the JLabel to the JFrame
            frame.add(label);

            // Set default close operation and make the frame visible
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

