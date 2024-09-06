import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> soldBooks = new HashMap<String, Integer>();
		int N = Integer.parseInt(br.readLine()), soldCount, maxSoldCount = 0;
		String bookName, maxBookName = "";
		while (--N >= 0) {
			bookName = br.readLine();
			soldBooks.put(bookName, soldBooks.getOrDefault(bookName, 0) + 1);
			soldCount = soldBooks.get(bookName);
			if (soldCount < maxSoldCount || (soldCount == maxSoldCount && bookName.compareTo(maxBookName) >= 0))
				continue;
			maxBookName = bookName;
			maxSoldCount = soldCount;
		}
		System.out.print(maxBookName);
	}
}