package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		
		int num_types_food = scan.nextInt();
		
		String[] name_arr = new String[num_types_food];
		double[] price_arr = new double[num_types_food];
		int [] quantity_arr = new int[num_types_food];
		int [] shopper_quantity_arr = new int[num_types_food];
		
		/* for (int i = 0; i < num_types_food; i++) {
			quantity_arr[i] = 0;
			shopper_quantity_arr[i] = 0;
		} */
		
		for (int i = 0; i < num_types_food; i++ ) {
			name_arr[i] = scan.next();
			
			price_arr[i] = scan.nextDouble();
			
		}
		
		
		int num_shoppers = scan.nextInt();
		String[] shopper_first_arr = new String[num_shoppers];
		String[] shopper_last_arr = new String[num_shoppers];
		
		for (int i = 0; i < num_shoppers; i++ ) {
			
			shopper_first_arr[i] = scan.next();
			shopper_last_arr[i] = scan.next();
			// int [] test_shopper_quantity_arr = new int[num_types_food];
			
			
			// for (int u = 0; u < num_types_food; u++) {
				// test_shopper_quantity_arr[i] = shopper_quantity_arr[i];
			// }
			
			int shopper_list_count = scan.nextInt();
			String[] person_shop_list = new String[shopper_list_count];
			
			for (int u = 0; u < shopper_list_count; u++) {
				
				int new_quantity = scan.nextInt();
				
				String food_name = scan.next();
				person_shop_list[u] = food_name;
				
				for (int count = 0; count < num_types_food; count++) {
					if (food_name.equals(name_arr[count])) {
						quantity_arr[count] += new_quantity;
					}
				}
			}
			
			
			Arrays.parallelSort(person_shop_list);
			
			String[] new_person_shop_list = new String[person_shop_list.length];
			int t = 1;
			
			new_person_shop_list[0] = person_shop_list[0];
			for (int u = 1; u < person_shop_list.length; u++) {
				if (person_shop_list[u].equals(person_shop_list[u-1])) {
					int b = 1;
				} else {
					new_person_shop_list[t] = person_shop_list[u];
					t++;
				}
				
			}
			
			
			int u = 0;
			while (u < new_person_shop_list.length) {
				for (int count = 0; count < num_types_food; count++) {
					if (new_person_shop_list[u] != null && new_person_shop_list[u].equals(name_arr[count])) {
						shopper_quantity_arr[count] += 1;

					}
	
				}
				u++;
			}
			
	
		}
		
		for (int i = 0; i < num_types_food; i++) {
			if (shopper_quantity_arr[i] < .001) {
				System.out.println("No customers bought " + name_arr[i]);
			} else {
				System.out.println(shopper_quantity_arr[i] + " customers bought " + quantity_arr[i] + " " + name_arr[i]);
			}
		}
		
	}
	
	/* static String[] consolidateArr(String[] vals) {
		String[] newArr = new String[vals.length] ;
		Arrays.sort(vals);
		for (int i = 0; i < vals.length; i++) {
			if (!vals[i].equals(vals[i - 1])) {
				newArr[newArr.length] = vals[i];
			}
		}
		System.out.println(newArr[0] + newArr[1] + newArr[2] + "butts");
		return newArr;
	} */
}
