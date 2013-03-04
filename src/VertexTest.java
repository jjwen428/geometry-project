import static org.junit.Assert.*;

import org.junit.Test;


public class VertexTest {

	@Test
	public void test() {
		Vertex v1 = new Vertex(1.0, 1.0);
		assertTrue(v1.getNeighbors() == null);
	}

}
