import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(), x;
		int N = Integer.parseInt(br.readLine()), kbs1 = 0, kbs2 = 0;
		String c;
		for (int i = 0; i < N; i++) {
			c = br.readLine();
			if (c.equals("KBS1"))
				kbs1 = i;
			else if (c.equals("KBS2"))
				kbs2 = i;
		}
		if (kbs1 < kbs2)
			--kbs2;
		x = new StringBuilder();
		for (int i = 0; i < kbs1; i++) {
			sb.append(1);
			x.append('4');
		}
		sb.append(x);
		x = new StringBuilder();
		for (int i = 0; i < kbs2; i++) {
			sb.append(1);
			x.append('4');
		}
		sb.append(1).append(x);
		System.out.println(sb);
	}
}