import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer stA, stB;
		HashMap<String, Integer> students = new HashMap<>();
		PriorityQueue<Record> records = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine()), time, lastIndex = 0;
		int[] times = new int[N];
		String name;
		Record record;

		while (--N >= 0) {
			stA = new StringTokenizer(br.readLine());
			stB = new StringTokenizer(stA.nextToken(), ":");
			time = Integer.parseInt(stB.nextToken()) * 60 + Integer.parseInt(stB.nextToken());
			name = stA.nextToken();
			if (!students.containsKey(name)) {
				times[lastIndex] = time;
				students.put(name, lastIndex++);
			} else
				times[students.get(name)] += time;
		}

		students.forEach((k, v) -> {
			int cost = 10;
			if (times[v] > 100) {
				cost += ((times[v] - 100) / 50) * 3;
				if (times[v] % 50 != 0)
					cost += 3;
			}
			records.add(new Record(k, cost));
		});

		while (!records.isEmpty()) {
			record = records.poll();
			sb.append(record.name).append(" ").append(record.cost).append("\n");
		}
		System.out.print(sb);
	}

	static class Record implements Comparable<Record> {
		String name;
		int cost;

		public Record(String name, int cost) {
			this.name = name;
			this.cost = cost;
		}

		@Override
		public int compareTo(Record o) {
			if (this.cost == o.cost)
				return this.name.compareTo(o.name);
			return Integer.compare(o.cost, this.cost);
		}
	}
}