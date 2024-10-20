import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken()), fruit;
		st = new StringTokenizer(br.readLine());
		PriorityQueue<Integer> fruits = new PriorityQueue<>();
		while (--N >= 0)
			fruits.add(Integer.parseInt(st.nextToken()));
		while (!fruits.isEmpty()) {
			fruit = fruits.poll();
			if (fruit > L)
				break;
			++L;
		}
		System.out.println(L);
	}
}