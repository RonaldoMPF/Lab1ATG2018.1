package graphLibrary;

import java.util.*;

public class Graph {

	private Set<Vertex<Integer>> vertices;
	private Set<Edge> edges;
	private Map<Vertex, Set<Vertex>> adjVertices;

	public Graph() {
		vertices = new HashSet<>();
		edges = new HashSet<>();
		adjVertices = new HashMap<>();
	}

	public Set<Vertex<Integer>> getVertices() { return vertices; }

	public Set<Vertex> getAdjVertices(Vertex v) { return adjVertices.get(v); }

	public Set<Edge> getEdges() { return edges; }

	public boolean addVertex(Vertex vertex) {
		return vertices.add(vertex);
	}


	public boolean addEdge(Edge edge) {
		if (edges.add(edge)) {

			Vertex v1 = edge.getFirstVertice();
			Vertex v2 = edge.getSecondVertice();

			adjVertices.putIfAbsent(v1, new HashSet<>());
			adjVertices.putIfAbsent(v2, new HashSet<>());

			adjVertices.get(v1).add(v2);
			adjVertices.get(v2).add(v1);
			return true;
		}
		return false;

	}


	public String graphRepresentation(Representation type) {
		String result = null;

		if (type.equals(Representation.AL)) {
			result = generateAL();
		}else if (type.equals(Representation.AM)){
			result = generateAM();
		}

		return result;
	}

	private String generateAL() {
		String result = "";

		for (Vertex v1 : vertices) {
			String line = String.format("%d -", v1.getData());

			for (Vertex v2 : adjVertices.get(v1)) {
				line += (" " + v2.getData());
			}

			result += (line + "\n");
		}

		return result;
	}

	private String generateAM() {
		String result = "";
		String line = "  ";

		for (Vertex v: vertices) {
			line += String.format("%d ", v.getData());
		}
		result += (line + "\n");

		for (Vertex v1: vertices) {
			line = String.format("%d ", v1.getData());

			for (Vertex v2: vertices){
				if (adjVertices.get(v1).contains(v2)){
					line += "1 ";
				} else {
					line += "0 ";
				}
			}

			result += (line + "\n");
		}

		return result;
	}

}
