import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	static class Element {
		char element;
		int order;

		public Element(char element, int order) {
			this.element = element;
			this.order = order;
		}
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Element> deque = new ArrayDeque<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		Element first, last, element;
		char func;
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			func = st.nextToken().charAt(0);
			if (func == '3') {
				if (deque.isEmpty())
					continue;
				first = deque.peekFirst();
				last = deque.peekLast();
				if (first.order > last.order)
					deque.pollFirst();
				else
					deque.pollLast();
				continue;
			}
			element = new Element(st.nextToken().charAt(0), i);
			if (func == '2')
				deque.addFirst(element);
			else
				deque.addLast(element);
		}

		if (deque.isEmpty()) {
			System.out.println(0);
			return;
		}

		while (!deque.isEmpty())
			sb.append(deque.poll().element);
		System.out.print(sb);
	}
}