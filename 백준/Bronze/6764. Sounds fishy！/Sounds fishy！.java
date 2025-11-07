import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] fish = new int[4];
		for (int i = 0; i < 4; i++)
			fish[i] = Integer.parseInt(br.readLine());
		if (fish[0] < fish[1] && fish[1] < fish[2] && fish[2] < fish[3])
			System.out.println("Fish Rising");
		else if (fish[0] > fish[1] && fish[1] > fish[2] && fish[2] > fish[3])
			System.out.println("Fish Diving");
		else if (fish[0] == fish[1] && fish[1] == fish[2] && fish[2] == fish[3])
			System.out.println("Fish At Constant Depth");
		else
			System.out.println("No Fish");
	}
}
