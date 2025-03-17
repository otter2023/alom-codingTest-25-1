import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < num; i++) {
            String command = br.readLine();

            if (command.startsWith("push")) {
                queue.add(Integer.parseInt(command.substring(5))); /
            } else if (command.equals("pop")) {
                sb.append(queue.isEmpty() ? "-1\n" : queue.poll() + "\n");
            } else if (command.equals("size")) {
                sb.append(queue.size() + "\n");
            } else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? "1\n" : "0\n");
            } else if (command.equals("front")) {
                sb.append(queue.isEmpty() ? "-1\n" : queue.peek() + "\n");
            } else if (command.equals("back")) {
                sb.append(queue.isEmpty() ? "-1\n" : ((LinkedList<Integer>) queue).getLast() + "\n");
            }
        }

        bw.write(sb.toString()); // 한 번에 출력
        bw.flush();
        br.close();
        bw.close();
    }
}