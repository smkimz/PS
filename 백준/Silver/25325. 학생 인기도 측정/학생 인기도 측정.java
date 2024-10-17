import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		HashMap<String, Integer> students = new HashMap<>();
		PriorityQueue<Student> pqueue = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		String name;
		String[] names = new String[N];
		Student student;
		for (int i = 0; i < N; i++) {
			names[i] = st.nextToken();
			students.put(names[i], 0);
		}
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				name = st.nextToken();
				students.put(name, students.get(name) + 1);
			}
		}
		for (int i = 0; i < names.length; i++)
			pqueue.add(new Student(names[i], students.get(names[i])));
		while (!pqueue.isEmpty()) {
			student = pqueue.poll();
			sb.append(student.name).append(" ").append(student.popularity).append("\n");
		}
		System.out.print(sb);
	}

	static class Student implements Comparable<Student> {
		String name;
		int popularity;

		public Student(String name, int popularity) {
			this.name = name;
			this.popularity = popularity;
		}

		@Override
		public int compareTo(Student o) {
			if (this.popularity == o.popularity)
				return this.name.compareTo(o.name);
			return Integer.compare(o.popularity, this.popularity);
		}
	}
}