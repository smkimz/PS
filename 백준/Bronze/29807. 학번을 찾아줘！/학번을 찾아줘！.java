import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), diff, ans = 0;
		int[] scores = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			scores[i] = Integer.parseInt(st.nextToken());
		diff = scores[0] - scores[2];
		if (diff > 0)
			ans += diff * 508;
		else
			ans += -diff * 108;
		diff = scores[1] - scores[3];
		if (diff > 0)
			ans += diff * 212;
		else
			ans += -diff * 305;
		ans += scores[4] * 707;
		System.out.println(ans * 4763);
	}
}
