import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.Collections;
import java.util.PriorityQueue;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCases = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCases; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); 
            int m = Integer.parseInt(st.nextToken()); 

            Queue<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 문서의 중요도를 저장할 우선순위 큐

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int importance = Integer.parseInt(st.nextToken());
                queue.offer(new int[]{i, importance});
                priorityQueue.offer(importance);
            }

            int printOrder = 0; 

            while (!queue.isEmpty()) {
                int[] current = queue.poll();
 
                if (current[1] == priorityQueue.peek()) {
                    printOrder++;
                    priorityQueue.poll();
                    if (current[0] == m) {
                        sb.append(printOrder).append('\n');
                        break;
                    }
                } else {
                    queue.offer(current);
                }
            }
        }

        System.out.print(sb);
    }
}
