import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static class Jewel {
		int weight, value;

		public Jewel(int weight, int value) {
			this.weight = weight;
			this.value = value;
		}
	}

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

		PriorityQueue<Jewel> jewels = new PriorityQueue<>(new Comparator<Jewel>() {
			@Override
			public int compare(Jewel o1, Jewel o2) {
				return Integer.compare(o1.weight, o2.weight);
			}
		});

		PriorityQueue<Jewel> bag = new PriorityQueue<>(new Comparator<Jewel>() {
			@Override
			public int compare(Jewel o1, Jewel o2) {
				return Integer.compare(o2.value, o1.value);
			}
		});

		PriorityQueue<Integer> bags = new PriorityQueue<>();

		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			jewels.add(new Jewel(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
		}

		while (--K >= 0)
			bags.add(Integer.parseInt(br.readLine()));

		int limit;
		long ans = 0;
		while (!bags.isEmpty()) {
			limit = bags.poll();
			while (!jewels.isEmpty() && jewels.peek().weight <= limit)
				bag.add(jewels.poll());
			if (!bag.isEmpty())
				ans += bag.poll().value;
		}

		System.out.println(ans);
	}
}