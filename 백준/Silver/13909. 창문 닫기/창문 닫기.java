import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), left = 0, right = 45825, mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (Math.pow(mid, 2) > N)
				right = mid - 1;
			else
				left = mid + 1;
		}
		System.out.println(left - 1);
	}
}