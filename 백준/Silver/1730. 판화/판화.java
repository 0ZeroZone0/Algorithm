import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int boardSize = Integer.parseInt(reader.readLine());  // 보드의 크기
        String commands = reader.readLine();  // 명령어들

        // 보드 초기화
        char[][] board = new char[boardSize][boardSize];
        for (char[] row : board)
            Arrays.fill(row, '.');

        int currentX = 0, currentY = 0;  // 현재 위치를 나타내는 변수

        // 명령어를 하나씩 처리
        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);

            switch (command) {
                case 'D':  // 아래로 이동
                    if (currentX < boardSize - 1) {
                        updateVertical(board, currentX, currentY);  // 이동 전 상태 업데이트
                        currentX++;
                        updateVertical(board, currentX, currentY);  // 이동 후 상태 업데이트
                    }
                    break;
                case 'U':  // 위로 이동
                    if (currentX > 0) {
                        updateVertical(board, currentX, currentY);
                        currentX--;
                        updateVertical(board, currentX, currentY);
                    }
                    break;
                case 'L':  // 왼쪽으로 이동
                    if (currentY > 0) {
                        updateHorizontal(board, currentX, currentY);
                        currentY--;
                        updateHorizontal(board, currentX, currentY);
                    }
                    break;
                case 'R':  // 오른쪽으로 이동
                    if (currentY < boardSize - 1) {
                        updateHorizontal(board, currentX, currentY);
                        currentY++;
                        updateHorizontal(board, currentX, currentY);
                    }
                    break;
            }
        }

        // 결과 출력
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    // 수직 이동에 따른 보드 업데이트
    private static void updateVertical(char[][] board, int x, int y) {
        if (board[x][y] == '.')
            board[x][y] = '|';
        else if (board[x][y] == '-')
            board[x][y] = '+';
    }

    // 수평 이동에 따른 보드 업데이트
    private static void updateHorizontal(char[][] board, int x, int y) {
        if (board[x][y] == '.')
            board[x][y] = '-';
        else if (board[x][y] == '|')
            board[x][y] = '+';
    }
}
