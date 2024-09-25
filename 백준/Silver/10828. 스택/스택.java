import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] orderNames = { "push", "pop", "size", "empty", "top" };
		HashMap<String, Integer> orders = new HashMap<>();
		for (int i = 0; i < orderNames.length; i++)
			orders.put(orderNames[i], i);
		StringTokenizer st;
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine()), order;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			order = orders.get(st.nextToken());
			switch (order) {
			case 0:
				stack.add(Integer.parseInt(st.nextToken()));
				break;
			case 1:
				if (!stack.isEmpty())
					sb.append(stack.pollLast());
				else
					sb.append(-1);
				sb.append("\n");
				break;
			case 2:
				sb.append(stack.size()).append("\n");
				break;
			case 3:
				if (!stack.isEmpty())
					sb.append(0);
				else
					sb.append(1);
				sb.append("\n");
				break;
			case 4:
				if (!stack.isEmpty())
					sb.append(stack.peekLast());
				else
					sb.append(-1);
				sb.append("\n");
				break;
			default:
				break;
			}
		}
		System.out.print(sb);
	}
}