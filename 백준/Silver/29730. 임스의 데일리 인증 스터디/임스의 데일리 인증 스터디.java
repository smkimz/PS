import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Study> studies = new PriorityQueue<>(), baekjoons = new PriorityQueue<>();
		String study;
		while (--N >= 0) {
			study = br.readLine();
			if (study.startsWith("boj.kr/"))
				baekjoons.add(new Study(study));
			else
				studies.add(new Study(study));
		}
		while (!studies.isEmpty())
			sb.append(studies.poll().study).append("\n");
		while (!baekjoons.isEmpty())
			sb.append(baekjoons.poll().study).append("\n");
		System.out.print(sb);
	}

	static class Study implements Comparable<Study> {
		String study;

		public Study(String study) {
			this.study = study;
		}

		@Override
		public int compareTo(Study o) {
			if (this.study.length() == o.study.length())
				return this.study.compareTo(o.study);
			return Integer.compare(this.study.length(), o.study.length());
		}
	}
}