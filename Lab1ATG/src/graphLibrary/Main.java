package graphLibrary;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		String basePath = new File("Lab1ATG/src/graphLibrary/data.txt").getAbsolutePath();

		try {
			Graph<Integer> graph = GraphReader.readGraph(basePath);
			System.out.println(graph.graphRepresentation(Representation.AL));
			System.out.println(graph.graphRepresentation(Representation.AM));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
