package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FindPythagoreanTriplet {
	public static void main(String[] args) throws IOException {
		// code
		int t, n, temp;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(reader.readLine());
		boolean flag = false;
		while (t-- > 0) {
			n = Integer.parseInt(reader.readLine());
			flag = false;
			int[] lengths = new int[n];

			String[] input = reader.readLine().split(" ");
			HashMap<Integer, Integer> lengthMap = new HashMap<Integer, Integer>();
			lengthMap = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				temp = Integer.parseInt(input[i]);
				lengths[i] = temp * temp;
				lengthMap.put(lengths[i], i);
			}

			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (lengthMap.get(lengths[i] + lengths[j]) != null) {
						System.out.println("Yes");
						flag = true;
						break;
					}
				}
				if (flag) {
					break;
				}
			}
			if (flag == false) {
				System.out.println("No");
			}
		}
	}
}
