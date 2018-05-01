package graphLibrary;

public class GraphManager implements Manager {

    @Override
    public void readGraph(String path) {

    }

    @Override
    public void readWeightedGraph(String path) {

    }

    @Override
    public int getVertexNumber(Graph graph) {
        return 0;
    }

    @Override
    public int getEdgeNumber(Graph graph) {
        return 0;
    }

    @Override
    public float getMeanEdge(Graph graph) {
        return 0;
    }

    @Override
    public String graphRepresentation(Graph graph, String type) {
        return null;
    }

    @Override
    public String bfs(Graph graph, Vertex v) {
        return null;
    }

    @Override
    public String dfs(Graph graph, Vertex v) {
        return null;
    }

    @Override
    public String scc(Graph graph) {
        return null;
    }

    @Override
    public String shortestPath(Vertex v1, Vertex v2) {
        return null;
    }

    @Override
    public String mst(Graph graph) {
        return null;
    }
}
