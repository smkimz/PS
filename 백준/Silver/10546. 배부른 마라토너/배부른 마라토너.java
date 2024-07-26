import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] check = new int[N];
		String[] names = new String[N];
		String name;
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (int i = 0; i < N; i++) {
			name = br.readLine();
			if (hm.get(name) != null) {
				++check[hm.get(name)];
				continue;
			}
			hm.put(name, i);
			names[i] = name;
			++check[hm.get(name)];
		}
		for (int i = 0; i < N - 1; i++)
			--check[hm.get(br.readLine())];
		for (int i = 0; i < N; i++) {
			if (names[i] == null || check[i] == 0)
				continue;
			System.out.println(names[i]);
			return;
		}
	}
}