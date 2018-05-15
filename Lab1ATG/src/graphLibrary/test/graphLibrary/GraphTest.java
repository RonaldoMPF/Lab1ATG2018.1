package graphLibrary;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

public class GraphTest {
	 
    Vertex<Integer> v1;
    Vertex<Integer> v2;
    Vertex<Integer> v3;
    Vertex<Integer> v4;
    Vertex<Integer> v5;
    Vertex<Integer> v6;
    Vertex<Integer> v7;
    Vertex<Integer> v8;
    Vertex<Integer> v9;
    Vertex<Integer> v10;
     
    Edge edge12;
    Edge edge21;
     
    Edge edge15;
    Edge edge51;
     
    Edge edge25;
    Edge edge52;
     
    Edge edge34;
    Edge edge43;
     
    Edge edge35;
    Edge edge53;
     
    Edge edge54;
    Edge edge45;
     
    //Grafo 2
    Edge gedge12;
    Edge gedge21;
     
    Edge gedge19;
    Edge gedge91;
     
    Edge gedge93;
    Edge gedge39;
     
    Edge gedge97;
    Edge gedge79;
     
    Edge gedge34;
    Edge gedge43;
     
    Edge gedge35;
    Edge gedge53;
     
    Edge gedge36;
    Edge gedge63;
     
    Edge gedge76;
    Edge gedge67;
     
    Edge gedge78;
    Edge gedge87;
     
    Edge gedge58;
    Edge gedge85;
     
     
    Object obj;
    Graph testGraph;
    Graph graph2;
     
    Set<Vertex<Integer>> testSetVertex;
 
    @Before
    public void createGraphNotWeight (){
         
        v1 = new Vertex<Integer>(1);
        v2 = new Vertex<Integer>(2);
        v3 = new Vertex<Integer>(3);
        v4 = new Vertex<Integer>(4);
        v5 = new Vertex<Integer>(5);
        v6 = new Vertex<Integer>(6);
        v7 = new Vertex<Integer>(7);
        v8 = new Vertex<Integer>(8);
        v9 = new Vertex<Integer>(9);
        v10 = new Vertex<Integer>(10);
         
        obj = new Object();
         
        edge12 = new Edge(v1, v2);
        edge21 = new Edge(v2, v1);
         
        edge15 = new Edge(v1, v5);
        edge51 = new Edge(v5, v1); 
         
        edge25 = new Edge(v2, v5);
        edge52 = new Edge(v5, v2);
         
        edge34 = new Edge(v3, v4);
        edge43 = new Edge(v4, v3);
          
        edge35 = new Edge(v3, v5);
        edge53 = new Edge(v5, v3);
         
        edge54 = new Edge(v5, v4);
        edge45 = new Edge(v4, v5);
         
        //Grafo 2
         
        gedge12 = new Edge(v1, v2);
        gedge21 = new Edge(v2, v1);
         
        gedge19 = new Edge(v1, v9);
        gedge91 = new Edge(v9, v1);
         
        gedge93 = new Edge(v9, v3);
        gedge39 = new Edge(v3, v9);
         
        gedge97 = new Edge(v9, v7);
        gedge79 = new Edge(v7, v9);
         
        gedge34 = new Edge(v3, v4);
        gedge43 = new Edge(v4, v3);
         
        gedge35 = new Edge(v3, v5);
        gedge53 = new Edge(v5, v3);
         
        gedge36 = new Edge(v3, v6);
        gedge63 = new Edge(v6, v3);
         
        gedge76 = new Edge(v7, v6);
        gedge67 = new Edge(v6, v7);
         
        gedge78 = new Edge(v7, v8);
        gedge87 = new Edge(v8, v7);
         
        gedge58 = new Edge(v5, v8);
        gedge85 = new Edge(v8, v5);
         
        testGraph = new Graph(0);
        graph2 = new Graph(9);
         
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
         
        //Grafo 2
        graph2.addVertex(v1);
        graph2.addVertex(v2);
        graph2.addVertex(v3);
        graph2.addVertex(v4);
        graph2.addVertex(v5);
        graph2.addVertex(v6);
        graph2.addVertex(v7);
        graph2.addVertex(v8);
        graph2.addVertex(v9);
         
        graph2.addEdge(gedge12);
        graph2.addEdge(gedge21);
         
        graph2.addEdge(gedge19);
        graph2.addEdge(gedge91);
         
        graph2.addEdge(gedge93);
        graph2.addEdge(gedge39);
         
        graph2.addEdge(gedge97);
        graph2.addEdge(gedge79);
         
        graph2.addEdge(gedge34);
        graph2.addEdge(gedge43);
         
        graph2.addEdge(gedge35);
        graph2.addEdge(gedge53);
         
        graph2.addEdge(gedge36);
        graph2.addEdge(gedge63);
         
        graph2.addEdge(gedge76);
        graph2.addEdge(gedge67);
         
        graph2.addEdge(gedge78);
        graph2.addEdge(gedge87);
         
        graph2.addEdge(gedge58);
        graph2.addEdge(gedge85);  
         
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
         
        Set<Vertex> testSetVertex = new HashSet<Vertex>(10);
         
        testSetVertex.add(v1);
        testSetVertex.add(v2);
        testSetVertex.add(v3);
        testSetVertex.add(v4);
        testSetVertex.add(v5);
        
        
         
        testGraph.addVertex(null);
        testGraph.addVertex(v5);
        testGraph.addVertex(v4);
        
        System.out.println(testGraph.getVertices().toString());
        System.out.println(testSetVertex.toString());
        
        assertEquals(testGraph.getVertices(), testSetVertex);
        assertEquals(new Graph(0).getVertices(), new HashSet<>());
         
        assertEquals(testGraph.getVertexNumber(), 5);
        assertEquals(new Graph(0).getVertexNumber(), 0);
          
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
     
    @Test
    public void testBFS() {
         
         String outputtestGraph = "1 - 0 -\n" +
                                 "2 - 1 1\n" +
                                 "5 - 1 1\n" +
                                 "3 - 2 5\n" +
                                 "4 - 2 5\n";
 
         String outputgraph2 = "1 - 0 -\n" +
                 "2 - 1 1\n" +
                 "9 - 1 1\n" +
                 "3 - 2 9\n" +
                 "7 - 2 9\n" +
                 "4 - 3 3\n" +
                 "5 - 3 3\n" +
                 "6 - 3 3\n" +
                 "8 - 4 5\n";
         assertEquals(testGraph.bfs(v1), outputtestGraph);
          
         
    }
     
    @Test
    public void testDFS() {
         String outputtestGraph = "1 - 0 -\n" +
                 "2 - 0 1\n" +
                 "5 - 1 2\n" +
                 "3 - 2 5\n" +
                 "4 - 2 5\n";
          
         String outputgraph2 = "1 - 0 -\n" +
                 "2 - 0 1\n" +
                 "9 - 0 1\n" +
                 "3 - 1 9\n" +
                 "4 - 2 3\n" +
                 "5 - 2 3\n" +
                 "8 - 3 5\n" +
                 "7 - 4 8\n" +
                 "6 - 5 7\n";
          
         assertEquals(testGraph.dfs(v1), outputtestGraph);
         assertEquals(graph2.dfs(v1), outputgraph2);
    }
     
    @Test
    public void testConnected() {
        assertEquals(testGraph.connected(), true);
        assertEquals(graph2.connected(), true);
    }
}