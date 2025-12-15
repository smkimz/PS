import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = br.readLine().charAt(0) - 'A';
		String[] schools = new String[26];
		schools['B' - 'A'] = "Branksome Hall Asia";
		schools['K' - 'A'] = "Korea International School";
		schools['N' - 'A'] = "North London Collegiate School";
		schools['S' - 'A'] = "St. Johnsbury Academy";
		System.out.println(schools[N]);
	}
}
