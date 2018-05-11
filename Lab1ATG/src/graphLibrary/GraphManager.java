package graphLibrary;

import javax.swing.event.InternalFrameEvent;
import java.util.*;
import java.util.stream.Collectors;

public class GraphManager {

    Graph graph;

    public GraphManager(){

    }

    public void readGraph(String path) {

    }

    public void readWeightedGraph(String path) {

    }

    public int getVertexNumber(Graph graph) {
        return graph.getVertices().size();
    }

    public int getEdgeNumber(Graph graph) {
        return graph.getEdges().size();
    }

    public float getMeanEdge(Graph graph) {
        return 0;
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

    public String scc(Graph graph) {
        return null;
    }

    public String shortestPath(Vertex v1, Vertex v2) {
        return null;
    }

    public String mst(Graph graph) {
        return null;
    }
}
