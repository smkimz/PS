import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] str = br.readLine().toCharArray(), vowel = new char[] { 'a', 'e', 'i', 'o', 'u' };
		int[] count = new int[128];
		int x = 0;
		for (int i = 0; i < str.length; i++)
			++count[str[i]];
		for (int i = 0; i < 5; i++)
			x += count[vowel[i]];
		sb.append(x).append(" ");
		x += count['y'];
		sb.append(x);
		System.out.println(sb);
	}
}