public interface Graph {
    void addVertex(String label);
    boolean addEdge(String startLabel, String secondLabel, String others[], int... weightEdg);
    boolean addEdge(String startLabel, String secondLabel, int weightEdg);

    int getEdge(String startLabel, String secondLabel);
    int getSize();
    void display();

    /**
     * англ. Depth-first search, DFS
     */
    void dfs(String startLabel);

    int shortDistanceCount(String startLabel, String endLabel);
}
