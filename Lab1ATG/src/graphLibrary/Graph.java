package graphLibrary;

import java.util.ArrayList;
import java.util.List;

public class Graph<T> {
	
	private List<Vertex<Integer>> vertices;
	
	public Graph(int maxVertices) {
		vertices = new ArrayList<>(maxVertices + 1);
		
		for (int i = 0; i <= maxVertices; i++) {
			vertices.add(new Vertex<Integer>(i));
		}
	}
	
	public void addEdge(int u, int s) {
		vertices.get(u).connect(vertices.get(s));
	}
	
	public List<Vertex<Integer>> getVertices() {
		return vertices;
	}
	
	public String graphRepresentation(Representation type) {
		String result = null;
		
		if (type.equals(Representation.AL)) {
			result = generateAL();
		} else if (type.equals(Representation.AM)) {
			result = generateAM();
		}
		
		return result;
	}
	
	private String generateAL() {
		String result = "";
		
		for (int i = 1; i < vertices.size(); i++) {
			String line = String.format("%d -", i);
			
			for (int j = 0; j < vertices.get(i).getConnections().size(); j++) {
				line += (" " + vertices.get(i).getConnections().get(j).getData().toString());
			}
			
			result += (line + "\n");
		}
		
		return result;
	}

	private String generateAM() {
		String result = "";
		String line = "  ";

		for (int i = 1; i < vertices.size(); i++) {
            line += String.format("%d ", i);
        }
        result += (line + "\n");

        for (int i = 1; i < vertices.size(); i++) {
            line = String.format("%d ", i);

		    for (int j = 1; j < vertices.size(); j++){
		        if (vertices.get(i).getConnections().contains(vertices.get(j))){
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
