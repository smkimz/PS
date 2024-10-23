import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ans = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> students = new ArrayList<>();
		for (int i = 0; i < N; i++)
			students.add(Integer.parseInt(st.nextToken()));
		Collections.sort(students);
		for (int i = 0; i < N; i++) {
			++ans;
			i += students.get(i) - 1;
		}
		System.out.println(ans);
	}
}