import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		long midX, midY, distance = 0;
		ArrayList<Integer> X = new ArrayList<>(), Y = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			X.add(Integer.parseInt(st.nextToken()));
			Y.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(X);
		Collections.sort(Y);
		midX = X.get(N / 2);
		midY = Y.get(N / 2);
		for (int i = 0; i < N; i++)
			distance += Math.abs(X.get(i) - midX) + Math.abs(Y.get(i) - midY);
		System.out.println(distance);
	}
}