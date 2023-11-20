# <p style="text-align: center;"> Final Assessment <p/>
### Done by: Mohamed Ahmed Mohamed Yassin Harby
### Student ID: 21445116
### Due on 24/11/2023 


## Introduction
This system will have two scenarios, which I have implemented. The first will display the name and image of a regular polygon when the user enters the number of sides, and the second will calculate the shape's perimeter and area when the length is entered, then compare the area of the shape to a child's hand. After implementing the code, I created a checklist to check for errors and modularity issues. I then refactored the code, created the Black-box and White-box test designs, and implemented the test code. At the conclusion, there is a discussion and a summary.

## Module Description


### findingShape Module
This module will take input Scanner as a parameter and will return a String which is the name of the polygon, there will if statements displayed out to the user depending on the number of sides given by the user and a while loop to make sure the user input a number within the given range, and then it will return the name of the regular polygon as a string. This module will not display the image, so it has one task only to have high cohesion.

### imageOutput Module

The system will ask the user in the Main Module whether they want to see an image of the shape or not, if the user accepts this module will the output of the returned value from the findingShape Module and using a if statement it will output the image.

### yesOrNo Module

This module will take the answer of the user which is "would they like to see an image of the shape ?" and will make sure that the answer is either yes or no using a while loop and also this module will be used later when the user is asked "would they like to repeat or not" and this module will return the answer as a string.

### findingPerimeter module 

In the Main Module the system will ask the user to enter either the name of the shape or the number of sides and the length of the side so these will be the parameters of this module and it will print out the perimeter of the shape and it will not return anything. 

### findingArea module

Using the same parameters of the findingPerimeter Module, this module will calculate the area of the shape and print it out and will return the area as a double. 

### comparingHand 

This module will take the returned value from the findingArea module and will compare it to the area the given hand and then it will print out different statements based on that, this module will not return anything.

Using these modules this will prevent the using of any global variables and make sure there is low coupling and every module has only one function so high cohesion, also the most parameters in one module is three, do avoid complexity and there will be a reuse of modules to decrease redundancy. 




## Review Checklist
1 Mathematical operations are only done on real numbers ? 

2 Are the correct data types passed to methods ?

3 Do all string comparisons use ".equals" instead of "==" ?

4 When calling a method, are parameters passed in the correct order ?

5 When a method return a value, is that value being used ?

6 No rounding issues ?

7 Were only local variables being used ?

8 Does every method has only one, well-defined function ?

9 Does All methods have less than 6 parameters ? 

10 Is there any reuse of methods ?

11 No control flags being used ?

12 Low coupling ?

13 High cohesion ? 

14 No method that has two parts, that work with different data ?

## Review 

There is a minor issue in the findingPerimeter method where it does not return a value, so it is better to return the print statement as a string and printed out in the main method.

There is a minor issue in the findingShape method where the print statement could be more descriptive for the wrong value, not just "This is not an available shape".


## Refactor 

All the issues were minor issues, as I kept modularity in mind while coding, but there were a lot of changes made to the modules while coding, so the module description needs to be updated.

## Revised Module Descriptions

### Main Module
This module will contain a do while loop that will call other modules, the system will ask the user if they would like to find the shape of a regular polygon or find the perimeter and the area of a regular polygon, and then will call certain modules based on the user's input, the system will ask the user if you want to repeat or try again.


### choiceFunction Module 
This module will take the answer of user of the question "if they would like to find the shape of a regular polygon or find the perimeter and the area of a regular polygon" and make sure that the answer is either 1 or 2, and then it will return that answer.

### nameOfShape Module 
This module will be used in the second scenario before the user entering the length of the side, and it will take input as a Scanner, it will ask the user to enter the name of the shape or the number of side, the answer will in a string format even the number of sides to make it that the method only work with one data type, then it will make sure that the answer is either "3","4","triangle" or "square" then return answer.

### negativeValidation Module 

This module will take the length of the side and make sure it is not negative because lenght cannot be negative.So it will take input as a Scanner and return a double.

## findingShape Module
This module will take input Scanner as a parameter and will return a String which is the name of the polygon, there will if statements displayed out to the user depending on the number of sides given by the user and a while loop to make sure the user input a number within the given range, and then it will return the name of the regular polygon as a string. This module will not display the image, so it has one task only to have high cohesion.

### imageOutput Module

The system will ask the user in the Main Module whether they want to see an image of the shape or not, if the user accepts this module will the output of the returned value from the findingShape Module and using a if statement it will output the image.

### yesOrNo Module

This module will take the answer of the user which is "would they like to see an image of the shape ?" and will make sure that the answer is either yes or no using a while loop and also this module will be used later when the user is asked "would they like to repeat or not" and this module will return the answer as a string.


### findingPerimeter module 

In the Main Module the system will ask the user to enter either the name of the shape or the number of sides and the length of the side so these will be the parameters of this module and it will print out the perimeter of the shape and it will not return anything.

### findingArea module

Using the same parameters of the findingPerimeter Module, this module will calculate the area of the shape and print it out and will return the area as a double.

### comparing 

This module will take the returned value from the findingArea module and will compare it to the area the given hand and then it will print out different statements based on that, this module will not return anything.

Using these modules this will prevent the using of any global variables and make sure there is low coupling and every module has only one function so high cohesion, also the most parameters in one module is three, do avoid complexity and there will be a reuse of modules to decrease redundancy.

## Black-box test designs

### choiceFunction (Equivalence Partitioning)
| Category | Test Data | Expected Results|
|----------|-----------|-----------------|
| choice = 1 | 1 | True |
| choice = 2 | 2 | True|
|choice!= 1 && choice!=2 | 116 | False|


### findingShape (Equivalence Partitioning)
| Category | Test Data | Expected Results|
|----------|-----------|-----------------|
| numOfSides = 3 | 3 | "Triangle"|
| numOfSides = 4 | 4 | "Square"|
|numOfSides = 5| 5 | "Pentagon"|
| numOfSides = 6| 6 | "Hexagon" |
| numOfSides = 7| 7 | "Heptagon"|
|numOfSides < 0  |-5 | "error"|
|0 >= numOfSides < 3  | 2 | "error"|
|numOfSides > 7  | 116 | "error"|

### yesOrNo (Equivalence Partitioning)
| Category | Test Data | Expected Results|
|----------|-----------|-----------------|
| answer = "YES" | "YES" | "YES"|
| answer = "NO" | "NO" | "NO"|
|answer!= "YES"&& answer != "NO"| "Harby" | "..."|

### nameOfShapeFunction (Equivalence Partitioning)
| Category | Test Data | Expected Results|
|----------|-----------|-----------------|
| answer = "3"| "3" | 3|
| answer = "4"| "4" | 4|
| answer = "TRIANGLE"| "TRIANGLE" | 3|
| answer = "SQUARE"| "SQUARE" | 4 |
| answer!="3" && answer!="4" && answer!="TRIANGLE" && answer!="SQUARE"| "Harby" |0|


### negativeValidation (Equivalence Partitioning)
| Category | Test Data | Expected Results|
|----------|-----------|-----------------|
| answer >= 0| 5.9 | True|
| answer < 0 | -6.8 | False|

### findingPerimeter (Equivalence Partitioning)
| Category | Test Data | Expected Results|
|----------|-----------|-----------------|
| shape = 3, L >=0|3, 6.5| 19.5|
|shape = 4, L >=0| 4, 7.1 | 28.4|
|shape = 3, L <0| 3, -5 | 0|
|shape = 4, L <0| 4, -5 | 0|
|shape!= 3 && shape !=4, L >=0| 5, 5 |0|
|shape!= 3 && shape !=4, L <0| 5, -5 |0|


### findingArea (Equivalence Partitioning)
| Category | Test Data | Expected Results|
|----------|-----------|-----------------|
| shape = 3, L >=0|3, 6.5| 18.3|
|shape = 4, L >=0| 4, 7.1 | 50.4|
|shape = 3, L <0| 3, -5 | 0|
|shape = 4, L <0| 4, -5 | 0|
|shape!= 3 && shape !=4, L >=0| 5, 5 |0|
|shape!= 3 && shape !=4, L <0| 5, -5 |0|

### comparing (Equivalence Partitioning)
| Category | Test Data | Expected Results|
|----------|-----------|-----------------|
| area < 70.5|60.4| "Area is too small"|
|70.5 <= area <= 90.5| 80.6 | "Area is within range"|
|area > 90.5| 100.2 |"Area is too large"|

### comparing (Boundary Value Analysis)
| Boundary | Test Data | Expected Results|
|----------|-----------|-----------------|
| "Area is too small"/ "Area is within range"|70.4| "Area is too small"|
|| 70.5 | "Area is within range"|
|"Area is within range"/ "Area is too large"| 90.5 |"Area is within range"|
|| 90.6 |"Area is too large"|





## White-box test designs


### choiceFunction (If path)
| path | Test Data | Expected Results|
|----------|-----------|-----------------|
| Enter the if  | 116 | false |
| Do not enter the if | 1 | True|


### yesOrNo (Do-while paths)
| Path | Test Data | Expected Results|
|----------|-----------|-----------------|
|No iteration | "NO" | answer = "NO",output""|
|some iteration| "Harby\nYES" | answer = "YES", output "This is not an option"|


### findingPerimeter (Equivalence Partitioning)
| Category | Test Data | Expected Results|
|----------|-----------|-----------------|
| Enter the part|3, 6.5| 19.5|
|Enter the else if part | 4, 7.1 | 28.4|

### findingArea (Equivalence Partitioning)
| Category | Test Data | Expected Results|
|----------|-----------|-----------------|
|Enter the part|3, 6.5| 18.3|
|Enter the else if part| 4, 7.1 | 50.4|
