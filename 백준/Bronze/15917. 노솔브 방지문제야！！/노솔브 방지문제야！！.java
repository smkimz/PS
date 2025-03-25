import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i <= 30; i++)
			set.add((int) Math.pow(2, i));
		int Q = Integer.parseInt(br.readLine()), a;
		while (--Q >= 0) {
			a = Integer.parseInt(br.readLine());
			sb.append(set.contains(a) ? 1 : 0).append("\n");
		}
		System.out.print(sb);
	}
}