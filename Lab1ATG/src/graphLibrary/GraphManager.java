package graphLibrary;

import java.io.IOException;

public class GraphManager {

    Graph graph;

    public GraphManager(){

    }

    public Graph readGraph(String path) {
        try {
            return GraphReader.readGraph(path, false);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    public Graph readGraphWeighted(String path) {
        try {
            return GraphReader.readGraph(path, true);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getVertexNumber(Graph graph) {
        return graph.getVertexNumber();
    }

    public int getEdgeNumber(Graph graph) {
        return graph.getEdgeNumber();
    }

    public float getMeanEdge(Graph graph) {
        return graph.getMeanEdge();
    }

    public String graphRepresentation(Graph graph, String type) {
        if (type.equals("AM")) {
            return graph.graphRepresentation(Representation.AM);
        } else if (type.equals("AL")){
            return graph.graphRepresentation(Representation.AL);
        }
        return null;
    }

    public static String bfs(Graph graph, Vertex v){
        return graph.bfs(v);
    }

    public static String dfs(Graph graph, Vertex v){
        return graph.dfs(v);
    }

    public String shortestPath(Graph g, Vertex v1, Vertex v2) {
        return g.shortestPath(v1, v2);
    }

    public String mst(Graph graph) {
        return graph.mst();
    }
}
