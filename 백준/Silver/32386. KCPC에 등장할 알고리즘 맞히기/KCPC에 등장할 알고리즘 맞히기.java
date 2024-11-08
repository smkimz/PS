import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), t, count, maxCount = 0;
		String tag, maxCountTag = "-1";
		HashMap<String, Integer> tagCount = new HashMap<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			t = Integer.parseInt(st.nextToken());
			while (--t >= 0) {
				tag = st.nextToken();
				if (tagCount.containsKey(tag)) {
					count = tagCount.put(tag, tagCount.get(tag) + 1);
					++count;
				} else {
					tagCount.put(tag, 1);
					count = 1;
				}
				if (count < maxCount)
					continue;
				else if (count > maxCount) {
					maxCount = count;
					maxCountTag = tag;
				} else
					maxCountTag = "-1";
			}
		}
		System.out.println(maxCountTag);
	}
}