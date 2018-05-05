package graphLibrary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class GraphReader {

	public static Graph readGraph(String filePath) throws IOException {
		Graph graph = null;
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(filePath));

			String line = br.readLine();

			int maxVertices = Integer.parseInt(line);

			graph = new Graph();

			int[] vertices = null;
			while (true) {
				line = br.readLine();
				if (line == null)
					break;
				String[] aux = line.trim().split(" ");

				vertices = Arrays.stream(aux)
						.mapToInt(Integer::parseInt).toArray();

				if (vertices.length != 2) {
					throw new IOException("Expected two vertices per edge");
				}

				Vertex<Integer> v1 = new Vertex(vertices[0]);
				Vertex<Integer> v2 = new Vertex(vertices[1]);
				graph.addVertex(v1);
				graph.addVertex(v2);
				Edge edge = new Edge(v1, v2);
				graph.addEdge(edge);
			}


		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				br.close();
			}
		}

		return graph;
	}
}
