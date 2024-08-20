import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] dimensions = br.readLine().split(" ");
        int N = Integer.parseInt(dimensions[0]);
        int M = Integer.parseInt(dimensions[1]);

        boolean[] rowSecurity = new boolean[N];
        boolean[] colSecurity = new boolean[M];

        for (int i = 0; i < N; i++) {
            String row = br.readLine();
            for (int j = 0; j < M; j++) {
                if (row.charAt(j) == 'X') {
                    rowSecurity[i] = true;
                    colSecurity[j] = true;
                }
            }
        }

        int rowsWithoutSecurity = 0;
        int colsWithoutSecurity = 0;

        for (boolean row : rowSecurity) {
            if (!row) rowsWithoutSecurity++;
        }

        for (boolean col : colSecurity) {
            if (!col) colsWithoutSecurity++;
        }

        System.out.println(Math.max(rowsWithoutSecurity, colsWithoutSecurity));
    }
}
