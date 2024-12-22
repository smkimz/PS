import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), K, student, x;
		HashMap<Integer, Integer> students = new HashMap<>();
		HashSet<Integer> checkedStudents = new HashSet<>();
		while (--N >= 0) {
			K = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			while (--K >= 0) {
				student = Integer.parseInt(st.nextToken());
				if (checkedStudents.contains(student))
					continue;
				x = students.getOrDefault(student, 0);
				if (x + 1 >= M) {
					checkedStudents.add(student);
					continue;
				}
				students.put(student, x + 1);
			}
		}
		System.out.println(checkedStudents.size());
	}
}