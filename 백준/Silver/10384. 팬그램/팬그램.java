import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), min;
		int[] checker;
		char[] input;
		String[] output = { "Not a pangram", "Pangram!", "Double pangram!!", "Triple pangram!!!" };
		for (int i = 1; i <= N; i++) {
			input = br.readLine().toCharArray();
			checker = new int[128];
			min = 3;
			for (int j = 0; j < input.length; j++)
				checker[input[j]]++;
			for (int j = 0; j < 26; j++)
				min = Math.min(min, checker[j + 'a'] + checker[j + 'A']);
			sb.append("Case ").append(i).append(": ").append(output[min]).append("\n");
		}
		System.out.println(sb);
	}
}
