package DSA_Vault_2k25.src.randomCodes;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * Code to generate a certain size Integer array of random numbers in a sorted manner...
 * @author Aritra
 *
 */
public class RandomSortedArray {
	
	public static void main (String [] args) {
		int [] arr = new int[200];
		Random random = new Random();
		
		for(int i =0 ; i <arr.length;i++) {
			arr[i]=random.nextInt(1000);
		}
		Arrays.sort(arr);
		System.out.println("SORTED ARRAY: "+Arrays.toString(arr));
	}

}
