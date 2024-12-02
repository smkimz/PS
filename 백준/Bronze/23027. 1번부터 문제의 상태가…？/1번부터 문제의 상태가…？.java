import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] S = br.readLine().toCharArray();
		boolean[] checker = new boolean[128];
		char[] alphabets = new char[128];
		for (int i = 0; i < S.length; i++)
			checker[S[i]] = true;
		if (checker['A'] || checker['B'] || checker['C']) {
			for (int i = 'A'; i <= 'Z'; i++)
				alphabets[i] = (char) i;
			if (checker['A']) {
				alphabets['B'] = 'A';
				alphabets['C'] = 'A';
				alphabets['D'] = 'A';
				alphabets['F'] = 'A';
			} else if (checker['B']) {
				alphabets['C'] = 'B';
				alphabets['D'] = 'B';
				alphabets['F'] = 'B';
			} else if (checker['C']) {
				alphabets['D'] = 'C';
				alphabets['F'] = 'C';
			}
		} else {
			for (int i = 'A'; i <= 'Z'; i++)
				alphabets[i] = 'A';
		}
		for (int i = 0; i < S.length; i++)
			sb.append(alphabets[S[i]]);
		System.out.print(sb);
	}
}