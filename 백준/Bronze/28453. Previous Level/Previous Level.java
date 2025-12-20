import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] lvls = new int[301];
		Arrays.fill(lvls, 4);
		for (int i = 250; i <= 274; i++)
			lvls[i] = 3;
		for (int i = 275; i <= 299; i++)
			lvls[i] = 2;
		lvls[300] = 1;
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0)
			sb.append(lvls[Integer.parseInt(st.nextToken())]).append(' ');
		System.out.println(sb);
	}
}
