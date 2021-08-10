import java.util.Scanner;

// -------------------------------------------------------
// Assignment 2 Question 1
// Written by: Hao Yi Liu (40174210)
// Date: 16/02/2021
// For COMP 248 Section W 2204 - Winter 2021
// -------------------------------------------------------
/* this program prompts the user to give their name, ID and score to display their letter grade
when the information is valid. When the information is invalid, the program repeats the question until it becomes valid. */
public class Question1 {
	public static void main(String[] args) {
		System.out.println("**************************************");
		System.out.println("Welcome to Grading System Program!"); //printing the welcome message
		System.out.println("**************************************");
		Scanner keyboard=new Scanner(System.in); //letting the user put inputs
		boolean condition0=false; //creating flag variables
		String[] nameList= {}; //creating arrays
		boolean condition1=false;
		boolean condition2=false;
		boolean condition3=false;
		while (!condition0){
			condition0=false; 
			condition1=false;
			condition2=false;
			condition3=false;
			while (!condition1) { //repeating the statements until a valid pair of names is obtained
				System.out.print("\nPlease enter your name (Lastname, Firstname seperated by comma): "); //printing the message
				String name=keyboard.next(); //storing the name in a string variable
				if (name.contains(",") && !name.startsWith(",") && !name.endsWith(",")) { //setting a condition for the comma to be at the desired position
					nameList=name.split(","); //assuring there is a comma in the output
					if(nameList.length == 2) { //checking if there are only two elements to stop the loop
						condition1=true;
					}	
				}
			} 
			String id=""; //declaring the ID variable
			while (!condition2){ //repeating the statement until a valid ID number is obtained
				System.out.print("\nPlease enter your ID without any spaces (7 digits): "); //printing the message
				id=keyboard.next(); //storing the ID 
				if (id.length()==7) {//imposing the condition of a 7 digits ID to stop the loop and move on to the next one
					condition2=true;	
				}
			}
			double score;
			while (!condition3) { //repeating the statements until a valid score is obtained
				System.out.print("\nPlease enter your score (0-100): ");
				score=keyboard.nextDouble();
				if (score >= 0 && score <= 100) { //imposing the condition for the score to be between 0 and 100
					condition3=true;
					System.out.print("\n"+nameList[1]+" "+nameList[0]+" got "+score+".");
					System.out.print("\n\nBased on the grading system, "+nameList[1]+" ("+id+") will probably get ");
					if (score >= 80) { //associating the letter grade and the comment made corresponding to the score obtained
						System.out.print("A! Congratulations!");
					}
					else if (score >= 70){
						System.out.print("B! You are so close to A!");
					}
					else if (score >= 60){
						System.out.print("C! You can do better by more practice!");
					}
					else if (score < 60){
						System.out.print("FNS! Please work harder to pass the course!");
					}
					String choice;
					System.out.print("\n\nExit the program?(enter Yes to exit): "); //asking the user if he or she wishes to leave the program
					choice=keyboard.next();
					if (choice.equalsIgnoreCase("Yes")){ //stopping the loop if they want to exit
						condition0=true;
					}	
				}		
			}
		}
		System.out.print("\nThank you for using Grading System Program!"); //printing the closing message
	}
}

