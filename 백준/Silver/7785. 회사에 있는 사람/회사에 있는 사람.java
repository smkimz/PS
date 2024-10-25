import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		TreeSet<String> persons = new TreeSet<>();
		int N = Integer.parseInt(br.readLine());
		String name;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			if (st.nextToken().charAt(0) == 'l')
				persons.remove(name);
			else
				persons.add(name);
		}
		while (!persons.isEmpty())
			sb.append(persons.pollLast()).append("\n");
		System.out.print(sb);
	}
}