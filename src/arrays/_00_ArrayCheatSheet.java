package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static Random r = new Random();

	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] strings = new String[5];
		// 2. print the third element in the array
		System.out.println(strings[2]);
		// 3. set the third element to a different value
		strings[2] = "different";
		// 4. print the third element again
		System.out.println(strings[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}

		// 6. make an array of 50 integers
		int[] integers = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < integers.length; i++) {
			integers[i] = r.nextInt(100);
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int smallest = 1000;

		for (int i = 0; i < integers.length; i++) {
			if ((integers[i]) < smallest) {
				smallest = integers[i];
			}
		}
		System.out.println("the smallest is " + smallest);
		// 9 print the entire array to see if step 8 was correct

		// 10. print the largest number in the array.
		int largest = -10;
		for (int i = 0; i < integers.length; i++) {
			if (integers[i] > largest) {
				largest = integers[i];
				System.out.println("the largest is " + largest);
			}

		}
		for (int i = 0; i < integers.length; i++) {
			System.out.println(integers[i]);
		}
	}
}
