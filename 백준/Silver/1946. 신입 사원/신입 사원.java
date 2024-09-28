import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static class Employee implements Comparable<Employee> {
		int A, B;

		public Employee(int a, int b) {
			A = a;
			B = b;
		}

		@Override
		public int compareTo(Main.Employee o) {
			return Integer.compare(this.A, o.A);
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N, R, ans;
		StringTokenizer st;
		PriorityQueue<Employee> employees;
		Employee employee;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			R = 100000;
			ans = 0;
			employees = new PriorityQueue<>();
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				employees.add(new Employee(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
			}
			while (--N >= 0) {
				employee = employees.poll();
				if (employee.B > R)
					continue;
				++ans;
				R = Math.min(R, employee.B);
			}
			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}