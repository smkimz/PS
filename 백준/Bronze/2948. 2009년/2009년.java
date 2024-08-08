import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] days = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };
		String[] names = { "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday" };
		System.out.println(names[(Integer.parseInt(st.nextToken()) + days[Integer.parseInt(st.nextToken()) - 1]) % 7]);
	}
}