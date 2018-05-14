

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import graphLibrary.Edge;
import graphLibrary.Graph;
import graphLibrary.Vertex;

public class GraphTest {

    Vertex<Integer> v1;
    Vertex<Integer> v2;
    Vertex<Integer> v3;
    Vertex<Integer> v4;
    Vertex<Integer> v5;
    
    Edge edge12;
    Edge edge21;
    
    Edge edge15;
    Edge edge51;
    
    Edge edge25;
    Edge edge52;
    
    Edge edge35;
    Edge edge53;
    
    Edge edge54;
    Edge edge45;
    
    Object obj;
    Graph testGraph;
    
    Set<Vertex<Integer>> testSetVertex;

    @Before
    public void createGraphNotWeight (){
        
    	v1 = new Vertex<Integer>(1);
        v2 = new Vertex<Integer>(2);
        v3 = new Vertex<Integer>(3);
        v4 = new Vertex<Integer>(4);
        v5 = new Vertex<Integer>(5);
        
        obj = new Object();
        
        edge12 = new Edge(v1, v2);
        edge21 = new Edge(v2, v1);
        
        edge15 = new Edge(v1, v5);
        edge51 = new Edge(v5, v1); 
        
        edge25 = new Edge(v2, v5);
        edge52 = new Edge(v5, v2);
        
        edge35 = new Edge(v3, v5);
        edge53 = new Edge(v5, v3);
        
        edge54 = new Edge(v5, v4);
        edge45 = new Edge(v4, v5);
        
        
        
        testGraph = new Graph();
        
        testGraph.addVertex(v1);
        testGraph.addVertex(v2);
        testGraph.addVertex(v3);
        testGraph.addVertex(v4);
        testGraph.addVertex(v5);
        
        testGraph.addEdge(edge12);
        testGraph.addEdge(edge21);
        
        testGraph.addEdge(edge15);
        testGraph.addEdge(edge51);
        
        testGraph.addEdge(edge25);
        testGraph.addEdge(edge52);
        
        testGraph.addEdge(edge35);
        testGraph.addEdge(edge53);
        
        testGraph.addEdge(edge45);
        testGraph.addEdge(edge54);
        
        
                   
    }
    
    @Test
    public void TestVertex() {
    	assertNotEquals(v1, v2);
    	assertNotEquals(obj, v1);
    	assertNotEquals(v2, new Vertex<>(null));
    	assertNotEquals(v3, new Vertex<>());
    	assertNotEquals(v1, obj);
    	assertEquals(v1, new Vertex<>(1));
    	
    	
    }
    
    @Test
    public void TestEdge() {
    	assertNotEquals(edge12, edge21);
    	assertNotEquals(edge15, edge21);
    	assertNotEquals(edge12, null);
    	assertNotEquals(edge12, new Edge(null, null));
    	assertNotEquals(edge12, obj);
    	assertEquals(edge12, new Edge(v1, v2));
    }
    
    
    @Test
    public void TestEqualMembersVertex() {
    	
    	Set<Vertex> testSetVertex = new HashSet<Vertex>();
    	
    	testSetVertex.add(v1);
    	testSetVertex.add(v2);
    	testSetVertex.add(v3);
    	testSetVertex.add(v4);
    	testSetVertex.add(v5);
    	
    	testGraph.addVertex(null);
    	testGraph.addVertex(v5);
    	testGraph.addVertex(v4);
    	
    	assertEquals(testGraph.getVertices(), testSetVertex);
    	assertEquals(new Graph().getVertices(), new HashSet<>());
    	
    	assertEquals(testGraph.getVertexNumber(), 5);
    	assertEquals(new Graph().getVertexNumber(), 0);
         
    }
    
    @Test
	public void testEqualMembersEdge(){
		
		Set<Edge> testSetEdges = new HashSet<Edge>();
		
		testSetEdges.add(edge12);
    	testSetEdges.add(edge21);
         
        testSetEdges.add(edge15);
        testSetEdges.add(edge51);
         
        testSetEdges.add(edge25);
        testSetEdges.add(edge52);
         
        testSetEdges.add(edge35);
        testSetEdges.add(edge53);
         
        testSetEdges.add(edge45);
        testSetEdges.add(edge54);
        
        testGraph.addEdge(null);
        testGraph.addEdge(edge45);
        testGraph.addEdge(edge54);
        
        assertEquals(testGraph.getEdges(), testSetEdges);
        assertEquals(new Graph().getEdges(), new HashSet<>());
        assertEquals(testGraph.getEdgeNumber(), 10);
        
        assertEquals(false, testGraph.isWeighted());
        
        
	}
    @Test
    public void testGetVertex() {
    	Integer notInTestGraph = new Integer(20);
    	
    	assertEquals(testGraph.getVertex(1), v1);
    	assertEquals(testGraph.getVertex(null), null);
    	assertEquals(testGraph.getVertex(notInTestGraph), null);
    	
    }
    
    


}