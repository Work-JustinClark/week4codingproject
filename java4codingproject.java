package week4project;

import java.util.Arrays;
import java.util.Random;

public class java4codingproject {

	public static void main(String[] args) {
		// Subtract the value of the first element in the array from the value in the last element.
		int ages[] = {3,9,23,64,2,8,28,93};
		int firstMinusLast = ages[ages.length -1] - ages[0];
		System.out.println(firstMinusLast);
		
		//New array - longer than first in order to show elements are dynamic
		
		int ages2[] = {10,5,88,23,1,15,9,87,7};
		int firstMinusLast2 = ages2[ages2.length -1] - ages2[0];
		System.out.println(ages2[8]);
		
		//Loop to iterate through the array and show average age
		int sum = 0;
		for (int age:ages2) {
			sum += age;
		}
		int average = sum / ages2.length;
		System.out.println(average);
		
		//String Array of names
		
		String[] names = {"Sam", "Tommay", "Tim", "Sally", "Buck", "Bob"};
		
		//Loop to iterate though and calculate average number of letters per name.
		
		int nameSum = 0;
		for (String name: names) {
			nameSum += name.length();
		}
		int averageNameLength = nameSum / names.length;
		System.out.println(averageNameLength);
		
		//Loop to concatenate all names together.
		String resultNames = "";
		for (String name: names) {
			resultNames += name + "";			
		}
		System.out.println(resultNames);
		
		// Question 3 - How do you access the first element of any Array?
		// array.length - 1 - see Line 9 and 15 for examples.
		
		// Question 4 - How do you access the first element of any array?
		// Array name [0] - see lines 9 and 15 for examples.
		
		//new names array to create a loop that will iterate over names above to create new names array 
		//and add length of each name to it.
		
		int nameLengths[] = new int [names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		//Sysout to test to see if it worked
		//System.out.println(Arrays.toString(nameLengths));
		int lengthSum = 0;
		for (int length : nameLengths) {
			lengthSum += length;
		}
		System.out.println(lengthSum);
		
		//Method to concatenate a word n number of times
		
		System.out.println(methodRepeatName("Hello", 4));
		
		//Method to take first and last name and put them together.
		
		System.out.println(fullName("Justin", "Clark"));
		
		//boolean statement to test method totalSum using ages array
		System.out.println(totalSum(ages));
		
		//boolean and double to see if we are buying drinks
		System.out.println(willBuyDrink(true, 10.0));
		System.out.println(willBuyDrink(true, 12.0));
		
		//Showing random number generator from 1-100
		int randomNumber = randomNumberGen();
		System.out.println("Random Number: " + randomNumber);
		
	}
	
	// Method that takes a string, word, and an int, n, and returns the word concatenated to itself n number
	//of times.
	
	public static String methodRepeatName (String word, int n) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < n; i++) {
			result.append(word);
		}
		return result.toString();
	}
	
	//Method to take first and last name and put them together. 
	public static String fullName (String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;			
	}
	
	//Method that takes an array of int and returns true if the sum is more than 100.
	public static boolean totalSum (int[] array) {
		int sum = 0;
		for (int number : array) {
			sum += number;
		}
		return sum > 100;
	} 
	//Method that will take an array of double and return the average of all the elements
	public static double averageDouble (double[] array) {
		double sum = 0.0;
		for (double number : array) {
			sum+= number;
		} 
				return sum / array.length;
	}
	//Method for a boolean statement to determine if we are buying drinks if it's summer and we have the cash.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && moneyInPocket > 10.50) {
			return true;
		}else {
			return false;
		}
	}
	//Method to roll random numbers from 1-100 in case you can't make choices and need to roll for it.
	public static int randomNumberGen () {
		Random random = new Random();
		return random.nextInt(100) + 1;
	}
}
 