import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] clubNames = new String[] { "PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON",
				"ALMIGHTY" };
		int N = Integer.parseInt(br.readLine()), sol, max = 0, adminClub = -1;
		StringTokenizer st;
		for (int i = 0; i < clubNames.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				sol = Integer.parseInt(st.nextToken());
				if (sol < max)
					continue;
				adminClub = i;
				max = sol;
			}
		}
		System.out.println(clubNames[adminClub]);
	}
}
