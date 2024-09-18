import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] num = br.readLine().toCharArray();
		int[] pows = { 4, 2, 1 };
		int len = num.length, idx = len % 3, val = 0;
		if (idx == 1)
			idx = 2;
		else if (idx == 2)
			idx = 1;
		for (int i = 0; i < len; i++) {
			if (num[i] == '1')
				val += pows[idx];
			if (++idx != 3)
				continue;
			sb.append(val);
			val = 0;
			idx = 0;
		}
		System.out.println(sb);
	}
}