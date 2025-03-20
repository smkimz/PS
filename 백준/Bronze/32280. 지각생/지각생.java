import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) + 1;
		StringTokenizer st;
		String[] x;
		int time, timeLimit = 0, ans = 0;
		ArrayDeque<Integer> entryTime = new ArrayDeque<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			x = st.nextToken().split(":");
			time = Integer.parseInt(x[0]) * 60 + Integer.parseInt(x[1]);
			if (st.nextToken().charAt(0) == 't')
				timeLimit = time;
			else
				entryTime.add(time);
		}
		x = br.readLine().split(":");
		time = Integer.parseInt(x[0]) * 60 + Integer.parseInt(x[1]);
		if (time > timeLimit)
			timeLimit = time;
		while (!entryTime.isEmpty()) {
			if (entryTime.poll() >= timeLimit)
				++ans;
		}
		System.out.println(ans);
	}
}