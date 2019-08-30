package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// Reads in count of names and stored in name_count
		
		int name_count = scan.nextInt();
		
		for (int i = 0; i <= name_count; i++ ) {
			
			String first_name = scan.next(); 
			
			char[] first_name_arr = first_name.toCharArray();
			
			String first_init = first_name_arr[0] + ".";
			
			String last_name = scan.next();
			
			double total = 0; 
			
			int food_count = scan.nextInt();
			
			for (int u = 0; u < food_count; u++ ) {
				int amt = scan.nextInt();
				String food_name = scan.next();
				double price = scan.nextDouble() * amt;
				total += price; 
				
			}
			System.out.println(first_init + " " + last_name + ": " + total);
			
		}
		
		
		
	}
}
