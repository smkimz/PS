import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), A, B, C, price, totalCal, ans;
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(br.readLine());
		price = A;
		totalCal = C;
		ans = totalCal / price;
		ArrayList<Integer> toppings = new ArrayList<>();
		for (int i = 0; i < N; i++)
			toppings.add(Integer.parseInt(br.readLine()));
		Collections.sort(toppings, Comparator.reverseOrder());
		for (int i = 0; i < N; i++) {
			price += B;
			totalCal += toppings.get(i);
			ans = Math.max(ans, totalCal / price);
		}
		System.out.println(ans);
	}
}