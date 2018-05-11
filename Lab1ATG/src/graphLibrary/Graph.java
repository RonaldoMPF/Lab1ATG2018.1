package graphLibrary;

import java.util.*;

public class Graph {

	private Set<Vertex<Integer>> vertices;
	private Set<Edge> edges;
	private Map<Vertex, Set<Vertex>> adjVertices;
	private boolean isWeighted;

	public Graph() {
		vertices = new HashSet<>();
		edges = new HashSet<>();
		adjVertices = new HashMap<>();
		isWeighted = false;
	}

	public Vertex getVertex(Integer data){
		for (Vertex v : vertices){
			if(v.getData().equals(data)){
				return v;
			}
		}
		return null;
	}

	public boolean isWeighted() {
		return isWeighted;
	}

	public void setVisitedVertex (Vertex vertex, boolean status){
		for (Vertex v : vertices){
			if(v.equals(vertex)){
				v.setVisited(true);
			}
		}
	}

	public Set<Vertex<Integer>> getVertices() { return vertices; }

	public Set<Vertex> getAdjVertices(Vertex v) { return adjVertices.get(v); }

	public Set<Edge> getEdges() { return edges; }

	public int getVertexNumber() {
		return getVertices().size();
	}

	public int getEdgeNumber() {

		return getEdges().size();
	}

	public float getMeanEdge() {
		return (2 * getEdgeNumber()) / getVertexNumber();
	}


	public boolean addVertex(Vertex vertex) {
		return vertices.add(vertex);
	}


	public boolean addEdge(Edge edge) {
		if (edges.add(edge)) {
			if(edge.getWeight() != 1){
				isWeighted = true;
			}

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

	/**
	 * Generates the Adjacency List of this graph
	 * @return
	 */
	private String generateAL() {
		String result = "";

		if (isWeighted()) {
			for (Vertex v : vertices) {
				String line = String.format("%d -", v.getData());

				for (Edge edge : edges) {
					if (edge.getFirstVertice().equals(v)) {
						line += (" " + edge.getSecondVertice().getData() + "(" + edge.getWeight() + ")");
					}
					if (edge.getSecondVertice().equals(v)) {
						line += (" " + edge.getFirstVertice().getData() + "(" + edge.getWeight() + ")");
					}

				}

				result += (line + "\n");
			}
		}else {
			for (Vertex v1 : vertices) {
				String line = String.format("%d -", v1.getData());

				for (Vertex v2 : adjVertices.get(v1)) {
					line += (" " + v2.getData());
				}

				result += (line + "\n");
			}
		}
		return result;
	}

	/**
	 * Generates the Adjacency Matrix of this graph
	 * @return String
	 */
	private String generateAM() {
		String result = "";
		String line = "  ";

		if (isWeighted()){

		}else {

			for (Vertex v : vertices) {
				line += String.format("%d ", v.getData());
			}
			result += (line + "\n");

			for (Vertex v1 : vertices) {
				line = String.format("%d ", v1.getData());

				for (Vertex v2 : vertices) {
					if (adjVertices.get(v1).contains(v2)) {
						line += "1 ";
					} else {
						line += "0 ";
					}
				}

				result += (line + "\n");
			}
		}
		return result;
	}

	/**
	 *
	 * Generates a Depth-First Search Tree and return as
	 *
	 * @param v root of the DFS
	 * @return String, where each line is
	 * 	 * the "data - level parent" of a vertex
	 */
	public String dfs(Vertex v) {
		Integer level = 0;
		String result = "";

		setVisitedVertex(v, true);
		result += v.getData()+" - "+level+" "+" -\n";

		for(Vertex vertex: getAdjVertices(v)){
			if (!getVertex((Integer) vertex.getData()).getVisited()){
				result += dfsUtil(vertex, level, v);
			}
		}

		for (Vertex vertex : vertices){
			setVisitedVertex(vertex, false);
		}
		return result;
	}

	/**
	 * It's used to help the generation of the DFS, it's just called by dfs(Vertex v)
	 *
	 * @param v vertex
	 * @param l the actual level
	 * @param parent the parent of the v vertex
	 * @return Part of the complete DFS
	 */
	private String dfsUtil(Vertex v, Integer l, Vertex parent){
		String result = "";
		Integer level = l;

		setVisitedVertex(v, true);
		result += v.getData()+" - "+level+" "+parent.getData()+"\n";
		level++;

		for(Vertex vertex: getAdjVertices(v)){
			if (!getVertex((Integer) vertex.getData()).getVisited()){
				result += dfsUtil(vertex, level, v);
			}
		}
		return result;
	}

	/**
	 * Generates a Breadth-First Search Tree
	 * @param vertex is the root of the tree
	 * @return String, where each line is
	 * the "data - level parent" of a vertex
	 */
	public String bfs(Vertex vertex){
		Map<Vertex, Integer> visited = new HashMap<>();
		Queue<Vertex> queue = new LinkedList<>();
		Set<Vertex> completed = new HashSet<>();
		String result = "";

		((LinkedList<Vertex>) queue).addFirst(vertex);

		Integer level = 0;

		while (! queue.isEmpty()){
			Vertex head = ((LinkedList<Vertex>) queue).removeFirst();
			if (! visited.containsKey(head)){
				result += head.getData()+" - "+ level+" -\n";
			}
			visited.putIfAbsent(head, level);

			for (Vertex adj : getAdjVertices(head)){
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

}
