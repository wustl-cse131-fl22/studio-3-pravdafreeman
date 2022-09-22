package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Pick a number for which would you like to find all the primes between 1 and that number:");
		int n = in.nextInt();
		while (n < 2) {
			System.out.println("Your number must be greater than 1. Please choose a different number.");
			n = in.nextInt();
		}
		int[] primes = new int[n];
		for (int i = 0; i < primes.length; i++)
		{
		    primes[i] = i+1;
		}
		primes[0] = 0;
		for (int i = 0; i < Math.sqrt(n); i++){
			if (primes[i] != 0 ) {
				for (int j = i+1; j < (primes.length); j++) {
					if (primes[j]%primes[i] == 0) {
						primes[j] = 0;
					}
					
				}
			}
		}
		System.out.println("The prime numbers up to and including " + n + " are:");
		for (int i = 0; i < primes.length; i++)
		{
		    if (primes[i] != 0) {
		    	System.out.println(  primes[i] );
		    }
		}
	}

}
