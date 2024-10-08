import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	static char[][] str;
	static int[] table;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str = new char[2][];
		str[0] = br.readLine().toCharArray();
		str[1] = br.readLine().toCharArray();
		kmp();
	}

	static void kmp() {
		int idx = 0, ans = 0;
		makeTable();
		for (int i = 0; i < str[0].length; i++) {
			while (idx >= 1 && str[0][i] != str[1][idx])
				idx = table[idx - 1];
			if (str[0][i] == str[1][idx]) {
				if (idx == str[1].length - 1) {
					++ans;
					idx = 0;
				} else
					++idx;
			}
		}
		System.out.println(ans);
	}

	static void makeTable() {
		int idx = 0;
		table = new int[str[1].length];
		for (int i = 1; i < str[1].length; i++) {
			while (idx >= 1 && str[1][i] != str[1][idx])
				idx = table[idx - 1];
			if (str[1][i] == str[1][idx])
				table[i] = ++idx;
		}
	}
}