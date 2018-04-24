package biblegraph;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadGraph {
	
	private BufferedReader br;
	
	
	
	public ReadGraph(BufferedReader br) {
		this.br = br;
	}



	public void readGraph(String path) {
		try {
			br = new BufferedReader(new FileReader(path));
			String line = br.readLine();
			
			int numberVertex = Integer.parseInt(line);
			
			while (line != null) {
				line = br.readLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
