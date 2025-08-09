import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashSet<Integer> set = new HashSet<>();
		int N = Integer.parseInt(br.readLine()), M;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0)
			set.add(Integer.parseInt(st.nextToken()));
		M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while (--M >= 0)
			sb.append(set.contains(Integer.parseInt(st.nextToken())) ? 1 : 0).append(' ');
		System.out.print(sb);
	}
}