import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }

        int[] parent = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();

            for (int next : graph[curr]) {
                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = curr;
                    queue.add(next);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            sb.append(parent[i]).append("\n");
        }
        System.out.println(sb);
    }
}