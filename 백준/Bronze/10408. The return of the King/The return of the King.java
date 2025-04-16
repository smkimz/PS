import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] S = br.readLine().toCharArray();
		int totalScore = 0, students = 0;
		for (int i = 0; i < S.length; i++) {
			if (S[i] == '0')
				totalScore += 9;
			else {
				totalScore += S[i] - '0';
				++students;
			}
		}
		System.out.println(String.format("%.2f", Math.round(totalScore / (students * 1.0) * 100.0) / 100.0));
	}
}