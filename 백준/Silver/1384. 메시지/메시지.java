import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		class Message {
			int sender, receiver;

			public Message(int sender, int receiver) {
				this.sender = sender;
				this.receiver = receiver;
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		Deque<Message> dq = new ArrayDeque<>();
		Message m;
		String[] name;
		int N = Integer.parseInt(br.readLine()), group = 0;
		while (N > 0) {
			++group;
			name = new String[N];
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				name[i] = st.nextToken();
				for (int j = N - 1; j >= 1; j--) {
					if (st.nextToken().equals("P"))
						continue;
					dq.add(new Message((i + j) % N, i));
				}
			}
			sb.append("Group ").append(group).append("\n");
			if (!dq.isEmpty()) {
				while (!dq.isEmpty()) {
					m = dq.poll();
					sb.append(name[m.sender]).append(" was nasty about ").append(name[m.receiver]).append("\n");
				}
			} else
				sb.append("Nobody was nasty").append("\n");
			sb.append("\n");
			N = Integer.parseInt(br.readLine());
		}
		System.out.print(sb);
	}
}