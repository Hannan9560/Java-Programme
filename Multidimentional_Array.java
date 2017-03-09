package Second_Class;

import java.util.Scanner;

public class Multidimentional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, total_0 = 0, total_1 = 0, total_2 = 0;

		int[][] array = new int[3][3];
		Scanner input = new Scanner(System.in);

		// Input User
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextInt();
			}
		}

		for (i = 0; i < array.length; i++) {
			if (i == 0) {
				for (j = 0; j < array[i].length; j++) {
					total_0 = total_0 + array[i][j];
				}
			} else if (i == 1) {
				for (j = 0; j < array[i].length; j++) {
					total_1 = total_1 + array[i][j];
				}
			} else if (i == 2) {
				for (j = 0; j < array[i].length; j++) {
					total_2 = total_2 + array[i][j];
				}
			}

			// System.out.println();
		}

		// Print Array
		for (i = 0; i < array.length; i++) {
			for (j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\n" + total_0 + " " + total_1 + " " + total_2);

		if ((total_0 == total_1) && (total_0 == total_2)
				&& (total_1 == total_2)) {
			System.out.println("Right");
		} else {
			System.out.println("Wrong");

		}

		// Multidimention Array
		/*
		 * int [][] array = {{1,2,3},{4,5,6},{7,8,9,10}}; int i, j; for(i=0;
		 * i<array.length; i++) { for(j=0; j<array[i].length; j++) {
		 * System.out.print(array[i][j]+ " "); } System.out.println(); }
		 */

	}

}
