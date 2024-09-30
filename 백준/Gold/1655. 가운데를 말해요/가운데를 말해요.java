import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), v;
		PriorityQueue<Integer> leftQueue = new PriorityQueue<>(Collections.reverseOrder()),
				rightQueue = new PriorityQueue<Integer>();
		leftQueue.add(Integer.parseInt(br.readLine()));
		sb.append(leftQueue.peek()).append("\n");
		if (N == 1) {
			System.out.print(sb);
			return;
		}
		rightQueue.add(Integer.parseInt(br.readLine()));
		if (leftQueue.peek() > rightQueue.peek()) {
			rightQueue.add(leftQueue.poll());
			leftQueue.add(rightQueue.poll());
		}
		sb.append(leftQueue.peek()).append("\n");
		N -= 2;
		while (--N >= 0) {
			v = Integer.parseInt(br.readLine());
			if (v > rightQueue.peek()) {
				if (leftQueue.size() <= rightQueue.size())
					leftQueue.add(rightQueue.poll());
				rightQueue.add(v);
			} else if (v < leftQueue.peek()) {
				if (leftQueue.size() > rightQueue.size())
					rightQueue.add(leftQueue.poll());
				leftQueue.add(v);
			} else {
				if (leftQueue.size() <= rightQueue.size())
					leftQueue.add(v);
				else
					rightQueue.add(v);
			}
			sb.append(leftQueue.peek()).append("\n");
		}
		System.out.print(sb);
	}
}