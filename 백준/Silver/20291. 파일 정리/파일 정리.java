import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        Map<String, Integer> extensionCount = new TreeMap<>();
        
        for (int i = 0; i < N; i++) {
            String file = br.readLine();
            String extension = getExtension(file);
            
            extensionCount.put(extension, extensionCount.getOrDefault(extension, 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : extensionCount.entrySet()) {
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append('\n');
        }
        
        System.out.print(sb);
    }
    
    private static String getExtension(String fileName) {
        int dotIndex = fileName.lastIndexOf('.');
        return fileName.substring(dotIndex + 1);
    }
}
