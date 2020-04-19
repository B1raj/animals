# Animal-husbandry

This is a spring boot project with a simple restful service which does the following:

1. Creates a basic list of animals and birds, below is the hierarchy in which data modeling is done.

**-Animal**  
	&nbsp;&nbsp;&nbsp;&nbsp;-Dog  
    	&nbsp;&nbsp;&nbsp;&nbsp;-Cat  
	&nbsp;&nbsp;&nbsp;&nbsp;-Bird  
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	-Duck  
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	-Chicken  
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	&nbsp;&nbsp;&nbsp;	-Rooster    
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;	-Parrot (can speak like other animals)  
	&nbsp;&nbsp;&nbsp;&nbsp;-Fish   
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-Shark    
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-ClownFish    
	&nbsp;&nbsp;&nbsp;-Dolphin    
	&nbsp;&nbsp;&nbsp;-Caterpillar    
	&nbsp;&nbsp;&nbsp;-Butterfly    

2. Application starts on default 8080 port. Browse the following URL to view the basic swagger documentation.
```
 http://localhost:8080/swagger-ui.html  
 ```
3. Solution Class is present in com.singtel.solution.Solution.java, Run this class as a main method to print the solution for question 1
OR
start the application as springboot-app and trigger http://localhost:8090/solution to print charecteristics of all animals