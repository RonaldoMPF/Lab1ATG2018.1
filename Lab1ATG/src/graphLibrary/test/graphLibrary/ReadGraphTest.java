package graphLibrary.test.graphLibrary;



import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import graphLibrary.Edge;
import graphLibrary.Graph;
import graphLibrary.GraphReader;
import graphLibrary.Vertex;

public class ReadGraphTest {
    String basePath = new File("/Lab1ATG2018.1/Lab1ATG/src/graphLibrary/data.txt").getAbsolutePath();
    Graph graphRead;
    Graph graphTest;

    @Before
    public void createGraphs(){
        try {
            graphRead = GraphReader.readGraph(basePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        graphTest =  new Graph();
        
        Vertex<Integer> v1 = new Vertex<Integer>(1);
        Vertex<Integer> v2 = new Vertex<Integer>(2);
        Vertex<Integer> v3 = new Vertex<Integer>(3);
        Vertex<Integer> v4 = new Vertex<Integer>(4);
        Vertex<Integer> v5 = new Vertex<Integer>(5);
        
        graphTest.addVertex(v1);
        graphTest.addVertex(v2);
        graphTest.addVertex(v3);
        graphTest.addVertex(v4);
        graphTest.addVertex(v5);
        
        Edge edge12 = new Edge(v1, v2);
        Edge edge21 = new Edge(v2, v1);
        
        Edge edge15 = new Edge(v1, v5);
        Edge edge51 = new Edge(v5, v1); 
        
        Edge edge25 = new Edge(v2, v5);
        Edge edge52 = new Edge(v5, v2);
        
        Edge edge35 = new Edge(v3, v5);
        Edge edge53 = new Edge(v5, v3);
        
        Edge edge54 = new Edge(v5, v4);
        Edge edge45 = new Edge(v4, v5);
        
        graphTest.addEdge(edge12);
        graphTest.addEdge(edge21);
        
        graphTest.addEdge(edge15);
        graphTest.addEdge(edge51);
        
        graphTest.addEdge(edge25);
        graphTest.addEdge(edge52);
        
        graphTest.addEdge(edge35);
        graphTest.addEdge(edge53);
        
        graphTest.addEdge(edge45);
        graphTest.addEdge(edge54);
        
        
     
    }
    
    @Test
    public void TestEqualityGraph() {
    	assertEquals(graphRead, graphTest);
    	assertNotEquals(graphRead, null);
    	assertNotEquals(graphRead, new Graph());
    	
    }

    
}