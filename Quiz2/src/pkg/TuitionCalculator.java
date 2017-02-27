/* Diego Guzman 
 * 
 * Calculates your total cost of tuition for 4 years
 */

package pkg;

import java.util.Scanner;

public class TuitionCalculator{
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the cost of your initial tuition?");
		double T = input.nextDouble();
		double Total = T;
		
		System.out.println("What is the increase in rate?");
		double R = input.nextDouble()/100;
		
		for (int year = 1; year < 4; year++) {
			T = Math.pow(T, (1 + R));
			Total += T;
		}
		
		System.out.printf("Your total tuition of four years is: $%.2f", Total);
		
		}
	}
