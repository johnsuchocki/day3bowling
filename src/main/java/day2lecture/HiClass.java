package day2lecture;

import java.util.Scanner;

public class HiClass {
	
	public static void main(String[] args) {
		
		String whoAmITalkingTo = null;
		
		Scanner inputHiClass = new Scanner(System.in);
		
		System.out.println("Hello World");  //Sysout MUST be used within a method
		
		whoAmITalkingTo = inputHiClass.nextLine();
		
		System.out.println("Hello " + whoAmITalkingTo);
		
		inputHiClass.close();
		
	}
	
	float[] manyFloats = new float[5];  //This creates an array of floats
	                                    //Arrays in Java are STATICALLY SIZED; ArrayLists are not
	int[] manyInts = {1, 50, 93, 21, 5};
	
	int b = manyInts[3];
	
	private void checkDivisibleByThree() {
		//This method will check a number for divisibility by 3
	}

}
