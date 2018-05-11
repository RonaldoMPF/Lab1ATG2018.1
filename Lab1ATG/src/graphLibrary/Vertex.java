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
	private T data;
	private boolean visited; // Variable used for generate DFS

	public Vertex(T data) {
		this.data = data;
		this.visited = false;
	}

	public Vertex() {
		this(null);
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public boolean getVisited() { return visited; }

	public void setVisited(boolean status) { this.visited = status;	}

	@Override
	public int hashCode() {
		return (Integer) data;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;

		Vertex<T> vertex = (Vertex<T>) obj;

		return (vertex.getData() != null && this.data == vertex.getData());


	}
}