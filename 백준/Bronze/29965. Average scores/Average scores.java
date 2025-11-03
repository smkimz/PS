import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cM = 0, cJ = 0;
		double s, sM = 0, sJ = 0;
		char p;
		StringTokenizer st;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			p = st.nextToken().charAt(0);
			s = Double.parseDouble(st.nextToken());
			if (p == 'M') {
				sM += s;
				++cM;
			} else {
				sJ += s;
				++cJ;
			}
		}
		if (cM > 0)
			sM /= cM;
		if (cJ > 0)
			sJ /= cJ;
		if (sM == sJ)
			System.out.println('V');
		else
			System.out.println(sM > sJ ? 'M' : 'J');
	}
}
