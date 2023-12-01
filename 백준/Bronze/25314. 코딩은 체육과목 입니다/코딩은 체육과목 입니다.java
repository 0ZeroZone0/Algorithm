import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());

		String text = "long ".repeat(num/4);
		
		System.out.println(text+"int");
	}
}