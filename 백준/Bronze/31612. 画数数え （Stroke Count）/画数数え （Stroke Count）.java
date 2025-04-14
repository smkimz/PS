import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		char[] S = br.readLine().toCharArray();
		int[] alphabets = new int[128];
		alphabets['j'] = 2;
		alphabets['o'] = 1;
		alphabets['i'] = 2;
		for (int i = 0; i < N; i++)
			ans += alphabets[S[i]];
		System.out.println(ans);
	}
}