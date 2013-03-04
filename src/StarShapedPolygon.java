import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;




public class StarShapedPolygon {
	
	private ArrayList<StarShapedVertex> vertices;

	public StarShapedPolygon(ArrayList<StarShapedVertex> vertices) {
		assert vertices.size() < 3;
		setVertices(vertices);
		initEdges();
		triangulate();
		colorVertices();
		constructStar();
	}
	
	public ArrayList<StarShapedVertex> getVertices() {
		return vertices;
	}

	public void setVertices(ArrayList<StarShapedVertex> vertices) {
		this.vertices = vertices;
	}

	private void triangulate(){
		
	}
	
	private void initEdges() {
		StarShapedVertex end = vertices.get(vertices.size() - 1);
		StarShapedVertex start = vertices.get(0);
		
		start.addNeighbor(end);
		end.addNeighbor(start);
		for (int i = 1; i < vertices.size(); ++i) {
			vertices.get(i).addNeighbor(vertices.get(i-1));
			vertices.get(i-1).addNeighbor(vertices.get(i));
		}
	}
	
	
	private void colorVertices(){
		
	}
	
	private void constructStar(){
		
	}
	


}
