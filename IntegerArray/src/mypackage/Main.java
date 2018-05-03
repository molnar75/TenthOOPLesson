package mypackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		int n = 5;
		int[] integerArray = new int[n];
		
		try {
			integerArray=getNumbers(n);
		} catch (Exception e) {

		}
		
		/*Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<n; i++){
			System.out.println("Please enter the " + (i+1) + ". number: ");
			numb = scanner.nextLine();
			number = Integer.parseInt(numb);
			integerArray[i] = number;
		}*/
		
		for(int i = 0; i<n; i++){
			System.out.println("The  " + (i+1) + ". number is : " + integerArray[i]);
		}
		
		

	}
	
	public static int[] getNumbers(int n) throws InputMismatchException{
		int[] integerArray = new int[n];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i<n; i++){
			System.out.println("Please enter the " + (i+1) + ". number: ");
			int number = scan.nextInt();
			if(number <= 0){
				throw new InputMismatchException("The number can't be equals or lower than 0");
			}
			
			integerArray[i] = number;
		}
		scan.close();
		return integerArray;
	}

}
