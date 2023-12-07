import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int basket = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        int[] arr = new int[basket];

        for (int i = 0; i < basket; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i <cnt; i++) {
            int tmp;
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            tmp = arr[first-1];
            arr[first-1] = arr[second-1];
            arr[second-1] = tmp;
        }
        br.close();

        for (int number : arr)
            System.out.print(number + " ");
    }
}