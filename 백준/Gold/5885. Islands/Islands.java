import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	static class Field implements Comparable<Field> {
		int num, height;

		public Field(int num, int height) {
			this.num = num;
			this.height = height;
		}

		@Override
		public int compareTo(Field o) {
			return Integer.compare(o.height, this.height);
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0, max = 0;
		boolean[] isField = new boolean[N + 2];
		PriorityQueue<Field> pq = new PriorityQueue<>();
		for (int i = 1; i <= N; i++)
			pq.add(new Field(i, Integer.parseInt(br.readLine())));
		Field f;
		while (!pq.isEmpty()) {
			f = pq.poll();
			isField[f.num] = true;
			if (isField[f.num - 1] && isField[f.num + 1])
				--count;
			else if (!isField[f.num - 1] && !isField[f.num + 1])
				++count;
			max = Math.max(max, count);
		}
		System.out.println(max);
	}
}