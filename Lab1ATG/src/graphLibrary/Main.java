package graphLibrary;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		try {
			Graph<Integer> graph = GraphReader.readGraph("/home/klynger/dev/Lab1ATG2018.1/Lab1ATG/src/graphLibrary/data.txt");
			System.out.println(graph.graphRepresentation(Representation.AL));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
