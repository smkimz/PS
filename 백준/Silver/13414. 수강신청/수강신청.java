import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken());
		String student;
		HashMap<String, Integer> students = new HashMap<>();
		for (int i = 0; i < L; i++) {
			student = br.readLine();
			students.put(student, i);
		}
		ArrayList<String> keySet = new ArrayList<>(students.keySet());
		keySet.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return students.get(o1).compareTo(students.get(o2));
			}
		});
		for (String key : keySet) {
			sb.append(key).append("\n");
			if (--K <= 0)
				break;
		}
		System.out.print(sb);
	}
}