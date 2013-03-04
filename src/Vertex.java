import java.util.ArrayList;

public class Vertex extends Object {
	

	private double x;
	private double y;
	private ArrayList<Vertex> neighbors;
	
	public Vertex(double x, double y) {
		this.x = x;
		this.y = y;
		this.neighbors = new ArrayList<Vertex>();
	}
	
	public void addNeighbor(Vertex v){
		neighbors.add(v);
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	public ArrayList<Vertex> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(ArrayList<Vertex> neighbors) {
		this.neighbors = neighbors;
	}
	
	public void print() {
		System.out.println(x + "," + y);
	}
	
}
