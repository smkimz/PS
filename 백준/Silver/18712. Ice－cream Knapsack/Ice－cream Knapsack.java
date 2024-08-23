import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static class IceCream implements Comparable<IceCream> {
		long calorie, happiness;

		public IceCream(long calorie, long happiness) {
			this.calorie = calorie;
			this.happiness = happiness;
		}

		@Override
		public int compareTo(IceCream o) {
			if (Long.compare(this.calorie, o.calorie) == 0)
				return Long.compare(o.happiness, this.happiness);
			return Long.compare(this.calorie, o.calorie);
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer stA, stB;
		PriorityQueue<IceCream> iceCreamQueue;
		PriorityQueue<Long> happinessQueue;
		int T = Integer.parseInt(br.readLine()), N, K, count;
		long totalHappiness, maxCalorie;
		IceCream i = null;
		while (--T >= 0) {
			iceCreamQueue = new PriorityQueue<>();
			happinessQueue = new PriorityQueue<>();
			count = 0;
			totalHappiness = 0;
			stA = new StringTokenizer(br.readLine());
			N = Integer.parseInt(stA.nextToken());
			K = Integer.parseInt(stA.nextToken());
			stA = new StringTokenizer(br.readLine());
			stB = new StringTokenizer(br.readLine());
			while (--N >= 0)
				iceCreamQueue.add(new IceCream(Long.parseLong(stA.nextToken()), Long.parseLong(stB.nextToken())));
			while (count < K) {
				i = iceCreamQueue.poll();
				happinessQueue.add(i.happiness);
				totalHappiness += i.happiness;
				++count;
			}
			maxCalorie = i.calorie;
			while (!iceCreamQueue.isEmpty() && iceCreamQueue.peek().calorie == maxCalorie) {
				i = iceCreamQueue.poll();
				happinessQueue.add(i.happiness);
				totalHappiness += i.happiness;
			}
			while (happinessQueue.size() > K)
				totalHappiness -= happinessQueue.poll();
			sb.append(maxCalorie).append(" ").append(totalHappiness).append("\n");
		}
		System.out.print(sb);
	}
}