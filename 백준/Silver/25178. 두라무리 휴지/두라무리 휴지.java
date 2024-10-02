import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int[] count = new int[128];
		char[] strA = br.readLine().toCharArray(), strB = br.readLine().toCharArray(), v = { 'a', 'e', 'i', 'o', 'u' };
		HashSet<Character> vowels = new HashSet<>();
		for (int i = 0; i < 5; i++)
			vowels.add(v[i]);
		ArrayDeque<Character> queueA = new ArrayDeque<>(), queueB = new ArrayDeque<>();
		if (strA[0] != strB[0] || strA[N - 1] != strB[N - 1]) {
			System.out.println("NO");
			return;
		}
		for (int i = 1; i < N - 1; i++) {
			++count[strA[i]];
			--count[strB[i]];
			if (!vowels.contains(strA[i]))
				queueA.add(strA[i]);
			if (!vowels.contains(strB[i]))
				queueB.add(strB[i]);
		}
		for (int i = 'a'; i <= 'z'; i++) {
			if (count[i] == 0)
				continue;
			System.out.println("NO");
			return;
		}
		while (!queueA.isEmpty() && !queueB.isEmpty()) {
			if (queueA.poll() == queueB.poll())
				continue;
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
	}
}