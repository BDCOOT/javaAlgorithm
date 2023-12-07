import java.io.*;
import java.util.Deque;
import java.util.LinkedList;


public class Main {
    static int N;
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        Deque<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        Integer top=0;
        while (queue.size() != 1) {
            queue.poll();
            top = queue.poll();
            queue.add(top);
        }

        System.out.println(queue.peek()); //top 출력하면 오류 남

    }
}
