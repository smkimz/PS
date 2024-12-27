import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] f = new char[128];
		f['S'] = 0;
		f['C'] = 1;
		f['2'] = 2;
		f['A'] = 3;
		String[] s = new String[4];
		s[0] = "HIGHSCHOOL";
		s[1] = "MASTER";
		s[2] = "0611";
		s[3] = "CONTEST";
		System.out.println(s[f[br.readLine().charAt(0)]]);
	}
}