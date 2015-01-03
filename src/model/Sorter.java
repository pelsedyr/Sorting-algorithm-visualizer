package model;

/**
 * A class whith methods that sort and return a whole array directly.
 * Not suited for eventual animation or visualisation of sorting algoritms.
 * @author luke
 *
 */
public class Sorter {

	public static int[] bubbleSort(int[] data) {
		if (data == null)
			throw new IllegalArgumentException();
		if (data.length == 1)
			return data;
		else {
			boolean rerun = true;
			while (rerun) {
				rerun = false;
				for (int i = 1; i < data.length; i++) {
					int q = 0;
					if (data[i] < data[i - 1]) {
						q = data[i];
						data[i] = data[i - 1];
						data[i - 1] = q;
						rerun = true;
					}
				}
			}
		}
		return data;
	}
}
