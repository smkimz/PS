import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] holeCount = new int[] { 1, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				index = new int[128];
		for (int i = 'A'; i <= 'Z'; i++)
			index[i] = i - 'A';
		index[' '] = 26;
		int T = Integer.parseInt(br.readLine()), count;
		char[] str;
		while (--T >= 0) {
			count = 0;
			str = br.readLine().toCharArray();
			for (int i = 0; i < str.length; i++)
				count += holeCount[index[str[i]]];
			sb.append(count).append("\n");
		}
		System.out.print(sb);
	}
}