package graphLibrary;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String basePath = new File("src/graphLibrary/data.txt").getAbsolutePath();
		Graph graph;

		try {
			graph = GraphReader.readGraph(basePath);
			Vertex v = graph.getVertices().iterator().next();
			System.out.println(graph.graphRepresentation(Representation.AL));
			System.out.println(graph.graphRepresentation(Representation.AM));
			System.out.println(graph.bfs(v));
			System.out.println("DFS\n"+GraphManager.dfs(graph, v));
		} catch (IOException e) {
			e.printStackTrace();
		}



		Graph graph2 = new Graph();
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
		System.out.println(graph2.bfs(v1));
		System.out.println("DFS\n"+GraphManager.dfs(graph2, v1));
//
//		System.out.println(graph2.graphRepresentation(Representation.AL));
	}

}
