import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		int N = Integer.parseInt(br.readLine()), val, maxVal = 0;
		String book = "", maxBookName = "-";
		while (--N >= 0) {
			book = br.readLine();
			if (hm.getOrDefault(book, -1) == -1)
				hm.put(book, 1);
			else
				hm.put(book, hm.get(book) + 1);
			val = hm.get(book);
			if (val == maxVal) {
				if (maxBookName != "-" && book.compareTo(maxBookName) >= 0)
					continue;
				maxBookName = book;
			} else if (val > maxVal) {
				maxBookName = book;
				maxVal = val;
			}
		}
		System.out.print(maxBookName);
	}
}