import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N, score = Integer.MAX_VALUE;
	static int[][] distance;
	static ArrayList<Integer>[] friends;
	static ArrayDeque<Integer> candidates = new ArrayDeque<>();

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		friends = new ArrayList[N + 1];
		distance = new int[N + 1][N + 1];
		for (int i = 1; i <= N; i++) {
			friends[i] = new ArrayList<>();
			Arrays.fill(distance[i], -1);
		}
		int x, y;
		while (true) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			if (x == -1 && y == -1)
				break;
			friends[x].add(y);
			friends[y].add(x);
		}
		for (int i = 1; i <= N; i++)
			searchFriends(i);
		sb.append(score - 1).append(" ").append(candidates.size()).append("\n");
		while (!candidates.isEmpty())
			sb.append(candidates.poll()).append(" ");
		System.out.print(sb);
	}

	static void searchFriends(int start) {
		ArrayDeque<Friend> queue = new ArrayDeque<>();
		queue.add(new Friend(start, 0));
		distance[start][start] = 0;
		int nextDist = 0;
		Friend friend;
		while (!queue.isEmpty()) {
			friend = queue.poll();
			nextDist = friend.dist + 1;
			if (nextDist > score)
				return;
			for (int i : friends[friend.num]) {
				if (distance[start][i] != -1)
					continue;
				queue.add(new Friend(i, nextDist));
				distance[start][i] = nextDist;
			}
		}
		if (nextDist <= score) {
			if (nextDist < score)
				candidates.clear();
			candidates.add(start);
			score = nextDist;
		}
	}

	static class Friend {
		int num, dist;

		public Friend(int num, int dist) {
			this.num = num;
			this.dist = dist;
		}
	}
}