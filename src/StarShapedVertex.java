

public class StarShapedVertex extends Vertex {
	
	public enum Color {
	     RED, BLUE, GREEN
	}
	
	public enum Type {
		START, END, REGULAR, SPLIT, MERGE
	}
	
	private Color color;
	private Type type;

	public StarShapedVertex(double x, double y) {
		super(x, y);
		color = null;
		type = null;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
