import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> personChecker = new HashMap<Integer, Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= 4; i++)
			personChecker.put(Integer.parseInt(st.nextToken()), i);
		st = new StringTokenizer(br.readLine());
		System.out.println(personChecker.getOrDefault(Integer.parseInt(st.nextToken()), 0));
	}
}
