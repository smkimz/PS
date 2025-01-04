import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] team = null;
		int[] A = new int[128], C;
		for (int i = 'a'; i <= 'z'; i++)
			A[i] = 1;
		for (int i = 'A'; i <= 'Z'; i++)
			A[i] = 2;
		for (int i = '0'; i <= '9'; i++)
			A[i] = 3;
		while (--N >= 0) {
			team = br.readLine().toCharArray();
			if (team.length > 10)
				continue;
			C = new int[4];
			for (int i = 0; i < team.length; i++)
				++C[A[team[i]]];
			if (C[1] < C[2] || C[3] == team.length)
				continue;
			break;
		}
		System.out.println(String.valueOf(team));
	}
}