import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] nums = new String[N];
		for (int i = 0; i < N; i++)
			nums[i] = br.readLine();
		int M = nums[0].length();
		HashMap<String, Boolean> hm;
		String num;
		p: for (int i = 1; i <= M; i++) {
			hm = new HashMap<String, Boolean>();
			for (int j = 0; j < N; j++) {
				num = nums[j].substring(M - i, M);
				if (hm.getOrDefault(num, false))
					continue p;
				hm.put(num, true);
			}
			System.out.println(i);
			return;
		}
	}
}