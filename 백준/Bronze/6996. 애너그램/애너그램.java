import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[] alphabets = new int['z' + 1];
		char[] A, B;
		boolean isNotAnagram;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			alphabets = new int['z' + 1];
			A = st.nextToken().toCharArray();
			sb.append(A).append(" & ");
			for (int i = 0; i < A.length; i++)
				++alphabets[A[i]];
			B = st.nextToken().toCharArray();
			for (int i = 0; i < B.length; i++)
				--alphabets[B[i]];
			sb.append(B).append(" are ");
			isNotAnagram = false;
			for (int i = 'a'; i <= 'z'; i++) {
				if (alphabets[i] != 0) {
					sb.append("NOT anagrams.\n");
					isNotAnagram = true;
					break;
				}
			}
			if (isNotAnagram)
				continue;
			sb.append("anagrams.\n");
		}
		System.out.print(sb);
	}
}