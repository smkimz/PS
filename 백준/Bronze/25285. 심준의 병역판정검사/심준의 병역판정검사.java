import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), grade;
		double height, weight, bmi;
		StringTokenizer st;
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			height = Double.parseDouble(st.nextToken()) / 100.0;
			weight = Double.parseDouble(st.nextToken());
			bmi = weight / Math.pow(height, 2);
			if (height < 1.401)
				grade = 6;
			else if (height < 1.46)
				grade = 5;
			else if (height < 1.59)
				grade = 4;
			else if (height < 1.61) {
				if (bmi >= 16.0 && bmi < 35.0)
					grade = 3;
				else
					grade = 4;
			} else if (height < 2.04) {
				if (bmi >= 20.0 && bmi < 25.0)
					grade = 1;
				else if ((bmi >= 18.5 && bmi < 20.0) || (bmi >= 25.0 && bmi < 30.0))
					grade = 2;
				else if ((bmi >= 16.0 && bmi < 18.5) || (bmi >= 30.0 && bmi < 35.0))
					grade = 3;
				else
					grade = 4;
			} else
				grade = 4;
			sb.append(grade).append("\n");
		}
		System.out.print(sb);
	}
}