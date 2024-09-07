import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] orderNames = { "push_front", "push_back", "size", "empty", "pop_front", "pop_back", "front", "back" };
		HashMap<String, Integer> orders = new HashMap<>();
		for (int i = 0; i < orderNames.length; i++)
			orders.put(orderNames[i], i);
		Deque<Integer> deque = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int order, element;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			order = orders.get(st.nextToken());
			if (order <= 1) {
				element = Integer.parseInt(st.nextToken());
				if (order == 0)
					deque.addFirst(element);
				else
					deque.addLast(element);
				continue;
			}

			if (order <= 3) {
				if (order == 2)
					sb.append(deque.size());
				else
					sb.append(deque.isEmpty() ? 1 : 0);
				sb.append("\n");
				continue;
			}

			if (deque.isEmpty()) {
				sb.append(-1).append("\n");
				continue;
			}

			switch (order) {
			case 4:
				sb.append(deque.pollFirst());
				break;
			case 5:
				sb.append(deque.pollLast());
				break;
			case 6:
				sb.append(deque.peekFirst());
				break;
			case 7:
				sb.append(deque.peekLast());
				break;
			default:
				break;
			}
			sb.append("\n");
		}

		System.out.print(sb);
	}
}