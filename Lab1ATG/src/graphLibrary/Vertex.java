package graphLibrary;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * This class is a representation of a vertex in a graph. Might
 * not be needed.
 * 
 * @author klynger
 *
 * @param <T> Type of data that the vertex will hold
 */
public class Vertex<T> {
	private List<Vertex<T>> connections;
	private T data;
	
	public Vertex(T data) {
		this.data = data;
		this.connections = new ArrayList<Vertex<T>>();
	}
		
	public Vertex() {
		this(null);
	}
	
	void connect(Vertex<T> vertex) {
		this.connections.add(vertex);
		vertex.getConnections().add(this);
	}
	
	public T getData() {
		return data;
	}
	
	public List<Vertex<T>> getConnections() {
		return connections;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((connections == null) ? 0 : connections.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		
		Vertex<T> vertex = (Vertex<T>) obj;
		
		if (data != null) {
			return data.equals(vertex.data) && this.connections.equals(vertex.connections);
		} else if (vertex.getData() != null) {
			return false;
		}
		
		return this.connections.equals(vertex.connections);
		
	}
}