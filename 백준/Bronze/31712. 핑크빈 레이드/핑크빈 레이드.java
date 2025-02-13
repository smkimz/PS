import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int[] cooltime = new int[3], damage = new int[3];
		PriorityQueue<Skill> skillQueue = new PriorityQueue<>();
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			cooltime[i] = Integer.parseInt(st.nextToken());
			damage[i] = Integer.parseInt(st.nextToken());
			skillQueue.add(new Skill(i, 0));
		}
		int pinkbeanHP = Integer.parseInt(br.readLine()), time = 0;
		Skill s;
		while (pinkbeanHP > 0) {
			s = skillQueue.poll();
			pinkbeanHP -= damage[s.mascot];
			skillQueue.add(new Skill(s.mascot, s.time + cooltime[s.mascot]));
			time = s.time;
		}
		System.out.println(time);
	}

	static class Skill implements Comparable<Skill> {
		int mascot, time;

		public Skill(int mascot, int time) {
			this.mascot = mascot;
			this.time = time;
		}

		@Override
		public int compareTo(Skill o) {
			return Integer.compare(this.time, o.time);
		}
	}
}