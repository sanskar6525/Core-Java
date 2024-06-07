package GeneralCodes;

import java.util.ArrayList;
import java.util.Collections;

public class MaxSwap {
	

		// Driver Function
		public static void main(String[] args)
		{
			// Input String
			String str = "7596801";

			// Function call
			Max_number(str);
		}

		// Method to print maximum possible number
		public static void Max_number(String str)
		{

			// N stores the length of String
			int N = str.length();

			// Array to store digits of String
			int[] digits = new int[N];

			// Loop for initializing digits of String into
			// digits[]
			for (int i = 0; i < N; i++) {
				digits[i]
					= (Integer.parseInt("" + str.charAt(i)));
			}

			// ArrayList to store consecutive windows of same
			// parity
			ArrayList<ArrayList<Integer> > list
				= new ArrayList<>();

			// Left End of the window
			int left = 0;

			// Two pointer algorithm to find window of same
			// parity consecutive elements
			while (left < N) {
				// Right end of window
				int right = left;
				// temporary ArrayList to store the window
				ArrayList<Integer> temp = new ArrayList<>();
				// Incrementing right End to find the window of
				// same parity elements
				while (right < (N - 1)
					&& (digits[right]) % 2
							== (digits[right + 1]) % 2) {
					// Adding elements into temp ArrayList
					temp.add(digits[right]);
					right++;
				}
				// Adding last element of window
				temp.add(digits[right]);

				// Sorting temp into reverse order using inbuilt
				// Collections class
				temp.sort(Collections.reverseOrder());

				// Adding temp into list
				list.add(temp);

				// left End of nect window
				left = right + 1;
			}

			// Printing the elements from the list
			for (ArrayList<Integer> l : list) {
				for (Integer x : l) {
					System.out.print(x);
				}
			}
		}
}
	


