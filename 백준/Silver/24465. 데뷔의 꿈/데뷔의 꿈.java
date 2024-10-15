import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int[] months = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 },
				days = { 20, 19, 21, 20, 21, 22, 23, 23, 23, 23, 23, 22, 1 },
				constellations = { 12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] calender = new int[1232];
		int date, constellation = 0, N;
		boolean[] constellationChecker = new boolean[13];
		PriorityQueue<Integer> applicants = new PriorityQueue<>();

		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 31; j++) {
				date = i * 100 + j;
				if (i == months[constellation] && j == days[constellation])
					++constellation;
				calender[date] = constellations[constellation];
			}
		}

		for (int i = 0; i < 7; i++) {
			st = new StringTokenizer(br.readLine());
			date = Integer.parseInt(st.nextToken()) * 100 + Integer.parseInt(st.nextToken());
			constellationChecker[calender[date]] = true;
		}

		N = Integer.parseInt(br.readLine());

		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			date = Integer.parseInt(st.nextToken()) * 100 + Integer.parseInt(st.nextToken());
			if (constellationChecker[calender[date]])
				continue;
			applicants.add(date);
		}

		if (applicants.isEmpty()) {
			System.out.println("ALL FAILED");
			return;
		}

		while (!applicants.isEmpty()) {
			date = applicants.poll();
			sb.append(date / 100).append(" ").append(date % 100).append("\n");
		}

		System.out.print(sb);
	}
}