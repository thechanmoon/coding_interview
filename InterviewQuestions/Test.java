public class Test {
    public static void main(String[] args) {
        // Queue<Integer> q = new Queue<Integer>();
        // q.enqueue(1);
        // q.enqueue(2);
        // q.enqueue(3);
        // q.enqueue(4);
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.peek());
        // System.out.println(q.dequeue());
        // System.out.println(q.isEmpty());
        // System.out.println(q.dequeue());
        // System.out.println(q.isEmpty());
        /*
         * 0 / 1 -- 3 7 | / | \/ | / | 5 2 -- 4 \ 6 - 8
         */
        Graph g = new Graph(9);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 8);
        // g.dfs(); // 0 1 3 5 7 6 8 4 2
        // g.bfs(); // 0 1 2 3 4 5 6 7 8
        // g.dfs_recursive(); //0 1 2 4 3 5 6 8 7
        g.dfs_recursive(3); // 3 1 0 2 4 5 6 8 7
    }
}