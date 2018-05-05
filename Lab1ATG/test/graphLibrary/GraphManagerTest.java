package graphLibrary;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.*;

public class GraphManagerTest {
    String basePath = new File("src/graphLibrary/data.txt").getAbsolutePath();
    Graph graph1;
    Graph graph2;

    @Before
    public void createGraphs(){
        try {
            graph1 = GraphReader.readGraph(basePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        graph2 = new Graph();
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        graph2.addVertex(v1);
        graph2.addVertex(v2);
        graph2.addVertex(v3);
        graph2.addVertex(v4);
        graph2.addEdge(new Edge(v1, v2));
        graph2.addEdge(new Edge(v1, v3));
        graph2.addEdge(new Edge(v2, v4));
    }

    @Test
    public void bfs() {
        String outputGraph1V1 = "1 -- 0\n" +
                "2 - 1 1\n" +
                "5 - 1 1\n" +
                "3 - 2 5\n" +
                "4 - 2 5\n";
        String outputGraph2V1 = "1 -- 0\n" +
                "2 - 1 1\n" +
                "3 - 1 1\n" +
                "4 - 2 2\n";

        Assert.assertEquals(GraphManager.bfs(graph1, new Vertex(1)), outputGraph1V1);
        Assert.assertEquals(GraphManager.bfs(graph2, new Vertex(1)), outputGraph2V1);
    }
}