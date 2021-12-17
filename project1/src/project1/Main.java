/*
 * Conley Ratzlaff
 * CIS219
 * Tu Th 3:30
 */


package project1;

import java.util.Arrays;

public class Main {
	//Creates the array names number
	static int[] number = new int[20];
	
	public static void main(String[] args) {
		//Generates random number for array
		for(int i = 0 ; i < number.length; i++) {
			number[i] = (int) (Math.random() * 30 + 1);
			//loops through array and checks for duplicates
			for(int j = 0 ; j < i; j++ ) {
				if(number[i] == number[j]) {
					i--;
					break;
				}	
			}
		}
	
		
		System.out.println(Arrays.toString(number));
	}	
	}


