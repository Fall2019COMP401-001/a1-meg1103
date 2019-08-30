package a1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");

		// Your code follows here.
		
		int num_types_food = scan.nextInt();
		
		String[] name_arr = new String[num_types_food];
		double[] price_arr = new double[num_types_food];
		
		for (int i = 0; i < num_types_food; i++ ) {
			name_arr[i] = scan.next();
			
			price_arr[i] = scan.nextDouble();
			
		}
		
		int num_shoppers = scan.nextInt();
		
		String[] shopper_first_arr = new String[num_shoppers];
		String[] shopper_last_arr = new String[num_shoppers];
		double[] shopper_total_arr = new double[num_shoppers];
		
		for (int i = 0; i < num_shoppers; i++) {
			
			shopper_first_arr[i] = scan.next();
			shopper_last_arr[i] = scan.next();
			
			int shopper_list_count = scan.nextInt();
			
			double total = 0;
			
			for (int u = 0; u < shopper_list_count; u++) {
				
				int num_items = scan.nextInt();
				
				String food_name = scan.next();
				
				for (int count = 0; count < num_types_food; count++) {
					
					double tiny_total = 0;
					
					if (food_name.equals(name_arr[count])) {
						
						tiny_total = price_arr[count];
						
					}
					
					total += (num_items * tiny_total);
					
				}
				
			
			
				
			}
			shopper_total_arr[i] = total;
			
			
		}
		
		int biggest_index = 0;
		
		for (int i = 0; i < num_shoppers; i++) {
			if (shopper_total_arr[i] > shopper_total_arr[biggest_index]) {
				biggest_index = i;
			}
		}
		
		double biggest_total = shopper_total_arr[biggest_index];
		
		if (Math.abs(biggest_total - Math.round(biggest_total)) == 0) {
			
			System.out.println("Biggest: " + shopper_first_arr[biggest_index] + " " + shopper_last_arr[biggest_index] + 
					" (" + df.format(biggest_total) + ".00)");	
			
		} else if (Math.abs((biggest_total * 10) - Math.round(biggest_total * 10)) == 0) {
			
			System.out.println("Biggest: " + shopper_first_arr[biggest_index] + " " + shopper_last_arr[biggest_index] + 
					" (" + df.format(biggest_total) + "0)");	
			
		} else {
			
			System.out.println("Biggest: " + shopper_first_arr[biggest_index] + " " + shopper_last_arr[biggest_index] + 
					" (" + df.format(biggest_total) + ")");	
			
		}
		
		
		int smallest_index = 0;
		
		for (int i = 0; i < num_shoppers; i++) {
			if (shopper_total_arr[i] < shopper_total_arr[smallest_index]) {
				smallest_index = i;
			}
		}
		
		double smallest_total = shopper_total_arr[smallest_index];
		
		if (Math.abs(smallest_total - Math.round(smallest_total)) == 0) {
			
			System.out.println("Smallest: " + shopper_first_arr[smallest_index] + " " + shopper_last_arr[smallest_index] + 
					" (" + df.format(smallest_total) + ".00)");	
			
		} else if (Math.abs((smallest_total * 10) - Math.round(smallest_total * 10)) == 0) {
			
			System.out.println("Smallest: " + shopper_first_arr[smallest_index] + " " + shopper_last_arr[smallest_index] + 
					" (" + df.format(smallest_total) + "0)");	
			
		} else {
			
			System.out.println("Smallest: " + shopper_first_arr[smallest_index] + " " + shopper_last_arr[smallest_index] + 
					" (" + df.format(smallest_total) + ")");
			
		}
		
		
		double total_spent = 0;
		
		for (int i = 0; i < num_shoppers; i++) {
			total_spent += shopper_total_arr[i];
		}
		double average = total_spent / num_shoppers;
		
		
		if (Math.abs(average - Math.round(average)) < .0001) {
			
			System.out.println("Average: " + df.format(average) + ".00");	
			
		} else if (Math.abs((average * 10) - Math.round(average * 10)) < 0.0001) {
			
			System.out.println("Average: " + df.format(average) + "0");	
			
		} else {
			
			System.out.println("Average: " + df.format(average));
			
		}
		
	}
}
