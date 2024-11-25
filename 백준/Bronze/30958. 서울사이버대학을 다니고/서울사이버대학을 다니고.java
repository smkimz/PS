import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = 0;
		char[] song = br.readLine().toCharArray();
		int[] count = new int[128];
		for (int i = 0; i < N; i++)
			++count[song[i]];
		for (int i = 'a'; i <= 'z'; i++)
			max = Math.max(max, count[i]);
		System.out.println(max);
	}
}