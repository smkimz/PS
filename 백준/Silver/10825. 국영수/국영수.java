import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		class Student implements Comparable<Student> {
			int kor, eng, math;
			String name;

			public Student(int kor, int eng, int math, String name) {
				this.kor = kor;
				this.eng = eng;
				this.math = math;
				this.name = name;
			}

			@Override
			public int compareTo(Student o) {
				if (this.kor != o.kor)
					return Integer.compare(o.kor, this.kor);
				if (this.eng != o.eng)
					return Integer.compare(this.eng, o.eng);
				if (this.math != o.math)
					return Integer.compare(o.math, this.math);
				return this.name.compareTo(o.name);
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		PriorityQueue<Student> pq = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine());
		int[] score = new int[3];
		String name;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			for (int i = 0; i < 3; i++)
				score[i] = Integer.parseInt(st.nextToken());
			pq.add(new Student(score[0], score[1], score[2], name));
		}
		while (!pq.isEmpty())
			sb.append(pq.poll().name).append("\n");
		System.out.print(sb);
	}
}