import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class StarShapedPolygonTest {

	@Test
	public void initEdge() {
		ArrayList<StarShapedVertex> vertices = new ArrayList<StarShapedVertex>();
		StarShapedVertex v1 = new StarShapedVertex(1.0, 1.0);
		StarShapedVertex v2 = new StarShapedVertex(2.0, 0.0);
		StarShapedVertex v3 = new StarShapedVertex(1.0, -1.0);
		
		vertices.add(v1);
		vertices.add(v2);
		vertices.add(v3);
		
		StarShapedPolygon poly = new StarShapedPolygon(vertices);
		vertices = poly.getVertices();

		assertTrue(v1.getNeighbors().contains(v2));
		assertTrue(v1.getNeighbors().contains(v3));
		assertTrue(v2.getNeighbors().contains(v1));
		assertTrue(v2.getNeighbors().contains(v3));
		assertTrue(v3.getNeighbors().contains(v1));
		assertTrue(v3.getNeighbors().contains(v2));
		assertTrue(true);
	}

}
