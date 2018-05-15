package graphLibrary;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((u == null) ? 0 : u.hashCode());
		result = prime * result + ((v == null) ? 0 : v.hashCode());
		result = prime * result + ((weight == null) ? 0 : weight.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Edge other = (Edge) obj;
		if (u == null) {
			if (other.u != null)
				return false;
		} else if (!u.equals(other.u))
			return false;
		if (v == null) {
			if (other.v != null)
				return false;
		} else if (!v.equals(other.v))
			return false;
		if (weight == null) {
			if (other.weight != null)
				return false;
		} else if (!weight.equals(other.weight))
			return false;
		return true;
	}

	@Override
	public int compareTo(Edge o) {
		return this.weight.compareTo(o.getWeight());
	}
	
	

}
