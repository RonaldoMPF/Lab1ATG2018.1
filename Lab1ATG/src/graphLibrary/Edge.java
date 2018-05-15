package graphLibrary;

import java.util.Comparator;

public class Edge implements Comparable<Edge>{

	public static final Float DEFAULT_WEIGHT = 1f;

	private Vertex u;
	private Vertex v;
	private Float weight;

	public Edge(Vertex u, Vertex v, Float weight) {
		this.u = u;
		this.v = v;

		if (weight == null) {
			this.weight = Edge.DEFAULT_WEIGHT;
		} else {
			this.weight = weight;
		}
	}

	public Edge(Vertex u, Vertex v) {
		this(u, v, null);
	}

	public Vertex getFirstVertice() {
		return u;
	}

	public Vertex getSecondVertice() {
		return v;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Edge o) {
		return this.weight.compareTo(o.getWeight());
	}
}
