import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = (int) Math.ceil(Math.sqrt(Double.parseDouble(br.readLine())));
		String wall = "x", field = "x";
		for (int i = 0; i < N; i++) {
			wall += 'x';
			field += '.';
		}
		wall += "x\n";
		field += "x\n";
		bw.write(wall);
		for (int i = 0; i < N; i++)
			bw.write(field);
		bw.write(wall);
		bw.flush();
		bw.close();
	}
}