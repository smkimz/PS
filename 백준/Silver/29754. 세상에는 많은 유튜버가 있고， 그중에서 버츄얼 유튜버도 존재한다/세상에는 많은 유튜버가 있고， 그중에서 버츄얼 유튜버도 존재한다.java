import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), day, week, min, num,
				vtuberCount = 0;
		int[][] countArr = new int[M / 7][100], timeArr = new int[M / 7][100];
		String[] vtuberNames = new String[100], time;
		HashMap<String, Integer> vtubers = new HashMap<>();
		String name;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			day = Integer.parseInt(st.nextToken());
			week = (day - 1) / 7;
			min = 0;
			time = st.nextToken().split(":");
			min -= Integer.valueOf(time[0]) * 60 + Integer.valueOf(time[1]);
			time = st.nextToken().split(":");
			min += Integer.valueOf(time[0]) * 60 + Integer.valueOf(time[1]);
			if (vtubers.containsKey(name))
				num = vtubers.get(name);
			else {
				num = vtuberCount++;
				vtubers.put(name, num);
				vtuberNames[num] = name;
			}
			++countArr[week][num];
			timeArr[week][num] += min;
		}
		boolean[] isFalseVtuber = new boolean[vtuberCount];
		TreeSet<String> trueVtubers = new TreeSet<>();
		for (int i = 0; i < M / 7; i++) {
			for (int j = 0; j < vtuberCount; j++) {
				if (isFalseVtuber[j])
					continue;
				if (countArr[i][j] < 5 || timeArr[i][j] < 3600)
					isFalseVtuber[j] = true;
			}
		}
		for (int i = 0; i < vtuberCount; i++) {
			if (isFalseVtuber[i])
				continue;
			trueVtubers.add(vtuberNames[i]);
		}
		if (trueVtubers.size() == 0) {
			System.out.print(-1);
			return;
		}
		while (!trueVtubers.isEmpty())
			sb.append(trueVtubers.pollFirst()).append("\n");
		System.out.print(sb);
	}
}