import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken()),
				K = Integer.parseInt(st.nextToken()), x = 0;
		Employee employee;
		PriorityQueue<Employee> employees = new PriorityQueue<>();
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			employees.add(new Employee(st.nextToken(), Integer.parseInt(st.nextToken())));
		}
		while (D > 0 && K > 0) {
			employee = employees.poll();
			sb.append(employee.name).append(", YOU ARE FIRED!\n");
			D -= employee.salary;
			--K;
			++x;
		}
		if (D > 0)
			System.out.println("impossible");
		else {
			System.out.println(x);
			System.out.print(sb);
		}
	}

	static class Employee implements Comparable<Employee> {
		String name;
		int salary;

		public Employee(String name, int salary) {
			this.name = name;
			this.salary = salary;
		}

		@Override
		public int compareTo(Employee o) {
			return Integer.compare(o.salary, this.salary);
		}
	}
}