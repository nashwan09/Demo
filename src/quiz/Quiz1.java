package quiz;

import java.util.Scanner;

//Question 1. 

public class Quiz1 {

	public static void main(String[] args) {

		int firstnumber = 84;
		int secondnumber = 35;
		int addition = firstnumber + secondnumber;
		System.out.println("Sum of two numbers= " + addition);

		int number1 = 50;
		int number2 = 3;
		int division = number1 / number2;
		System.out.println("Division of two numbers= " + division);

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number =");
		int num1 = input.nextInt();
		System.out.println("Enter 2nd number =");
		int num2 = input.nextInt();
		System.out.println("Multiplication of two numbers =" + num1 * num2);
	}

}
