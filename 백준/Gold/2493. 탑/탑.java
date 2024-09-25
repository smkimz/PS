import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;


public class Main {
	static class Tower {
		int num, height;

		public Tower(int num, int height) {
			this.num = num;
			this.height = height;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		ArrayDeque<Tower>[] stack = new ArrayDeque[2];
		for (int i = 0; i <= 1; i++)
			stack[i] = new ArrayDeque<Tower>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			stack[0].push(new Tower(i, Integer.parseInt(st.nextToken())));
		int[] ans = new int[N + 1];
		Tower tower;
		while (!stack[0].isEmpty()) {
			if (stack[1].isEmpty())
				stack[1].push(stack[0].pop());
			else {
				while (!stack[1].isEmpty() && stack[0].peek().height > stack[1].peek().height) {
					tower = stack[1].pop();
					ans[tower.num] = stack[0].peek().num;
				}
				stack[1].push(stack[0].pop());
			}
		}

		for (int i = 1; i <= N; i++)
			sb.append(ans[i]).append(" ");
		System.out.println(sb);
	}
}