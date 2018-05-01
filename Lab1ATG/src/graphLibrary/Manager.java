package graphLibrary;

public interface Manager {

    void readGraph(String path);

    void readWeightedGraph(String path);

    int getVertexNumber(Graph graph);

    int getEdgeNumber(Graph graph);

    float getMeanEdge(Graph graph);

    String graphRepresentation (Graph graph, String type);

    String bfs(Graph graph, Vertex v);

    String dfs(Graph graph, Vertex v);

    String scc(Graph graph);

    String shortestPath(Vertex v1, Vertex v2);

    String mst(Graph graph);

}
