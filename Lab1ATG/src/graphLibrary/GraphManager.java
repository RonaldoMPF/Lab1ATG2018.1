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


    /**
     *Implements a Breadth-First Search in graph starting in vertex v
     *
     * @param graph
     * @param v
     * @return String with a BFS Tree
     */
    public static String bfs(Graph graph, Vertex v) {
        Map<Vertex, Integer> visited = new HashMap<>();
        Queue<Vertex> queue = new LinkedList<>();
        Set<Vertex> completed = new HashSet<>();
        String result = "";

        ((LinkedList<Vertex>) queue).addFirst(v);

        Integer level = 0;

        while (! queue.isEmpty()){
            Vertex head = ((LinkedList<Vertex>) queue).removeFirst();
            if (! visited.containsKey(head)){
                result += head.getData()+" -- "+ level+"\n";
            }
            visited.putIfAbsent(head, level);

            for (Vertex adj : graph.getAdjVertices(head)){
                if (!visited.containsKey(adj)){
                    result += adj.getData()+" - "+(visited.get(head)+1)+" "+head.getData()+"\n";
                }
                visited.putIfAbsent(adj, visited.get(head) + 1);
                if (!completed.contains(adj)) {
                    ((LinkedList<Vertex>) queue).addFirst(adj);
                }
            }
            completed.add(head);
        }

        return result;
    }

    public String dfs(Graph graph, Vertex v) {
        return null;
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
