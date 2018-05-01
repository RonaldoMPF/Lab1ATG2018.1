package graphLibrary;

public class Edge {
	
	public static final Float DEFAULT_WEIGHT = 1f;
	
	private int u;
	private int v;
	private Float weight;
	
	public Edge(int u, int v, Float weight) {
		this.u = u;
		this.v = v;
		
		if (weight == null) {
			this.weight = Edge.DEFAULT_WEIGHT;
		} else {
			this.weight = weight;
		}
	}
	
	public Edge(int u, int v) {
		this(u, v, null);
	}
	
	public int getFirstVertice() {
		return u;
	}
	
	public int getSecondVertice() {
		return v;
	}
	
	public Float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}

}
